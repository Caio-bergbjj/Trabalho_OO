package com.modelo;

import java.util.Date;

public class Manga extends Produto {
    private String autor;
    private int volume;
    private String nacionalidade;

    public Manga(int ID, String setTitulo, String setGenero, String setDescricao, Date setAno, String setVersao, String setEditora, double setPreco, String setIdioma) {
        super(ID, setTitulo, setGenero, setDescricao, setAno, setVersao, setEditora, setPreco, setIdioma);
    }
}
