package br.inatel.dm112.logistica.logistica_dm112.services;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Utility Services
@RestController
@RequestMapping("/messaging")
class MessagingService {
    @PostMapping("/send-email")
    public String sendDeliveryConfirmationEmail(@RequestParam String orderID, @RequestParam String customerEmail) {
        return "Email sent to " + customerEmail;
    }
}
