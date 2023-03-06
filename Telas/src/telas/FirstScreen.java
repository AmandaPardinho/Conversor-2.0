package telas;

import javax.swing.*;
import java.awt.*;

public class FirstScreen {

    //Definição das opções do ComboBox
    private String[] opcaoConversor = {"Selecione uma opção de conversor", "Moedas", "Sistema Numérico", "Temperatura"};

    //Componentes da tela principal
    private JFrame frameConversor = new JFrame("Conversor");
    private JPanel panelConversor = new JPanel();
    private JLabel conversor = new JLabel("Conversor");
    private JComboBox selecionarConversor = new JComboBox(opcaoConversor);
    private JButton esseConversor = new JButton("Selecionar");

    public JLabel getConversor() {
        return conversor;
    }

    public void setConversor(JLabel conversor) {
        this.conversor = conversor;
    }

    public JComboBox getSelecionarConversor() {
        return selecionarConversor;
    }

    public void setSelecionarConversor(JComboBox selecionarConversor) {
        this.selecionarConversor = selecionarConversor;
    }

    public JButton getEsseConversor() {
        return esseConversor;
    }

    public void setEsseConversor(JButton esseConversor) {
        this.esseConversor = esseConversor;
    }

    public FirstScreen(){
        //Adicionando o JPanel ao JFrame
        frameConversor.add(panelConversor);

        //Adicionando o Layout
        panelConversor.setLayout(new FlowLayout());

        //Adicionando a JLabel ao JPanel
        panelConversor.add(conversor);
        conversor.setPreferredSize(new Dimension(100,50));
        conversor.setFont(new Font("Arial", Font.BOLD, 18));

        //Adicionando o JComboBox ao JPanel
        panelConversor.add(selecionarConversor);
        selecionarConversor.setPreferredSize(new Dimension(100,50));
        selecionarConversor.setFont(new Font("Arial", Font.PLAIN, 16));

        //Adicionando o JButton ao JPanel
        panelConversor.add(esseConversor);
        esseConversor.setPreferredSize(new Dimension(100,50));
        esseConversor.setFont(new Font("Arial", Font.BOLD, 16));


    }
}
