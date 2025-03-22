package br.inatel.dm112.logistica.logistica_dm112.interfaces;

public interface AuditingService {
    String logEvent(String operation, String user, String timestamp);
}
