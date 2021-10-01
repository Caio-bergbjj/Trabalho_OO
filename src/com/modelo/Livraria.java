package com.modelo;

public class Livraria {
    private int ID;
    private String nome;
    private String email;
    private int estoqueLivros;
    private int totalClientes;
    private int totalVendas;
    private int CNPJ;
    private Endereco endereco;
    private Cliente[] clientes = new Cliente[50];
    private Funcionario[] funcionarios = new Funcionario[50];
    private Manga[] mangas = new Manga[50];
    private Revista[] revistas = new Revista[50];
    private Venda[] vendas = new Venda[50];
    private Livro[] livros = new Livro[50];


    public Livraria(int id, int setEstoque, int setCNPJ, Endereco setEndereco, String setNome, String setEmail) {
        totalClientes = 0;
        totalVendas = 0;
        nome = setNome;
        email = setEmail;
        CNPJ = setCNPJ;
        endereco = setEndereco;
        estoqueLivros = setEstoque;
    }

    @Override
    public String toString() {
        return "Detalhes da Livraria:\n " +
                "Nome: " + nome + "\n Contato: " + email + "\n Endereço: " + endereco +"\n CNPJ: " + CNPJ
                + "\n Número de Livros em Estoque: " + estoqueLivros + "\n Total de Vendas: " + totalVendas;
    }
    public int getID() {
        return ID;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setEstoqueLivros(int estoqueLivros) {
        this.estoqueLivros = estoqueLivros;
    }

    public void setTotalClientes(int totalClientes) {
        this.totalClientes = totalClientes;
    }

    public void setTotalVen(int totalVendas) {
        this.totalVendas = totalVendas;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Manga[] getMangas() {
        return mangas;
    }

    public void setMangas(Manga[] mangas) {
        this.mangas = mangas;
    }

    public Revista[] getRevistas() {
        return revistas;
    }

    public void setRevistas(Revista[] revistas) {
        this.revistas = revistas;
    }

    public Venda[] getVendas() {
        return vendas;
    }

    public void setVendas(Venda[] vendas) {
        this.vendas = vendas;
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
        return totalVendas;
    }
    public int getCNPJ() {
        return CNPJ;
    }
    public void setCNPJ(int novoCNPJ) {
        this.CNPJ = novoCNPJ;
    }
}