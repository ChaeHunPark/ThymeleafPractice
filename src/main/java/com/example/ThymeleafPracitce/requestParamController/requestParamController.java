package com.example.ThymeleafPracitce.requestParamController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/* @RestController
* 뷰이름을 사용하지 않고 String 그자체를 반환, @ResponseBody로 각 매핑마다 적용가능
* 이어노테이션을 붙이면 @Controller 어노테이션 생략 가능 @RestController = @Controller + @ResponseBody
*/

@Controller
@RequestMapping("/request-param")
public class requestParamController {

    @GetMapping("/1")
    public String showForm() {
        return "requestParamExample/requestParamExampleForm1";
    }

    //@ReqeustParam, 파라미터 값을 추출한다.
    // html의 id값으로 매핑된다.

    @PostMapping("/1")
    @ResponseBody
    public String requestParamExample1(@RequestParam("name") String name, @RequestParam("age") int age) {
        System.out.println(name);
        System.out.println(age);

        return "name = " + name + "<br> age = " + age;

    }

    // ?id=id&name=name

    @GetMapping("")
    @ResponseBody
    public String requestParamExample2(@RequestParam("id") Long id,
                                       @RequestParam("name") String  name) {
        // 처리 로직
        return "ID = " + id + "<br> NAME = " + name;
    }
}
