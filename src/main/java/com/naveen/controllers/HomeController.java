package com.naveen.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/doctors")
    public String doctors() {
        return "doctor-appointment";
    }

    @GetMapping("/bookappointment")
    public String bookappointment() {
        return "bookappointment";
    }

    @GetMapping("/patientregistration")
    public String patientregistration() {
        return "patient-registration";
    }

    @GetMapping("/consultations")
    public String consultations() {
        return "doctor-consultation";
    }
}
