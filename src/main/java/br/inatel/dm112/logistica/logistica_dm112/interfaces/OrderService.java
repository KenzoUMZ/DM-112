package br.inatel.dm112.logistica.logistica_dm112.interfaces;

import java.util.List;

public interface OrderService {
    List<String> fetchOrders(String deliveryPersonID);
}
