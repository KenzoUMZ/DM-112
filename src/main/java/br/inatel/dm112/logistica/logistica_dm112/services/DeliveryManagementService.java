package br.inatel.dm112.logistica.logistica_dm112.services;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Orchestration Service
@RestController
@RequestMapping("/delivery-management")
class DeliveryManagement {
    @GetMapping("/retrieve/{deliveryPersonID}")
    public List<String> retrieveOrders(@PathVariable String deliveryPersonID) {
        return List.of("Order1", "Order2");
    }

    @PostMapping("/confirm")
    public String confirmDelivery(@RequestParam String orderID, @RequestParam String recipientCPF,
            @RequestParam String deliveryDateTime) {
        return "Delivery confirmed for order " + orderID;
    }
}