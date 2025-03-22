package br.inatel.dm112.logistica.logistica_dm112.interfaces;

import java.util.List;

public interface DeliveryManagementService {
    List<String> retrieveOrders(String deliveryPersonID);

    String confirmDelivery(String orderID, String recipientCPF, String deliveryDateTime);
}
