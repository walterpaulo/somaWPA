package br.com.unoseg.somaWPA.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class Payment {
    private Long id;
    private String conta;
    private BigDecimal price;
    private LocalDate entryDate;
    private LocalDate paymentDate;
    private Boolean status;

    public Payment(Long id, String conta, BigDecimal price, LocalDate paymentDate) {
        this.id = id;
        this.conta = conta;
        this.price = price;
        this.entryDate = LocalDate.now();
        this.paymentDate = paymentDate;
        this.status = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
