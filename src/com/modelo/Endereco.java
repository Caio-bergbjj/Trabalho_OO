package com.modelo;

public class Endereco {
    private String bairro;
    private String pais;
    private String estado;
    private String cidade;
    private String complemento;
    private String rua;
    private String lote;
    private int CEP;
    private int numero;

    public Endereco(String setBairro, String setPais, String setState, String setCidade, String setComplemento, String setRua, String setLote, int setCEP, int setNum) {
        bairro = setBairro;
        cidade = setCidade;
        estado = setState;
        pais = setPais;
        complemento = setComplemento;
        rua = setRua;
        lote = setLote;
        CEP = setCEP;
        numero = setNum;
    }

    @Override
    public String toString() {
        return "Endereço: " + pais + ", " + estado + " - " + cidade + "\n" + bairro + ", "
                + lote + ", " + rua + ", " + numero + "\n CEP: " + CEP;
    }
    public String getBairro(){
        return bairro;
    }
    public void setBairro(String novoBairro) {
        this.bairro = novoBairro;
    }
    public String getPais(){
        return pais;
    }
    public void setPais(String novoPais){
        this.pais = novoPais;
    }
    public String getEstado(){
        return estado;
    }
    public void setEstado(String novoEstado){
        this.estado = novoEstado;
    }
    public String getCidade(){
        return cidade;
    }
    public void setCidade(String novaCidade){
        this.cidade = novaCidade;
    }
    public String getComplemento(){
        return complemento;
    }
    public void setComplemento(String novoComplemento){
        this.complemento = novoComplemento;
    }
    public String getRua(){
        return rua;
    }
    public void setRua(String novaRua){
        this.rua = novaRua;
    }
    public String getLote(){
        return lote;
    }
    public void setLote(String novoLote){
        this.lote = novoLote;
    }
    public int getCEP() {
        return CEP;
    }
    public void setCEP(int novoCEP) {
        this.CEP = novoCEP;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int novoNumero) {
        this.numero = novoNumero;
    }

}
