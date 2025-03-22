package br.inatel.dm112.logistica.logistica_dm112.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.inatel.dm112.logistica.logistica_dm112.interfaces.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
    public List<String> fetchOrders(String deliveryPersonID) {
        return List.of("Order1", "Order2");
    }
}