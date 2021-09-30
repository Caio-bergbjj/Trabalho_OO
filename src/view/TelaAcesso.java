package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaAcesso implements ActionListener {
    String[] data = {"one", "two", "three", "four"};
    private static JFrame janela = new JFrame("Gerenciamento da livraria");
    private static JLabel titulo = new JLabel("Escolha a Livraria que deseja Acessar", JLabel.CENTER);
    private  JList<String> livrarias = new JList<String>(data);
    private static JButton acessar = new JButton("Acessar");
    private static JButton alterar = new JButton("Alterar");
    private static JButton voltar = new JButton("Voltar");

    public TelaAcesso() {
        titulo.setFont(new Font("Trebuchet MS",Font.BOLD,16));
        titulo.setBounds(150,10,350,30);
        livrarias.setCellRenderer();
        acessar.setBounds(140,150,100,30);
        acessar.setHorizontalAlignment(SwingConstants.CENTER);
        alterar.setBounds(280,150,100,30);
        alterar.setHorizontalAlignment(SwingConstants.CENTER);
        voltar.setBounds(420,150,100,30);
        voltar.setHorizontalAlignment(SwingConstants.CENTER);

        janela.setLayout(null);

        janela.add(titulo);
        janela.add(livrarias);
        janela.add(acessar);
        janela.add(alterar);
        janela.add(voltar);

        janela.setSize(800, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        voltar.addActionListener(this);
        acessar.addActionListener(this);
        alterar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if(src == voltar)
            new TelaAcesso();
        janela.setVisible(false);

    }
}

