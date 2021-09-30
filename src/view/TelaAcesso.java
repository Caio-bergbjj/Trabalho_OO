package view;

import controle.ControleDados;
import controle.ControleLivraria;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaAcesso implements ActionListener {
    private static ControleDados dados;
    private static JFrame janela = new JFrame("Gerenciamento da livraria");
    private static JLabel titulo = new JLabel("Escolha a Livraria que deseja Acessar", JLabel.CENTER);
    private  JList<String> livrarias;
    private String[] listaNomes = new String[50];
    private static JButton acessar = new JButton("Acessar");
    private static JButton alterar = new JButton("Alterar");
    private static JButton voltar = new JButton("Voltar");

    public TelaAcesso(ControleDados d) {

        dados = d;

        listaNomes = new ControleLivraria(dados).getNomeLivraria();
        livrarias = new JList<String>(listaNomes);


        titulo.setFont(new Font("Trebuchet MS",Font.BOLD,16));
        titulo.setBounds(150,10,350,30);
        acessar.setBounds(140,230,100,30);
        acessar.setHorizontalAlignment(SwingConstants.CENTER);
        alterar.setBounds(280,230,100,30);
        alterar.setHorizontalAlignment(SwingConstants.CENTER);
        voltar.setBounds(420,230,100,30);
        voltar.setHorizontalAlignment(SwingConstants.CENTER);
        livrarias.setBounds(200, 60, 250, 120);
        livrarias.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        livrarias.setVisibleRowCount(10);

        janela.setLayout(null);

        janela.add(titulo);
        janela.add(livrarias);
        janela.add(acessar);
        janela.add(alterar);
        janela.add(voltar);

        janela.setSize(700, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        voltar.addActionListener(this);
        acessar.addActionListener(this);
        alterar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if(src == voltar) {
            new TelaMenu();
            janela.setVisible(false);
        }
        if(src == acessar) {
            new TelaAcessoLivraria();
            janela.setVisible(false);
        }
    }
}

