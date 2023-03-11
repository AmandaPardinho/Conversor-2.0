package telas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class GenericScreen {
    //Definição das opções do ComboBox
    private String[] opcaoMoedas = {"Selecione uma moeda", "Dólar (USD)", "Euro (EUR)", "Real (BRL)",
            "Peso Argentino (ARS)","Libra Esterlina (GBP)", "Yuan Chinês (CNY)"};

    //Componentes da tela Moedas
    private JFrame frameMoedas = new JFrame("Conversor de Moedas");
    private JPanel panelMoedas = new JPanel();
    private JLabel labelComboBoxMoedas = new JLabel("Moedas");
    private JLabel labelTxtMoedas = new JLabel("Valor a converter");
    private JComboBox comboBoxMoedas1 = new JComboBox<>(opcaoMoedas);
    private JComboBox comboBoxMoedas2 = new JComboBox<>(opcaoMoedas);
    private JTextField textFieldMoedas1 = new JTextField();
    private JTextField textFieldMoedas2 = new JTextField();
    private JButton buttonConverter = new JButton("Converter");

    public JLabel getLabelComboBoxMoedas() {
        return labelComboBoxMoedas;
    }

    public void setLabelComboBoxMoedas(JLabel labelComboBoxMoedas) {
        this.labelComboBoxMoedas = labelComboBoxMoedas;
    }

    public JLabel getLabelTxtMoedas() {
        return labelTxtMoedas;
    }

    public void setLabelTxtMoedas(JLabel labelTxtMoedas) {
        this.labelTxtMoedas = labelTxtMoedas;
    }

    public JComboBox getComboBoxMoedas1() {
        return comboBoxMoedas1;
    }

    public void setComboBoxMoedas1(JComboBox comboBoxMoedas1) {
        this.comboBoxMoedas1 = comboBoxMoedas1;
    }

    public JComboBox getComboBoxMoedas2() {
        return comboBoxMoedas2;
    }

    public void setComboBoxMoedas2(JComboBox comboBoxMoedas2) {
        this.comboBoxMoedas2 = comboBoxMoedas2;
    }

    public JTextField getTextFieldMoedas1() {
        return textFieldMoedas1;
    }

    public void setTextFieldMoedas1(JTextField textFieldMoedas1) {
        this.textFieldMoedas1 = textFieldMoedas1;
    }

    public JTextField getTextFieldMoedas2() {
        return textFieldMoedas2;
    }

    public void setTextFieldMoedas2(JTextField textFieldMoedas2) {
        this.textFieldMoedas2 = textFieldMoedas2;
    }

    public JButton getButtonConverter() {
        return buttonConverter;
    }

    public void setButtonConverter(JButton buttonConverter) {
        this.buttonConverter = buttonConverter;
    }

    public GenericScreen(){

        //Adicionando o JPanel ao JFrame
        frameMoedas.add(panelMoedas);
        frameMoedas.setVisible(true);
        frameMoedas.setSize(500,300);

        //Adicionando o Layout
        panelMoedas.setLayout(new FlowLayout());

        //Adicionando os componentes da tela ao JPanel
        panelMoedas.add(labelComboBoxMoedas);
        labelComboBoxMoedas.setPreferredSize(new Dimension(100,50));
        labelComboBoxMoedas.setFont(new Font("Arial", Font.BOLD, 18));

        panelMoedas.add(labelTxtMoedas);
        labelTxtMoedas.setPreferredSize(new Dimension(100,50));
        labelTxtMoedas.setFont(new Font("Arial", Font.BOLD, 18));

        panelMoedas.add(comboBoxMoedas1);
        comboBoxMoedas1.setPreferredSize(new Dimension(100,50));
        comboBoxMoedas1.setFont(new Font("Arial", Font.PLAIN, 16));

        panelMoedas.add(comboBoxMoedas2);
        comboBoxMoedas2.setPreferredSize(new Dimension(100,50));
        comboBoxMoedas2.setFont(new Font("Arial", Font.PLAIN, 16));

        panelMoedas.add(textFieldMoedas1);
        textFieldMoedas1.setPreferredSize(new Dimension(100,50));
        textFieldMoedas1.setFont(new Font("Arial", Font.PLAIN, 16));

        panelMoedas.add(textFieldMoedas2);
        textFieldMoedas2.setPreferredSize(new Dimension(100,50));
        textFieldMoedas2.setFont(new Font("Arial", Font.PLAIN, 16));

        panelMoedas.add(buttonConverter);
        buttonConverter.setPreferredSize(new Dimension(100,50));
        buttonConverter.setFont(new Font("Arial", Font.BOLD, 16));
    }

    public void fecharTela(){
        frameMoedas.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frameMoedas.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                if(JOptionPane.showConfirmDialog(null, "Deseja fechar o programa?") ==
                        JOptionPane.OK_OPTION){
                    System.exit(0);
                }
            }
        });
    }

}
