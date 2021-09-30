package com.modelo;

import java.util.Date;

public class Cliente extends Pessoa {
    private Date entrada;

    public Cliente(Date entr, String n, int cPF, Telefone numTel, String en) {
        this.entrada = entr;
        nome = n;

    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }
}
