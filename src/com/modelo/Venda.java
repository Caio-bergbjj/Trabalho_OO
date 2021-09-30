package com.modelo;

import java.util.Date;

public class Venda {
    private int id;
    private int pessoaId;
    private int produtoId;
    private int quant;
    private Date data;
    private Cliente cliente;
    private Funcionario funcionario;

    public Venda(int pessoaId, int produtoId, int quant, Date data, Cliente c, Funcionario f) {
        this.pessoaId = pessoaId;
        this.produtoId = produtoId;
        this.quant = quant;
        this.data = data;
        this.cliente = c;
        this.funcionario = f;
    }
}
