package com.modelo;

import java.util.Date;

public class Funcionario extends Pessoa{
    private double salario;
    private Date entrada;

    public Funcionario(double salario, Date entrada, String n, int CPF, int id, Telefone t, Endereco endereco, String email) {
        this.salario = salario;
        this.entrada = entrada;
        this.nome = n;
        this.numID = id;
        this.numTel = t;
        this.CPF = CPF;
        this.endereco = endereco;
        this.email = email;



    }

    public String toString() {
        return "Nome do funcionário: " + nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

}

