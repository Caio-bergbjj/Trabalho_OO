package com.company;

import java.util.Date;
import java.util.*;

public class Funcionario extends Pessoa{
    private double salario;
    private Date entrada;


    public String toString() {
        return "Nome do funcionário: " + nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public void setNumID(int numID) {
        this.ID = ID;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int cPF) {
        CPF = cPF;
    }


    public Telefone getNumTel() {
        return numTel;
    }

    public void setNumTel(Telefone numTel) {
        this.numTel = numTel;
    }


}
