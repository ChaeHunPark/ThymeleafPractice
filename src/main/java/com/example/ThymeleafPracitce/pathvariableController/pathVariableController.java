package com.example.ThymeleafPracitce.pathvariableController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/path-variable")
public class pathVariableController {

    @GetMapping("/{orderId}")
    @ResponseBody
    public String getOrderId(@PathVariable("orderId") int orderId) {
        return "id = " + orderId;
    }
}
