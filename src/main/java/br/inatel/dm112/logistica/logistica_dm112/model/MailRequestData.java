package br.inatel.dm112.logistica.logistica_dm112.model;

public class MailRequestData {

    private int orderNumber;
    private String to;
    private String content;

    public MailRequestData() {
    }

    public MailRequestData(int orderNumber, String to) {
        this.orderNumber = orderNumber;
        this.to = to;
        this.content = "Order with number" + orderNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getTo() {
        return to;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "MailRequestData [orderNumber=" + orderNumber + ", to=" + to + "]";
    }

}
