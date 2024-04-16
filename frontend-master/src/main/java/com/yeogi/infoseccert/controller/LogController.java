package com.yeogi.infoseccert.controller;
/*
import com.yeogi.infoseccert.domain.Log;
import com.yeogi.infoseccert.service.LogService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
*/
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogController {

    /*
    private final LogService logService;

    // 생성자를 통한 의존성 주입
    public LogController(LogService logService) {
        this.logService = logService;
    }

    @GetMapping("/log-management")
    public String showLogManagement(Model model, Pageable pageable) {
        Page<Log> logPage = logService.findAllLogs(pageable); // 서비스를 통해 로그 페이지를 가져옴
        model.addAttribute("logPage", logPage);
        return "logManagement";
    }
     */

    @GetMapping("/log-management")
    public String showPrivacyRequirements() {
        return "logManagement";
    }
}
