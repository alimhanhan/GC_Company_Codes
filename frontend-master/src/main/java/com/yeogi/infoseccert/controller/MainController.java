package com.yeogi.infoseccert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    //기본페이지 요청 메서드
    @GetMapping("/")
    public String main() {
        return "main";
    }

    @GetMapping("/management-system")
    public String showManagementSystem() {
        return "managementSystem";
    }

    @GetMapping("/security-measures")
    public String showSecurityMeasures() {
        return "securityMeasures";
    }

    @GetMapping("/privacy-requirements")
    public String showPrivacyRequirements() {
        return "privacyRequirements";
    }


}
