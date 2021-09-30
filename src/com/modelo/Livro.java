package com.modelo;

import java.util.Date;

public class Livro extends Produto {
    private String autor;

    public Livro(String t, String g, String d, Date a, String v,
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
    }

}
