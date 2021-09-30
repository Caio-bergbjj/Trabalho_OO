package com.modelo;

import java.util.Date;

public class Livro extends Produto {
    private String autor;

    public Livro(int ID, String setTitulo, String setGenero, String setDescricao, Date setAno, String setVersao, String setEditora, double setPreco, String setIdioma) {
        super(ID, setTitulo, setGenero, setDescricao, setAno, setVersao, setEditora, setPreco, setIdioma);
    }
}
