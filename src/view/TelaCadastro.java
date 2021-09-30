package view;

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
    private static JLabel cepLabel = new JLabel("CEP");
    private static JTextField cep = new JTextField();
    private static JLabel paisLabel = new JLabel("País");
    private static JTextField pais = new JTextField();
    private static JLabel estadoLabel = new JLabel("Estado");
    private static JTextField estado = new JTextField();
    private static JLabel cidadeLabel = new JLabel("Cidade");
    private static JTextField cidade = new JTextField();
    private static JLabel bairroLabel = new JLabel("Bairro");
    private static JTextField bairro = new JTextField();
    private static JLabel ruaLabel = new JLabel("Rua");
    private static JTextField rua = new JTextField();
    private static JLabel loteLabel = new JLabel("Lote");
    private static JTextField lote = new JTextField();
    private static JLabel numLabel = new JLabel("Nº da Casa/Apt");
    private static JTextField num = new JTextField();
    private static JButton save = new JButton("Cadastrar");



    public TelaCadastro() {
        titulo.setFont(new Font("Trebuchet MS",Font.BOLD,24));
        titulo.setBounds(140,10,600,30);
        titulo.setHorizontalTextPosition(SwingConstants.CENTER);
        nomeLabel.setFont(new Font("Trebuchet MS",Font.BOLD,12));
        nomeLabel.setBounds(140,50,150,30);
        nomeLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        nome.setBounds(140,85,250,30);
        nome.setHorizontalAlignment(SwingConstants.CENTER);
        emailLabel.setFont(new Font("Trebuchet MS",Font.BOLD,12));
        emailLabel.setBounds(540,50,150,30);
        emailLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        email.setBounds(540,85,250,30);
        email.setHorizontalAlignment(SwingConstants.CENTER);
        cnpjLabel.setFont(new Font("Trebuchet MS",Font.BOLD,12));
        cnpjLabel.setBounds(140,135,150,30);
        cnpjLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        cnpj.setBounds(140,170,250,30);
        cnpj.setHorizontalAlignment(SwingConstants.CENTER);
        cepLabel.setFont(new Font("Trebuchet MS",Font.BOLD,12));
        cepLabel.setBounds(540,135,150,30);
        cepLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        cep.setBounds(540,170,250,30);
        cep.setHorizontalAlignment(SwingConstants.CENTER);
        paisLabel.setFont(new Font("Trebuchet MS",Font.BOLD,12));
        paisLabel.setBounds(140,220,150,30);
        paisLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        pais.setBounds(140,255,250,30);
        pais.setHorizontalAlignment(SwingConstants.CENTER);
        estadoLabel.setFont(new Font("Trebuchet MS",Font.BOLD,12));
        estadoLabel.setBounds(540,220,150,30);
        estadoLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        estado.setBounds(540,255,250,30);
        estado.setHorizontalAlignment(SwingConstants.CENTER);
        cidadeLabel.setFont(new Font("Trebuchet MS",Font.BOLD,12));
        cidadeLabel.setBounds(140,305,150,30);
        cidadeLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        cidade.setBounds(140,340,250,30);
        cidade.setHorizontalAlignment(SwingConstants.CENTER);
        bairroLabel.setFont(new Font("Trebuchet MS",Font.BOLD,12));
        bairroLabel.setBounds(540,305,150,30);
        bairroLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        bairro.setBounds(540,340,250,30);
        bairro.setHorizontalAlignment(SwingConstants.CENTER);
        ruaLabel.setFont(new Font("Trebuchet MS",Font.BOLD,12));
        ruaLabel.setBounds(140,390,150,30);
        ruaLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        rua.setBounds(140,425,250,30);
        rua.setHorizontalAlignment(SwingConstants.CENTER);
        loteLabel.setFont(new Font("Trebuchet MS",Font.BOLD,12));
        loteLabel.setBounds(540,390,150,30);
        loteLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        lote.setBounds(540,425,250,30);
        lote.setHorizontalAlignment(SwingConstants.CENTER);
        numLabel.setFont(new Font("Trebuchet MS",Font.BOLD,12));
        numLabel.setBounds(140,475,150,30);
        numLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        num.setBounds(140,510,250,30);
        num.setHorizontalAlignment(SwingConstants.CENTER);
        save.setBounds(350,570,200,30);
        save.setHorizontalAlignment(SwingConstants.CENTER);

        janela.setLayout(null);

        janela.add(titulo);
        janela.add(nomeLabel);
        janela.add(nome);
        janela.add(emailLabel);
        janela.add(email);
        janela.add(cnpjLabel);
        janela.add(cnpj);
        janela.add(cepLabel);
        janela.add(cep);
        janela.add(paisLabel);
        janela.add(pais);
        janela.add(estadoLabel);
        janela.add(estado);
        janela.add(cidadeLabel);
        janela.add(cidade);
        janela.add(bairroLabel);
        janela.add(bairro);
        janela.add(ruaLabel);
        janela.add(rua);
        janela.add(loteLabel);
        janela.add(lote);
        janela.add(numLabel);
        janela.add(num);
        janela.add(save);

        janela.setSize(900, 800);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);


    }

    public void actionPerformed(ActionEvent e) {

    }
}

