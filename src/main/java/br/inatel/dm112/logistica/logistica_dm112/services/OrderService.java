package br.inatel.dm112.logistica.logistica_dm112.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import br.inatel.dm112.logistica.logistica_dm112.model.dao.OrderRepository;
import br.inatel.dm112.logistica.logistica_dm112.services.entity.Order;

public class OrderService {
    @Autowired
    private OrderRepository repo;

    public ArrayList<Order> fetchOrders(String deliverPersonID) {
        // Optional<OrderEntity> orderEntity = repo.findAll(deliverPersonID);
    }

    public void confirmDelivery(String orderID, String recipientCPF, String deliveryDateTime) {
    }

    public void registerDelivery(String orderID, String recipientCPF, String deliveryDateTime) {
    }
}
