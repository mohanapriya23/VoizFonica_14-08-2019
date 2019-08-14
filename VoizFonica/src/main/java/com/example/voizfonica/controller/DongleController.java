package com.example.voizfonica.controller;


import com.example.voizfonica.data.DonglePlanRepository;
import com.example.voizfonica.model.DonglePlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;


import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/dongle")
public class DongleController {
    @Autowired
    private DonglePlanRepository dongleplanrepo;

    @GetMapping
    public String show_prepaid(Model model){
        List<DonglePlan> dongleplans = new ArrayList<>();
        dongleplanrepo.findAll().forEach(i -> dongleplans.add(i));
        model.addAttribute("dongleplans",dongleplans);
        return "dongleplan";
    }
}





/* @ModelAttribute
    @GetMapping
    public String showPlans(Model model){
        model.addAttribute("dongleplans",new DonglePlans());
        return "plans";
    }
    @PostMapping
    public String processPlans(@Valid DonglePlans dongleplans, Errors errors) {
        if (errors.hasErrors()) {
            return "plans";
        }
        donglerepo.save(dongleplans);
        return "redirect:/payment";
    }
}*/
