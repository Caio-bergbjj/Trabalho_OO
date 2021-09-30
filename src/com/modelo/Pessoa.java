package com.modelo;

public abstract class Pessoa {
    protected int ID;
    protected String nome;
    protected int CPF;
    protected Telefone numTel;
    protected String email;
    protected Endereco endereco;

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getID() {
        return ID;
    }


    public void setID(int ID) {
        this.ID = ID;
    }


    public int getCPF() {
        return CPF;
    }


    public void setCPF(int cPF) {
        this.CPF = cPF;
    }


    public Telefone getNumTel() {
        return numTel;
    }


    public void setNumTel(Telefone numTel) {
        this.numTel = numTel;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }


    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
