package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastro implements ActionListener {

    private static JFrame janela = new JFrame("Gerenciamento da Livraria");
    private static JLabel titulo = new JLabel("Cadastro de Dados");
    private static JButton pessoa = new JButton("Pessoa");
    private static JButton produto = new JButton("Produto");

    public TelaCadastro() {
        titulo.setFont(new Font("Trebuchet MS",Font.BOLD,16));
        titulo.setBounds(140,10,150,30);
        titulo.setHorizontalTextPosition(SwingConstants.CENTER);
        pessoa.setBounds(140,50,150,30);
        pessoa.setHorizontalAlignment(SwingConstants.CENTER);
        produto.setBounds(140,100,150,30);
        produto.setHorizontalAlignment(SwingConstants.CENTER);

        janela.setLayout(null);

        janela.add(titulo);
        janela.add(pessoa);
        janela.add(produto);

        janela.setSize(400, 250);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);


    }

    public void actionPerformed(ActionEvent e) {

    }
}

