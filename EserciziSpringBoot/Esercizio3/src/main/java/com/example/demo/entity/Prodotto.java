package com.example.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class Prodotto {
    private Long id;
    private String nome;
    private double prezzo;

    public Prodotto(){

    }

    public Prodotto(Long id, double prezzo) {
        this.id = id;
        this.prezzo = prezzo;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
