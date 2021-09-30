package com.modelo;

import java.util.*;

public class Dados {
    private Funcionario[] funcionarios = new Funcionario[50];
    private int qtdFuncionarios = 0;
    private Cliente[] clientes = new Cliente[50];
    private int qtdClientes = 0;
    private Livraria[] livrarias = new Livraria[50];
    private int qtdLivrarias = 0;
    private Livro[] livros = new Livro[50];
    private int qtdLivros = 0;
    private Revista[] revistas = new Revista[50];
    private int qtdRevistas = 0;
    private Telefone[] tels = new Telefone[50];
    private int qtdTelefones = 0;
    private Manga[] mangas = new Manga[50];
    private int qtdMangas = 0;
    private Endereco[] enderecos = new Endereco[50];
    private int qtdEnderecos = 0;
    private Venda[] vendas = new Venda[50];
    private int qtdVendas = 0;

    public void fillWithSomeData() {
        Date d = Calendar.getInstance().getTime();
        for(int i = 0; i < 5; i++) {
            enderecos[i] = new Endereco("bairro"+i,"Brasil", "DF", "cidade"+i,null, "Rua"+i, "1"+i,(i+1)*124456, 1+i);
            tels[i] = new Telefone((i+1)*100, (i+1)*1000000);
            funcionarios[i] = new Funcionario((i+1)*500.23, d, "Funcionario"+i, (i+1)*123456, (i+1)*112233,
                    tels[i],enderecos[i],"aluno"+i+"@gmail.com" );
            clientes[i] = new Cliente(d,"Cliente"+i,(i+2)*123456,
                    tels[i],"cliente"+i+"@gmail.com",(i+1)*112433,enderecos[i]);
            livrarias[i] = new Livraria((i+1)*112234, 0, (i+1)*123476, enderecos[i], "Livraria"+i, "livraria"+1+"@gmail.com");
            livros[i] = new Livro("livro"+i, "genero"+i, null, 2000+i,Integer.toString(1+i)+"ª", "Editora"+i, 2.99*i, "Portugues", "autor"+i  );

        }


    }
}
