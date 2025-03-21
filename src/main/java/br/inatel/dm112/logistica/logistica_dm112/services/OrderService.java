package br.inatel.dm112.logistica.logistica_dm112.services;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Entity Service
@RestController
@RequestMapping("/orders")
class OrderService {
    @GetMapping("/{deliveryPersonID}")
    public List<String> fetchOrders(@PathVariable String deliveryPersonID) {
        return List.of("Order1", "Order2");
    }
}