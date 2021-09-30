package view;

import controle.ControleDados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class TelaMenu implements ActionListener {

        private static JFrame janela = new JFrame("Gerenciamento da livraria");
        private static JLabel titulo = new JLabel("Livraria");
        private static JButton acessar = new JButton("Acessar");
        private static JButton cadastrar = new JButton("Cadastrar");
        public static ControleDados dados = new ControleDados();

        public TelaMenu() {
            titulo.setFont(new Font("Trebuchet MS",Font.BOLD,20));
            titulo.setBounds(150,10,150,30);
            acessar.setBounds(140,50,100,30);
            cadastrar.setBounds(140,100,100,30);

            janela.setLayout(null);

            janela.add(titulo);
            janela.add(acessar);
            janela.add(cadastrar);

            janela.setSize(400, 250);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.setVisible(true);


        }
        public static void main(String[] args) {
            TelaMenu menu = new TelaMenu();

            cadastrar.addActionListener(menu);
            acessar.addActionListener(menu);

        }

        public void actionPerformed(ActionEvent e) {
            Object src = e.getSource();

            if(src == cadastrar)
                new TelaCadastro();
                janela.setVisible(false);

            if(src == acessar) {
                new TelaAcesso(dados);
                janela.setVisible(false);
            }

        }
    }

