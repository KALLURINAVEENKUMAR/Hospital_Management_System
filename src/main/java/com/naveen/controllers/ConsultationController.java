package com.naveen.controllers;

import com.naveen.models.Consultation;
import com.naveen.services.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ConsultationController {

    private final ConsultationService consultationService;

    @Autowired
    public ConsultationController(ConsultationService consultationService) {
        this.consultationService = consultationService;
    }

//    @GetMapping("/consultations")
//    public String getConsultations(Model model) {
//        List<Consultation> consultations = consultationService.getAllConsultations();
//        model.addAttribute("consultations", consultations);
//        return "consultations";
//    }
}
