package com.modelo;

import java.util.Date;

public class Manga extends Produto {
    private String autor;
    private int volume;
    private String nacionalidade;

    public Manga(int ID, String t, String g, String d, Date a, String v,
                   String e, double p, String i, String aut, String n, int vol) {
        titulo = i;
        genero = g;
        descricao = d;
        ano = a;
        versao = v;
        editora = e;
        preco = p;
        idioma = i;
        autor =  aut;
        volume = vol;
        nacionalidade = n;
    }

}
