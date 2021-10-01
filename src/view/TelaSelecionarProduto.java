package view;

import controle.ControleDados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaSelecionarProduto implements ActionListener {

    private static JFrame janela = new JFrame("Gerenciamento da livraria");
    private static JLabel titulo = new JLabel("Livraria 1");
    private static JLabel subTitulo = new JLabel("Selecione qual deseja Cadastrar", JLabel.CENTER);
    private static JButton livro = new JButton("Livro");
    private static JButton manga = new JButton("Mangá");
    private static JButton revista = new JButton("Revista");
    private static JButton voltar = new JButton("Voltar");
    public static ControleDados dados = new ControleDados();

    public TelaSelecionarProduto() {
        titulo.setFont(new Font("Trebuchet MS",Font.BOLD,20));
        titulo.setBounds(175,10,150,30);
        subTitulo.setFont(new Font("Trebuchet MS",Font.BOLD,14));
        subTitulo.setBounds(50,30,350,30);
        livro.setBounds(175,70,100,30);
        manga.setBounds(175,120,100,30);
        revista.setBounds(175,170,100,30);
        voltar.setBounds(175,220,100,30);

        janela.setLayout(null);

        janela.add(titulo);
        janela.add(subTitulo);
        janela.add(livro);
        janela.add(manga);
        janela.add(revista);
        janela.add(voltar);

        janela.setSize(500, 350);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);


        manga.addActionListener(this);
        livro.addActionListener(this);
        revista.addActionListener(this);
        voltar.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if(src == voltar)
            new TelaProdutos();
        janela.setVisible(false);


    }
}

