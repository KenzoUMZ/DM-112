package br.inatel.dm112.logistica.logistica_dm112.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LogisticsRest {

    private final OrderService orderService;
    private final DeliveryManagement deliveryManagement;
    private final DeliveryService deliveryService;
    private final MessagingService messagingService;
    private final AuthenticationService authenticationService;
    private final AuditingService auditingService;

    public LogisticsRest(
            OrderService orderService,
            DeliveryManagement deliveryManagement,
            DeliveryService deliveryService,
            MessagingService messagingService,
            AuthenticationService authenticationService,
            AuditingService auditingService) {
        this.orderService = orderService;
        this.deliveryManagement = deliveryManagement;
        this.deliveryService = deliveryService;
        this.messagingService = messagingService;
        this.authenticationService = authenticationService;
        this.auditingService = auditingService;
    }

    @GetMapping("/orders/{deliveryPersonID}")
    public List<String> fetchOrders(@PathVariable String deliveryPersonID) {
        return orderService.fetchOrders(deliveryPersonID);
    }

    @GetMapping("/delivery-management/retrieve/{deliveryPersonID}")
    public List<String> retrieveOrders(@PathVariable String deliveryPersonID) {
        return deliveryManagement.retrieveOrders(deliveryPersonID);
    }

    @PostMapping("/delivery-management/confirm")
    public String confirmDelivery(@RequestParam String orderID, @RequestParam String recipientCPF,
            @RequestParam String deliveryDateTime) {
        return deliveryManagement.confirmDelivery(orderID, recipientCPF, deliveryDateTime);
    }

    @PostMapping("/delivery/register")
    public String registerDelivery(@RequestParam String orderID, @RequestParam String recipientCPF,
            @RequestParam String deliveryDateTime) {
        return deliveryService.registerDelivery(orderID, recipientCPF, deliveryDateTime);
    }

    @PostMapping("/messaging/send-email")
    public String sendDeliveryConfirmationEmail(@RequestParam String orderID, @RequestParam String customerEmail) {
        return messagingService.sendDeliveryConfirmationEmail(orderID, customerEmail);
    }

    @PostMapping("/auth/authenticate")
    public String authenticateDeliveryPerson(@RequestParam String username, @RequestParam String password) {
        return authenticationService.authenticateDeliveryPerson(username, password);
    }

    @PostMapping("/audit/log")
    public String logEvent(@RequestParam String operation, @RequestParam String user, @RequestParam String timestamp) {
        return auditingService.logEvent(operation, user, timestamp);
    }
}
