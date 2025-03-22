package br.inatel.dm112.logistica.logistica_dm112.services.impl;

import org.springframework.stereotype.Service;

import br.inatel.dm112.logistica.logistica_dm112.interfaces.AuthenticationService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    public String authenticateDeliveryPerson(String username, String password) {
        return "Authenticated: " + username;
    }
}
