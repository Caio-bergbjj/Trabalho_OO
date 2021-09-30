package com.modelo;

import java.util.Date;

public class Manga extends Produto {
    private String autor;
    private int volume;
    private String nacionalidade;

    public Manga(int ID, String t, String g, String d, Date a, String v, String e, double p, String i) {
        super(ID, t, g, d, a, v, e, p, i);
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String novoAutor){
        this.autor = novoAutor;
    }
    public int getVolume(){
        return volume;
    }
    public void setVolume(int novoVolume){
        this.volume = novoVolume;
    }
    public String getNacionalidade(){
        return autor;
    }
    public void setNacionalidade(String novaNacionalidade){
        this.autor = novaNacionalidade;
    }
}
