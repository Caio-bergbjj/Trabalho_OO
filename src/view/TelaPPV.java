package view;

import controle.ControleDados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPPV implements ActionListener {

    private static JFrame janela;
    private static JLabel titulo;
    private static JLabel subTitulo;
    private static JButton cadastrar;
    private static JButton listar;
    private static JButton voltar;
    private int opcao;

    public TelaPPV(int op) {

        opcao = op;

        switch (opcao) {
            case 0 -> {
                janela = new JFrame("Gerenciamento da livraria");
                titulo = new JLabel("Livraria 1");
                subTitulo = new JLabel("Gerenciamento de Produtos", JLabel.CENTER);
                cadastrar = new JButton("Cadastrar");
                listar = new JButton("Listar");
                voltar = new JButton("Voltar");
            }
            case 1 -> {
                janela = new JFrame("Gerenciamento da livraria");
                titulo = new JLabel("Livraria 1");
                subTitulo = new JLabel("Gerenciamento de Pessoas", JLabel.CENTER);
                cadastrar = new JButton("Cadastrar");
                listar = new JButton("Listar");
                voltar = new JButton("Voltar");
            }
            case 2 -> {
                janela = new JFrame("Gerenciamento da livraria");
                titulo = new JLabel("Livraria 1");
                subTitulo = new JLabel("Gerenciamento de Vendas", JLabel.CENTER);
                cadastrar = new JButton("Cadastrar");
                listar = new JButton("Listar");
                voltar = new JButton("Voltar");
            }
        }


        titulo.setFont(new Font("Trebuchet MS",Font.BOLD,20));
        titulo.setBounds(175,10,150,30);
        subTitulo.setFont(new Font("Trebuchet MS",Font.BOLD,14));
        subTitulo.setBounds(50,30,350,30);
        cadastrar.setBounds(175,70,100,30);
        listar.setBounds(175,120,100,30);
        voltar.setBounds(175,170,100,30);

        janela.setLayout(null);

        janela.add(titulo);
        janela.add(subTitulo);
        janela.add(cadastrar);
        janela.add(listar);
        janela.add(voltar);

        janela.setSize(500, 350);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

        cadastrar.addActionListener(this);
        listar.addActionListener(this);
        voltar.addActionListener(this);

    }



    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if(src == voltar) {
            new TelaAcessoLivraria();
            janela.setVisible(false);
        }
        if(src == cadastrar) {
            if (opcao == 0 ) new TelaSelecionarProduto();
            if (opcao == 1) new TelaSelecionarPessoa();
            janela.setVisible(false);
        }

    }
}

