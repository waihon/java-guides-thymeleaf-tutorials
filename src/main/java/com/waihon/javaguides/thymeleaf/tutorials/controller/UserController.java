package com.waihon.javaguides.thymeleaf.tutorials.controller;

import com.waihon.javaguides.thymeleaf.tutorials.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/users")
    public String users(Model model) {
        User admin = new User("Admin", "admin@example.com", "ADMIN", "Male");
        User john = new User("John", "john@example.com", "USER", "Male");
        User jane = new User("Jane", "jane@example.com", "USER", "Female");

        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(john);
        users.add(jane);

        model.addAttribute("users", users);

        return "users";
    }

}
