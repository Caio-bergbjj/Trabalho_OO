package view;

import controle.ControleDados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastro implements ActionListener {

    private static JFrame janela = new JFrame("Gerenciamento da Livraria");
    private static JLabel titulo = new JLabel("Cadastro de Livraria", JLabel.CENTER);
    private static JLabel nomeLabel = new JLabel("Nome");
    private static JTextField nome = new JTextField();
    private static JLabel emailLabel = new JLabel("Email");
    private static JTextField email = new JTextField();
    private static JLabel cnpjLabel = new JLabel("CNPJ");
    private static JTextField cnpj = new JTextField();
    private static JButton save = new JButton("Cadastrar");
    private static JButton back = new JButton("Cancelar");
    private String[] novoDado = new String[12];
    private static ControleDados dados;
    private int posicao;



    public void inserirLivraria(ControleDados d, int pos ) {


        dados  = d;
        posicao = pos;


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
            cnpjLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
            cnpjLabel.setBounds(140, 135, 150, 30);
            cnpjLabel.setHorizontalTextPosition(SwingConstants.CENTER);
            cnpj.setBounds(140, 170, 250, 30);
            cnpj.setHorizontalAlignment(SwingConstants.CENTER);
            save.setBounds(340, 570, 100, 30);
            save.setHorizontalAlignment(SwingConstants.CENTER);
            back.setBounds(480, 570, 100, 30);
            back.setHorizontalAlignment(SwingConstants.CENTER);

            janela.setLayout(null);

            janela.add(titulo);
            janela.add(nomeLabel);
            janela.add(nome);
            janela.add(emailLabel);
            janela.add(email);
            janela.add(cnpjLabel);
            janela.add(cnpj);
            janela.add(save);
            janela.add(back);

            janela.setSize(900, 800);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.setVisible(true);

            save.addActionListener(this);
            back.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if(src == back) {
            new TelaMenu();
            janela.setVisible(false);
        }

        if(src == save){
            try{
                boolean res;

                novoDado[0] = Integer.toString(dados.getQtdLivrarias());
                novoDado[3] =  cnpj.getText();

                novoDado[1] =  nome.getText();
                /*novoDado[5] =  valorDDD.getText();
                novoDado[6] =  valorTelefone.getText();*/

            } catch (NullPointerException exc1){
                mensagemErroCadastro();
            } catch (NumberFormatException exc2) {
                mensagemErroCadastro();
            }
        }


    }

    public void mensagemSucessoCadastro() {
        JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
                JOptionPane.INFORMATION_MESSAGE);
        janela.dispose();
    }

    public void mensagemErroCadastro() {
        JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
                        + "Pode ter ocorrido um dos dois erros a seguir:  \n"
                        + "1. Nem todos os campos foram preenchidos \n"
                        + "2. CPF, identidade, DDD e telefone n�o cont�m apenas n�meros", null,
                JOptionPane.ERROR_MESSAGE);
    }
}

