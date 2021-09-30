package com.modelo;

import java.util.*;

public class Dados {
    private Funcionario[] funcionarios = new Funcionario[50];
    private int qtdFuncionarios = 0;
    private Cliente[] clientes = new Cliente[50];
    private int qtdClientes = 0;
    private Livraria[] livrarias = new Livraria[50];
    private int qtdLivrarias = 0;
    private Livro[] livros = new Livro[50];
    private int qtdLivros = 0;
    private Revista[] revistas = new Revista[50];
    private int qtdRevistas = 0;
    private Telefone[] tels = new Telefone[50];
    private int qtdTelefones = 0;
    private Manga[] mangas = new Manga[50];
    private int qtdMangas = 0;
    private Endereco[] enderecos = new Endereco[50];
    private int qtdEnderecos = 0;
    private Venda[] vendas = new Venda[50];
    private int qtdVendas = 0;

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public int getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public void setQtdFuncionarios(int qtdFuncionarios) {
        this.qtdFuncionarios = qtdFuncionarios;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public int getQtdClientes() {
        return qtdClientes;
    }

    public void setQtdClientes(int qtdClientes) {
        this.qtdClientes = qtdClientes;
    }

    public Livraria[] getLivrarias() {
        return livrarias;
    }

    public void setLivrarias(Livraria[] livrarias) {
        this.livrarias = livrarias;
    }

    public int getQtdLivrarias() {
        return qtdLivrarias;
    }

    public void setQtdLivrarias(int qtdLivrarias) {
        this.qtdLivrarias = qtdLivrarias;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public int getQtdLivros() {
        return qtdLivros;
    }

    public void setQtdLivros(int qtdLivros) {
        this.qtdLivros = qtdLivros;
    }

    public Revista[] getRevistas() {
        return revistas;
    }

    public void setRevistas(Revista[] revistas) {
        this.revistas = revistas;
    }

    public int getQtdRevistas() {
        return qtdRevistas;
    }

    public void setQtdRevistas(int qtdRevistas) {
        this.qtdRevistas = qtdRevistas;
    }

    public Telefone[] getTels() {
        return tels;
    }

    public void setTels(Telefone[] tels) {
        this.tels = tels;
    }

    public int getQtdTelefones() {
        return qtdTelefones;
    }

    public void setQtdTelefones(int qtdTelefones) {
        this.qtdTelefones = qtdTelefones;
    }

    public Manga[] getMangas() {
        return mangas;
    }

    public void setMangas(Manga[] mangas) {
        this.mangas = mangas;
    }

    public int getQtdMangas() {
        return qtdMangas;
    }

    public void setQtdMangas(int qtdMangas) {
        this.qtdMangas = qtdMangas;
    }

    public Endereco[] getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Endereco[] enderecos) {
        this.enderecos = enderecos;
    }

    public int getQtdEnderecos() {
        return qtdEnderecos;
    }

    public void setQtdEnderecos(int qtdEnderecos) {
        this.qtdEnderecos = qtdEnderecos;
    }

    public Venda[] getVendas() {
        return vendas;
    }

    public void setVendas(Venda[] vendas) {
        this.vendas = vendas;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public void fillWithSomeData() {
        Date d = Calendar.getInstance().getTime();
        for(int i = 0; i < 5; i++) {
            enderecos[i] = new Endereco("bairro"+i,"Brasil", "DF", "cidade"+i,
                    null, "Rua"+i, "1"+i,(i+1)*124456, 1+i);
            tels[i] = new Telefone((i+1)*100, (i+1)*1000000);
            funcionarios[i] = new Funcionario((i+1)*500.23, d, "Funcionario"+i, (i+1)*123456,
                    (i+1)*112233,
                    tels[i],enderecos[i],"aluno"+i+"@gmail.com" );
            clientes[i] = new Cliente(d,"Cliente"+i,(i+2)*123456,
                    tels[i],"cliente"+i+"@gmail.com",(i+1)*112433,enderecos[i]);

            livros[i] = new Livro((i+1)*112833,"livro"+i, "genero"+i, null, 2000+i,Integer.toString(1+i)+"ª",
                    "Editora"+i, 2.99*i, "Portugues", "autor"+i  );
            revistas[i] = new Revista((i+1)*112433, "Revista"+i, "genero"+i, null, 2000+i, Integer.toString(1+i)+"ª",
                    "Editora"+i, 2.99*i, "Portugues", Integer.toString(i+1)+"meses" );
            mangas[i] = new Manga((i+1)*112463,"livro"+i, "genero"+i, null, 2000+i,Integer.toString(1+i)+"ª",
                    "Editora"+i, 2.99*i, "Portugues", "autor"+i, "Japones", i );
            vendas[i] = new Venda( mangas[i].getId(),i+1, d,clientes[i], funcionarios[i] );

        }
        qtdClientes = 5;
        qtdEnderecos = 5;
        qtdFuncionarios = 5;

        qtdMangas = 5;
        qtdRevistas = 5;
        qtdTelefones = 5;
        qtdVendas = 5;
        qtdLivros = 5;
    }

    public void criarLivrarias(){
        for(int i = 0; i < 5; i++) {
            livrarias[i] = new Livraria((i + 1) * 112234, 0, (i + 1) * 123476, enderecos[i],
                    "Livraria" + i, "livraria" + 1 + "@gmail.com");
        }
        qtdLivrarias = 5;
    }
}
