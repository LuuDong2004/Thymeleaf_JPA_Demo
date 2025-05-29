package com.example.thymeleaf_demo.controller;


import com.example.thymeleaf_demo.entity.User;
import com.example.thymeleaf_demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "index";
    }

    @PostMapping("/add")
    public String addUser(@RequestParam String name, @RequestParam String email,Model model) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userService.saveUser(user);
        model.addAttribute("message", "User added successfully!");

        return "redirect:/";
    }
    @PostMapping("/delete")
    public String deleteUser(@RequestParam Integer id,Model model){
        userService.deleteUser(id);
        model.addAttribute("message", "User deleted successfully!");
        return "redirect:/";
    }
}
