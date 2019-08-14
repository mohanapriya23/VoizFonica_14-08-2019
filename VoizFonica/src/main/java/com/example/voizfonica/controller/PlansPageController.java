package com.example.voizfonica.controller;
import com.example.voizfonica.model.PlansPage;
import com.example.voizfonica.model.Register;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/planspage")
@SessionAttributes({"order","login"})
public class PlansPageController {
    @GetMapping
    public String show_dashboard(Model model,    Register register){
        model.addAttribute("register",register.getName());
        return "planspage";
    }
}
