package br.inatel.dm112.logistica.logistica_dm112.services.impl;

import org.springframework.stereotype.Service;

import br.inatel.dm112.logistica.logistica_dm112.interfaces.AuditingService;

@Service
public class AuditingServiceImpl implements AuditingService {
    public String logEvent(String operation, String user, String timestamp) {
        return "Event logged: " + operation;
    }
}
