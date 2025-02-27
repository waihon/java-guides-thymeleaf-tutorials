package com.waihon.javaguides.thymeleaf.tutorials.controller;

import com.waihon.javaguides.thymeleaf.tutorials.model.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {

    @GetMapping("register")
    public String userRegistration(Model model) {
        // Create an empty UserForm object for storing form data
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm);

        List<String> professionList = Arrays.asList("Developer", "Tester", "Architect");
        model.addAttribute("professionList", professionList);

        return "register-form";
    }

    @PostMapping("register/save")
    public String submitForm(Model model,
                             @ModelAttribute("userForm") UserForm userForm) {
        model.addAttribute("userForm", userForm);

        return "register-success";
    }

}
