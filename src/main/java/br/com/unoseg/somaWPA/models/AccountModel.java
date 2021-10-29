package br.com.unoseg.somaWPA.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountModel {

    @Id
    private Long id;
    private String name;

    public AccountModel(Long id,String name) {
        this.name = name;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
