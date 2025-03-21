package br.inatel.dm112.logistica.logistica_dm112.services;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Task Service
@RestController
@RequestMapping("/delivery")
class DeliveryService {
    @PostMapping("/register")
    public String registerDelivery(@RequestParam String orderID, @RequestParam String recipientCPF,
            @RequestParam String deliveryDateTime) {
        return "Delivery registered for order " + orderID;
    }
}