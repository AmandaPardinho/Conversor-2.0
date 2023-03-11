package telas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class GenericScreen {
    //Componentes da tela genérica
    private JFrame frameGeneric = new JFrame();
    private JPanel panelGeneric = new JPanel();
    private JLabel labelComboBoxGeneric = new JLabel();
    private JLabel labelTxtGeneric = new JLabel();
    private JComboBox comboBoxGeneric1 = new JComboBox<>();
    private JComboBox comboBoxGeneric2 = new JComboBox<>();
    private JTextField textFieldGeneric1 = new JTextField();
    private JTextField textFieldGeneric2 = new JTextField();
    private JButton buttonConverter = new JButton("Converter");

    public GenericScreen(JFrame frameGeneric, JLabel labelComboBoxGeneric, JLabel labelTxtGeneric, JComboBox
            comboBoxGeneric1, JComboBox comboBoxGeneric2) {
        this.frameGeneric = frameGeneric;
        this.labelComboBoxGeneric = labelComboBoxGeneric;
        this.labelTxtGeneric = labelTxtGeneric;
        this.comboBoxGeneric1 = comboBoxGeneric1;
        this.comboBoxGeneric2 = comboBoxGeneric2;
    }

    public JLabel getLabelComboBoxGeneric() {
        return labelComboBoxGeneric;
    }

    public void setLabelComboBoxGeneric(JLabel labelComboBoxGeneric) {
        this.labelComboBoxGeneric = labelComboBoxGeneric;
    }

    public JLabel getLabelTxtGeneric() {
        return labelTxtGeneric;
    }

    public void setLabelTxtGeneric(JLabel labelTxtGeneric) {
        this.labelTxtGeneric = labelTxtGeneric;
    }

    public JComboBox getComboBoxGeneric1() {
        return comboBoxGeneric1;
    }

    public void setComboBoxGeneric1(JComboBox comboBoxGeneric1) {
        this.comboBoxGeneric1 = comboBoxGeneric1;
    }

    public JComboBox getComboBoxGeneric2() {
        return comboBoxGeneric2;
    }

    public void setComboBoxGeneric2(JComboBox comboBoxGeneric2) {
        this.comboBoxGeneric2 = comboBoxGeneric2;
    }

    public JTextField getTextFieldGeneric1() {
        return textFieldGeneric1;
    }

    public void setTextFieldGeneric1(JTextField textFieldGeneric1) {
        this.textFieldGeneric1 = textFieldGeneric1;
    }

    public JTextField getTextFieldGeneric2() {
        return textFieldGeneric2;
    }

    public void setTextFieldGeneric2(JTextField textFieldGeneric2) {
        this.textFieldGeneric2 = textFieldGeneric2;
    }

    public JButton getButtonConverter() {
        return buttonConverter;
    }

    public void setButtonConverter(JButton buttonConverter) {
        this.buttonConverter = buttonConverter;
    }

    public GenericScreen(String conversorDeMoedas, String moedas, String valorAConverter, String[] opcaoMoedas, String[] strings){

        //Adicionando o JPanel ao JFrame
        frameGeneric.add(panelGeneric);
        frameGeneric.setVisible(true);
        frameGeneric.setSize(500,300);

        //Adicionando o Layout
        panelGeneric.setLayout(new FlowLayout());

        //Adicionando os componentes da tela ao JPanel
        panelGeneric.add(labelComboBoxGeneric);
        labelComboBoxGeneric.setPreferredSize(new Dimension(100,50));
        labelComboBoxGeneric.setFont(new Font("Arial", Font.BOLD, 18));

        panelGeneric.add(labelTxtGeneric);
        labelTxtGeneric.setPreferredSize(new Dimension(100,50));
        labelTxtGeneric.setFont(new Font("Arial", Font.BOLD, 18));

        panelGeneric.add(comboBoxGeneric1);
        comboBoxGeneric1.setPreferredSize(new Dimension(100,50));
        comboBoxGeneric1.setFont(new Font("Arial", Font.PLAIN, 16));

        panelGeneric.add(comboBoxGeneric2);
        comboBoxGeneric2.setPreferredSize(new Dimension(100,50));
        comboBoxGeneric2.setFont(new Font("Arial", Font.PLAIN, 16));

        panelGeneric.add(textFieldGeneric1);
        textFieldGeneric1.setPreferredSize(new Dimension(100,50));
        textFieldGeneric1.setFont(new Font("Arial", Font.PLAIN, 16));

        panelGeneric.add(textFieldGeneric2);
        textFieldGeneric2.setPreferredSize(new Dimension(100,50));
        textFieldGeneric2.setFont(new Font("Arial", Font.PLAIN, 16));

        panelGeneric.add(buttonConverter);
        buttonConverter.setPreferredSize(new Dimension(100,50));
        buttonConverter.setFont(new Font("Arial", Font.BOLD, 16));
    }

    public void fecharTela(){
        frameGeneric.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        frameGeneric.addWindowListener(new WindowAdapter() {
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
