package br.inatel.dm112.logistica.logistica_dm112.services.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.inatel.dm112.logistica.logistica_dm112.interfaces.DeliveryService;
import br.inatel.dm112.logistica.logistica_dm112.model.dao.LogisticsRepository;
import br.inatel.dm112.logistica.logistica_dm112.model.entities.OrderEntity;

@Service
public class DeliveryServiceImpl implements DeliveryService {
    @Autowired
    private LogisticsRepository logisticsRepository;

    public String registerDelivery(String orderID, String recipientCPF,
                                   Date deliveryDateTime) {
        OrderEntity order = new OrderEntity();
        order.setOrderID(orderID);
        order.setRecipientCPF(recipientCPF);
        order.setDeliveryDateTime(deliveryDateTime);
        logisticsRepository.save(order);
        return "Delivery registered for order " + orderID;
    }

}