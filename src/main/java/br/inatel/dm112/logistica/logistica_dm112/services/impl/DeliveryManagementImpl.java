package br.inatel.dm112.logistica.logistica_dm112.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.inatel.dm112.logistica.logistica_dm112.interfaces.DeliveryManagementService;

@Service
public class DeliveryManagementImpl implements DeliveryManagementService {
    public List<String> retrieveOrders(String deliveryPersonID) {
        return List.of("Order1", "Order2");
    }

    public String confirmDelivery(String orderID, String recipientCPF,
                                  String deliveryDateTime) {
        return "Delivery confirmed for order " + orderID;
    }
}