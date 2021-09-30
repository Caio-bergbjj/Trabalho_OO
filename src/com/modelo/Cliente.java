package com.modelo;

import java.util.Date;

public class Cliente extends Pessoa {
    private Date entrada;

    public Cliente(Date entr, String n, int cPF, Telefone numTel, String email, int id, Endereco endereco) {
        this.entrada = entr;
        this.nome = n;
        this.CPF = cPF;
        this.numID = id;
        this.numTel = numTel;
        this.email = email;
        this.endereco = endereco;


    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

}
