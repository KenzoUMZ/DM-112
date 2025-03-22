package br.inatel.dm112.logistica.logistica_dm112.model.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "Pedido")
public class OrderEntity {

    @Id
    @Column(name = "orderID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String orderID;

    @Column(name = "deliveryPersonId", nullable = false)
    private String deliveryPersonId;

    @Column(name = "deliveryDate", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date deliveryDate;

    public OrderEntity() {
    }

    public String setOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getRecipientCPF() {
        return deliveryPersonId;
    }

    public void setRecipientCPF(String CPF) {
        this.deliveryPersonId = CPF;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDateTime(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "OrderEntity [orderID=" + orderID + ", CPF=" + deliveryPersonId + ", deliveryDate=" + deliveryDate + "]";
    }

}
