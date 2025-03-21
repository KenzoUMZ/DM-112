package br.inatel.dm112.logistica.logistica_dm112.services;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/audit")
class AuditingService {
    @PostMapping("/log")
    public String logEvent(@RequestParam String operation, @RequestParam String user, @RequestParam String timestamp) {
        return "Event logged: " + operation;
    }
}
