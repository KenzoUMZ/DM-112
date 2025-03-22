package br.inatel.dm112.logistica.logistica_dm112.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.inatel.dm112.logistica.logistica_dm112.interfaces.AuditingService;
import br.inatel.dm112.logistica.logistica_dm112.interfaces.AuthenticationService;
import br.inatel.dm112.logistica.logistica_dm112.services.impl.DeliveryManagementImpl;
import br.inatel.dm112.logistica.logistica_dm112.services.impl.DeliveryServiceImpl;
import br.inatel.dm112.logistica.logistica_dm112.services.impl.MessagingServiceImpl;
import br.inatel.dm112.logistica.logistica_dm112.services.impl.OrderServiceImpl;

@RestController
@RequestMapping("/api")
public class LogisticsRest {

    @Autowired
    private OrderServiceImpl orderService;
    @Autowired
    private DeliveryManagementImpl deliveryManagement;
    @Autowired
    private DeliveryServiceImpl deliveryService;
    @Autowired
    private MessagingServiceImpl messagingService;
    @Autowired
    private AuthenticationService authenticationService;
    @Autowired
    private AuditingService auditingService;


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
                                   @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date deliveryDateTime) {
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

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
