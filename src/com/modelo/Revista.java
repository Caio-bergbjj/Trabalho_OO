package com.modelo;

public class Revista extends Produto {
    private String periodicidade;

    public Revista(int ID, String t, String g, String d, int a, String v,
                   String e, double p, String i, String peri) {
        titulo = t;
        genero = g;
        descricao = d;
        ano = a;
        versao = v;
        editora = e;
        preco = p;
        idioma = i;
        periodicidade = peri;
    }

}
