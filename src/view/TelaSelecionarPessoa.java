package view;

import controle.ControleDados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaSelecionarPessoa implements ActionListener {

    private static JFrame janela = new JFrame("Gerenciamento da livraria");
    private static JLabel titulo = new JLabel("Livraria 1");
    private static JLabel subTitulo = new JLabel("Selecione qual deseja Cadastrar", JLabel.CENTER);
    private static JButton cliente = new JButton("Cliente");
    private static JButton funcionario = new JButton("Funcionário");
    private static JButton voltar = new JButton("Voltar");
    public static ControleDados dados = new ControleDados();

    public TelaSelecionarPessoa() {
        titulo.setFont(new Font("Trebuchet MS",Font.BOLD,20));
        titulo.setBounds(175,10,150,30);
        subTitulo.setFont(new Font("Trebuchet MS",Font.BOLD,14));
        subTitulo.setBounds(50,30,350,30);
        cliente.setBounds(175,70,100,30);
        funcionario.setBounds(175,120,100,30);
        voltar.setBounds(175,170,100,30);

        janela.setLayout(null);

        janela.add(titulo);
        janela.add(subTitulo);
        janela.add(cliente);
        janela.add(funcionario);
        janela.add(voltar);

        janela.setSize(500, 350);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);


        funcionario.addActionListener(this);
        cliente.addActionListener(this);
        voltar.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if(src == voltar)
            new TelaPessoas();
        janela.setVisible(false);


    }
}

