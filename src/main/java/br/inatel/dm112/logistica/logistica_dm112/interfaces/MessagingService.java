package br.inatel.dm112.logistica.logistica_dm112.interfaces;

public interface MessagingService {
    String sendDeliveryConfirmationEmail(String orderID, String customerEmail);
}
