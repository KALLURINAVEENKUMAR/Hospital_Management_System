package com.naveen.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/doctors/appointment-page")
    public String doctorAppointment() {
        return "doctor-appointment";
    }

    @GetMapping("/doctors/consultation-page")
    public String doctorConsultation() {
        return "doctor-consultation";
    }
}
