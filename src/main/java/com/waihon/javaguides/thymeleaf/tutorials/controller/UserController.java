package com.waihon.javaguides.thymeleaf.tutorials.controller;

import com.waihon.javaguides.thymeleaf.tutorials.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("variable-expression")
    public String variableExpression(Model model) {
        User user = new User("Waihon", "waihon@example.com", "ADMIN", "Male");

        model.addAttribute("user", user);

        return  "variable-expression";
    }

    @GetMapping("selection-expression")
    public String selectionExpression(Model model) {
        User user = new User("Waihon", "waihon@example.com", "ADMIN", "Male");

        model.addAttribute("user", user);

        return  "selection-expression";
    }

    @GetMapping("message-expression")
    public String messageExpression() {
        return "message-expression";
    }

    @GetMapping("link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id", 8);

        return "link-expression";
    }

    @GetMapping("fragment-expression")
    public String fragmentExpression() {
        return "fragment-expression";
    }

}
