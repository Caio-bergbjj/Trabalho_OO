package view;

import controle.ControleDados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaAcessoLivraria implements ActionListener {
    private static JFrame janela = new JFrame("Gerenciamento da livraria");
    private static JLabel titulo = new JLabel("Livraria 1");
    private static JButton pessoa = new JButton("Pessoas");
    private static JButton produto = new JButton("Produtos");
    private static JButton venda = new JButton("Vendas");
    private static JButton voltar = new JButton("Voltar");

    public TelaAcessoLivraria() {
        titulo.setFont(new Font("Trebuchet MS",Font.BOLD,20));
        titulo.setBounds(150,10,150,30);
        pessoa.setBounds(140,50,100,30);
        produto.setBounds(140,100,100,30);
        venda.setBounds(140,150,100,30);
        voltar.setBounds(140,200,100,30);

        janela.setLayout(null);

        janela.add(titulo);
        janela.add(pessoa);
        janela.add(produto);
        janela.add(venda);
        janela.add(voltar);

        janela.setSize(400, 350);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

        pessoa.addActionListener(this);
        produto.addActionListener(this);
        venda.addActionListener(this);
        voltar.addActionListener(this);

    }



    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if(src == voltar) {
            new TelaMenu();
            janela.setVisible(false);
        }
        if(src == pessoa) {
            new TelaPessoas();
            janela.setVisible(false);
        }
        if(src == produto) {
            new TelaProdutos();
            janela.setVisible(false);
        }
        if(src == venda) {
            new TelaVendas();
            janela.setVisible(false);
        }

    }
}

