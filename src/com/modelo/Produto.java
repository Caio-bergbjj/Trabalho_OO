package com.modelo;

public abstract class Produto {
    protected int id;
    protected String titulo;
    protected String genero;
    protected String descricao;
    protected int ano;
    protected String versao;
    protected String editora;
    protected double preco;
    protected String idioma;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String novoTitulo) {
        this.titulo = novoTitulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String novoGenero) {
        this.genero = novoGenero;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String novaDescricao){
        this.descricao = novaDescricao;
    }

    public String getVersao(){
        return versao;
    }
    public void setVersao(String novaVersao){
        this.versao = novaVersao;
    }
    public String getEditora(){
        return editora;
    }
    public void setEditora(String novaEditora){
        this.editora = novaEditora;
    }
    public String getIdioma(){
        return idioma;
    }
    public void setIdioma(String novoIdioma){
        this.idioma = novoIdioma;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double novoPreco){
        this.preco = novoPreco;
    }
    public int getAno(){
        return ano;
    }
    public void setAno(int novoAno){
        this.ano = novoAno;
    }

}
