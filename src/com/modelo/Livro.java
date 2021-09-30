package com.modelo;

import java.util.Date;

public class Livro extends Produto {
    private String autor;

    public Livro(int ID, String t, String g, String d, Date a, String v, String e, double p, String i) {
        super(ID, t, g, d, a, v, e, p, i);
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String novoAutor){
        this.autor = novoAutor;
    }
}
