package view;

import controle.ControleDados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroCliente implements ActionListener {

    private static JFrame janela = new JFrame("Gerenciamento da Livraria");
    private static JLabel titulo = new JLabel("Cadastro de Cliente", JLabel.CENTER);
    private static JLabel nomeLabel = new JLabel("Nome");
    private static JTextField nome = new JTextField();
    private static JLabel emailLabel = new JLabel("Email");
    private static JTextField email = new JTextField();
    private static JLabel cpfLabel = new JLabel("CPF");
    private static JTextField cpf = new JTextField();
    private static JLabel enderecoLabel = new JLabel("Endereço");
    private static JTextField endereco = new JTextField();
    private static JLabel telLabel = new JLabel("Telefone");
    private static JTextField tel = new JTextField();
    private static JButton save = new JButton("Cadastrar");
    private static JButton back = new JButton("Voltar");


    public TelaCadastroCliente() {


        titulo.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
        titulo.setBounds(140, 10, 600, 30);
        titulo.setHorizontalTextPosition(SwingConstants.CENTER);
        nomeLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        nomeLabel.setBounds(140, 50, 150, 30);
        nomeLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        nome.setBounds(140, 85, 250, 30);
        nome.setHorizontalAlignment(SwingConstants.CENTER);
        emailLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        emailLabel.setBounds(540, 50, 150, 30);
        emailLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        email.setBounds(540, 85, 250, 30);
        email.setHorizontalAlignment(SwingConstants.CENTER);
        cpfLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        cpfLabel.setBounds(140, 135, 150, 30);
        cpfLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        cpf.setBounds(140, 170, 250, 30);
        cpf.setHorizontalAlignment(SwingConstants.CENTER);
        enderecoLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        enderecoLabel.setBounds(540, 135, 150, 30);
        enderecoLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        endereco.setBounds(540, 170, 250, 30);
        endereco.setHorizontalAlignment(SwingConstants.CENTER);
        telLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        telLabel.setBounds(140, 225, 150, 30);
        telLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        tel.setBounds(140, 260, 250, 30);
        tel.setHorizontalAlignment(SwingConstants.CENTER);
        save.setBounds(340, 370, 100, 30);
        save.setHorizontalAlignment(SwingConstants.CENTER);
        back.setBounds(480, 370, 100, 30);
        back.setHorizontalAlignment(SwingConstants.CENTER);

        janela.setLayout(null);

        janela.add(titulo);
        janela.add(nomeLabel);
        janela.add(nome);
        janela.add(emailLabel);
        janela.add(email);
        janela.add(cpfLabel);
        janela.add(cpf);
        janela.add(enderecoLabel);
        janela.add(endereco);
        janela.add(telLabel);
        janela.add(tel);
        janela.add(save);
        janela.add(back);

        janela.setSize(900, 500);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

        save.addActionListener(this);
        back.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == back) {
            new TelaSelecionarPessoa();
            janela.setVisible(false);
        }

        if (src == save) {

        }


    }
}