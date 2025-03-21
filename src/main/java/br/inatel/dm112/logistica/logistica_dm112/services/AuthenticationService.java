package br.inatel.dm112.logistica.logistica_dm112.services;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
class AuthenticationService {
    @PostMapping("/authenticate")
    public String authenticateDeliveryPerson(@RequestParam String username, @RequestParam String password) {
        return "Authenticated: " + username;
    }
}
