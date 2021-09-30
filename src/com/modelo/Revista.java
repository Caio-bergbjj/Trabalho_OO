package com.modelo;

import java.util.Date;

public class Revista extends Produto {
    private String periodicidade;

    public Revista(int ID, String t, String g, String d, Date a, String v, String e, double p, String i) {
        super(ID, t, g, d, a, v, e, p, i);
    }

    public String getPeriodicidade(){
        return periodicidade;
    }
    public void setPeriodicidade(String novaPeriodicidade){
        this.periodicidade = novaPeriodicidade;
    }
}
