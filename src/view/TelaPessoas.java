package view;

import controle.ControleDados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPessoas implements ActionListener {
    private static JFrame janela = new JFrame("Gerenciamento da livraria");
    private static JLabel titulo = new JLabel("Livraria 1");
    private static JLabel subTitulo = new JLabel("Gerenciamento de Pessoas", JLabel.CENTER);
    private static JButton cadastrar = new JButton("Cadastrar");
    private static JButton listar = new JButton("Listar");
    private static JButton voltar = new JButton("Voltar");

    public TelaPessoas() {
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
            new TelaSelecionarPessoa();
            janela.setVisible(false);
        }

    }
}

