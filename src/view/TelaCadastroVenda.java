package view;

import controle.ControleDados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroVenda implements ActionListener {

    private static JFrame janela = new JFrame("Gerenciamento da Livraria");
    private static JLabel titulo = new JLabel("Cadastro de Vendas", JLabel.CENTER);
    private static JLabel funcionarioLabel = new JLabel("Nome do Funcionario");
    private static JTextField funcionario = new JTextField();
    private static JLabel clienteLabel = new JLabel("Nome do Cliente");
    private static JTextField cliente = new JTextField();
    private static JLabel produtoLabel = new JLabel("ID do Produto");
    private static JTextField produto = new JTextField();
    private static JLabel qtdLabel = new JLabel("Quantidade do Produto");
    private static JTextField qtd = new JTextField();
    private static JButton save = new JButton("Cadastrar");
    private static JButton back = new JButton("Voltar");


    public TelaCadastroVenda() {


        titulo.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
        titulo.setBounds(140, 10, 600, 30);
        titulo.setHorizontalTextPosition(SwingConstants.CENTER);
        funcionarioLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        funcionarioLabel.setBounds(140, 50, 150, 30);
        funcionarioLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        funcionario.setBounds(140, 85, 250, 30);
        funcionario.setHorizontalAlignment(SwingConstants.CENTER);
        clienteLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        clienteLabel.setBounds(540, 50, 150, 30);
        clienteLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        cliente.setBounds(540, 85, 250, 30);
        cliente.setHorizontalAlignment(SwingConstants.CENTER);
        produtoLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        produtoLabel.setBounds(140, 135, 150, 30);
        produtoLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        produto.setBounds(140, 170, 250, 30);
        produto.setHorizontalAlignment(SwingConstants.CENTER);
        qtdLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        qtdLabel.setBounds(540, 135, 150, 30);
        qtdLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        qtd.setBounds(540, 170, 250, 30);
        qtd.setHorizontalAlignment(SwingConstants.CENTER);
        save.setBounds(340, 370, 100, 30);
        save.setHorizontalAlignment(SwingConstants.CENTER);
        back.setBounds(480, 370, 100, 30);
        back.setHorizontalAlignment(SwingConstants.CENTER);

        janela.setLayout(null);

        janela.add(titulo);
        janela.add(funcionarioLabel);
        janela.add(funcionario);
        janela.add(clienteLabel);
        janela.add(cliente);
        janela.add(produtoLabel);
        janela.add(produto);
        janela.add(qtdLabel);
        janela.add(qtd);
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
            new TelaAcessoLivraria();
            janela.setVisible(false);
        }

        if (src == save) {

        }


    }
}