package view;

import controle.ControleDados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroManga implements ActionListener {

    private static JFrame janela = new JFrame("Gerenciamento da Livraria");
    private static JLabel titulo = new JLabel("Cadastro de Mangá", JLabel.CENTER);
    private static JLabel titleLabel = new JLabel("Título");
    private static JTextField title = new JTextField();
    private static JLabel generoLabel = new JLabel("Gênero");
    private static JTextField genero = new JTextField();
    private static JLabel descLabel = new JLabel("Descrição");
    private static JTextField desc = new JTextField();
    private static JLabel anoLabel = new JLabel("Ano");
    private static JTextField ano = new JTextField();
    private static JLabel verLabel = new JLabel("Versão");
    private static JTextField ver = new JTextField();
    private static JLabel editoraLabel = new JLabel("Editora");
    private static JTextField editora = new JTextField();
    private static JLabel precoLabel = new JLabel("Preço");
    private static JTextField preco = new JTextField();
    private static JLabel idiomaLabel = new JLabel("Idioma");
    private static JTextField idioma = new JTextField();
    private static JLabel autorLabel = new JLabel("Nome do Autor");
    private static JTextField autor = new JTextField();
    private static JLabel volLabel = new JLabel("Volume");
    private static JTextField vol = new JTextField();
    private static JLabel nacionalidadeLabel = new JLabel("Nacionalidade do Mangá");
    private static JTextField nacionalidade = new JTextField();
    private static JButton save = new JButton("Cadastrar");
    private static JButton back = new JButton("Voltar");


    public TelaCadastroManga() {


        titulo.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
        titulo.setBounds(140, 10, 600, 30);
        titulo.setHorizontalTextPosition(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        titleLabel.setBounds(140, 50, 150, 30);
        titleLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        title.setBounds(140, 85, 250, 30);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        generoLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        generoLabel.setBounds(540, 50, 150, 30);
        generoLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        genero.setBounds(540, 85, 250, 30);
        genero.setHorizontalAlignment(SwingConstants.CENTER);
        descLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        descLabel.setBounds(140, 135, 150, 30);
        descLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        desc.setBounds(140, 170, 250, 30);
        desc.setHorizontalAlignment(SwingConstants.CENTER);
        anoLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        anoLabel.setBounds(540, 135, 150, 30);
        anoLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        ano.setBounds(540, 170, 250, 30);
        ano.setHorizontalAlignment(SwingConstants.CENTER);
        verLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        verLabel.setBounds(140, 225, 150, 30);
        verLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        ver.setBounds(140, 260, 250, 30);
        ver.setHorizontalAlignment(SwingConstants.CENTER);
        editoraLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        editoraLabel.setBounds(540, 225, 150, 30);
        editoraLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        editora.setBounds(540, 260, 250, 30);
        editora.setHorizontalAlignment(SwingConstants.CENTER);
        precoLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        precoLabel.setBounds(140, 310, 150, 30);
        precoLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        preco.setBounds(140, 345, 250, 30);
        preco.setHorizontalAlignment(SwingConstants.CENTER);
        idiomaLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        idiomaLabel.setBounds(540, 310, 150, 30);
        idiomaLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        idioma.setBounds(540, 345, 250, 30);
        idioma.setHorizontalAlignment(SwingConstants.CENTER);
        autorLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        autorLabel.setBounds(140, 395, 150, 30);
        autorLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        autor.setBounds(140, 430, 250, 30);
        autor.setHorizontalAlignment(SwingConstants.CENTER);
        volLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        volLabel.setBounds(540, 395, 150, 30);
        volLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        vol.setBounds(540, 430, 250, 30);
        vol.setHorizontalAlignment(SwingConstants.CENTER);
        nacionalidadeLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        nacionalidadeLabel.setBounds(140, 480, 150, 30);
        nacionalidadeLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        nacionalidade.setBounds(140, 515, 250, 30);
        nacionalidade.setHorizontalAlignment(SwingConstants.CENTER);
        save.setBounds(340, 590, 100, 30);
        save.setHorizontalAlignment(SwingConstants.CENTER);
        back.setBounds(480, 590, 100, 30);
        back.setHorizontalAlignment(SwingConstants.CENTER);

        janela.setLayout(null);

        janela.add(titulo);
        janela.add(titleLabel);
        janela.add(title);
        janela.add(generoLabel);
        janela.add(genero);
        janela.add(descLabel);
        janela.add(desc);
        janela.add(anoLabel);
        janela.add(ano);
        janela.add(verLabel);
        janela.add(ver);
        janela.add(editoraLabel);
        janela.add(editora);
        janela.add(precoLabel);
        janela.add(preco);
        janela.add(idiomaLabel);
        janela.add(idioma);
        janela.add(autorLabel);
        janela.add(autor);
        janela.add(volLabel);
        janela.add(vol);
        janela.add(nacionalidadeLabel);
        janela.add(nacionalidade);
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

        if (src == back) {
            new TelaSelecionarProduto();
            janela.setVisible(false);
        }

        if (src == save) {

        }


    }
}