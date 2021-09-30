package com.modelo;

import java.util.Date;

public class Livro extends Produto {
    private String autor;

    public Livro(int ID,String t, String g, String d, int a, String v,
                 String e, double p, String i, String aut) {
        titulo = t;
        genero = g;
        descricao = d;
        ano = a;
        versao = v;
        editora = e;
        preco = p;
        idioma = i;
        autor = aut;
        id = ID;
    }

}
