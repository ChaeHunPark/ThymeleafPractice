package com.example.ThymeleafPracitce.modelAttribueController;

import com.example.ThymeleafPracitce.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/model-attribute")
public class modelAttributeController {

    //데이터를 받아오는 입장.
    //@ModelAttribute는 기본데이터타입 (int, String 등)이나 컬렉션을 지원하지 않는다.
    //객체로 사용가능

    @GetMapping("/1")
    public String showForm(Model model) {
        model.addAttribute("person", new Person()); // th:object의 person에 빈 객체를 매핑한다.
        return "modelAttributeExample/modelAttributeExampleForm1";
    }

    @PostMapping("/1")
    public String modelAttributeExample1(@ModelAttribute Person person) {

        String name = person.getName(); // th:filed의 *{name}"과 매핑됨
        int age = person.getAge();

        // 받아온 데이터 출력
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        return "modelExample/modelAttributeExample1";
    }
}
