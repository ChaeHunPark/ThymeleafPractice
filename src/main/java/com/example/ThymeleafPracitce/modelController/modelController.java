package com.example.ThymeleafPracitce.modelController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/model")
public class modelController {

    @GetMapping("")
    public String modelExample (Model model) {

        String model2 = "model2에 매핑한 값입니다.";
        int model3 = 3;
        Model4 model4 = new Model4("model4",4);
        String[] model5 = {"model5", "model6", "model7"};

        model.addAttribute("model1", "model1에 매핑한 값입니다.");
        model.addAttribute("model2", model2);
        model.addAttribute("model3", model3);
        model.addAttribute("model4", model4);
        model.addAttribute("model5", model5[0]);


        return "modelExample1";
    }


    static class Model4 {

        String name;
        int age;

        public Model4(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


}
