package com.modelo;

public class Livraria {
    private int ID;
    private String nome;
    private String email;
    private int estoqueLivros;
    private int totalClientes;
    private int totalVen;
    private int CNPJ;
    private Endereco endereco;

    public Livraria(int id, int est, int cnpj, Endereco en, String n, String e) {
        totalClientes = 0;
        totalVen = 0;
        nome = n;
        email = e;
        CNPJ = cnpj;
        endereco = en;
        estoqueLivros = est;
    }

    @Override
    public String toString() {
        return "Detalhes da Livraria:\n " +
                "Nome: " + nome + "\n Contato: " + email + "\n Endereço: " + endereco +"\n CNPJ: " + CNPJ
                + "\n Número de Livros em Estoque: " + estoqueLivros + "\n Total de Vendas: " + totalVen;
    }
    public int getID() {
        return ID;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String novoEmail) {
        this.email = novoEmail;
    }
    public int getEstoqueLivros() {
        return estoqueLivros;
    }
    public int getTotalClientes() {
        return totalClientes;
    }
    public int getTotalVen() {
        return totalVen;
    }
    public int getCNPJ() {
        return CNPJ;
    }
    public void setCNPJ(int novoCNPJ) {
        this.CNPJ = novoCNPJ;
    }
}