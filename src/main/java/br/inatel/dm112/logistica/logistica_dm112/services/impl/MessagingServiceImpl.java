package br.inatel.dm112.logistica.logistica_dm112.services.impl;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.google.appengine.repackaged.com.google.api.client.util.Value;

import br.inatel.dm112.logistica.logistica_dm112.interfaces.MessagingService;
import br.inatel.dm112.logistica.logistica_dm112.model.MailRequestData;
import reactor.core.publisher.Mono;

@Service
public class MessagingServiceImpl implements MessagingService {
    @Value("${utility.rest.email.url}")
    private String restURL;

    @Value("${email.sendToAddress}")
    private String sendToAddress;

    private String mailEndpoint = "/mail";

    public void callSendMailService(int orderNumber, byte[] content) {

        String url = restURL + mailEndpoint;
        System.out.println("URL: " + url);

        MailRequestData mrd = new MailRequestData(orderNumber, sendToAddress);

        WebClient
                .create(url)
                .post()
                .contentType(MediaType.APPLICATION_JSON)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .body(Mono.just(mrd), MailRequestData.class)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class).defaultIfEmpty("")
                .log()
                .block();
    }

    public void setRestURL(String restURL) {
        this.restURL = restURL;
    }

    public void setSendToAddress(String sendToAddress) {
        this.sendToAddress = sendToAddress;
    }

    public String sendDeliveryConfirmationEmail(String orderID, String customerEmail) {
        return "Email sent to " + customerEmail;
    }
}
