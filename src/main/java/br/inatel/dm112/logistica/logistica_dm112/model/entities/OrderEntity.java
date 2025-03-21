package br.inatel.dm112.logistica.logistica_dm112.model.entities;

import java.util.Date;

import br.inatel.dm112.logistica.logistica_dm112.model.Order.STATUS;
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
    @Column(name = "numero")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer number;

    private String CPF;

    @Column(name = "valor")
    private float value;

    private int status;

    @Column(name = "dataPedido", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date orderDate;

    @Column(name = "dataEmissao", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date issueDate;

    @Column(name = "dataPagamento", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date paymentDate;

    public OrderEntity() {
        this.status = STATUS.FILLED.ordinal();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "OrderEntity [number=" + number + ", CPF=" + CPF + ", value=" + value + ", status=" + status
                + ", orderDate="
                + orderDate + ", issueDate=" + issueDate + ", paymentDate=" + paymentDate + "]";
    }

}
