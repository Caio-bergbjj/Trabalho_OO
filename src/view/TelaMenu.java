package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class TelaMenu implements ActionListener {

        private static JFrame janela = new JFrame("Gerenciamento da livraria");
        private static JLabel titulo = new JLabel("Livraria");
        private static JButton acessar = new JButton("acessar");
        private static JButton cadastrar = new JButton("cadastrar");

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

        }

        public void actionPerformed(ActionEvent e) {

        }
    }

