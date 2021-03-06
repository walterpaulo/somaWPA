package br.com.unoseg.somaWPA.models;

import java.time.LocalDate;


public class PaymentModel {
    private Long id;

    private AccountModel account;
    private LocalDate entryDate;
    private LocalDate appointmentDate;
    private Boolean paid;


    public PaymentModel(Long id, AccountModel account) {
        this.id = id;
        this.account = account;
        this.entryDate = LocalDate.now();
        this.paid = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Boolean getPaid() {
        return paid;
    }

   public void paidAccount(){
        this.appointmentDate = LocalDate.now();
        this.paid = true;
   }
}
