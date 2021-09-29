package com.company;

import java.util.Date;
import java.util.Random;

public class Cliente extends Pessoa {
    private Date entrada;

    public Cliente(Date entr, String n, int cPF, Telefone numTel, String em) {
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
