package br.inatel.dm112.logistica.logistica_dm112.interfaces;

import java.util.Date;

public interface DeliveryService {
    String registerDelivery(String orderID, String recipientCPF, Date deliveryDateTime);
}
