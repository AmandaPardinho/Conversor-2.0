package telas;

import javax.swing.*;

public class CoinScreen {
    //Definição das opções de moedas do ComboBox
    private String[] opcaoMoedas = {"Selecione uma moeda", "Dólar (USD)", "Euro (EUR)", "Real (BRL)",
            "Peso Argentino (ARS)","Libra Esterlina (GBP)", "Yuan Chinês (CNY)"};

    GenericScreen coinScreen = new GenericScreen("Conversor de Moedas", "Moedas",
            "Valor a converter", opcaoMoedas, opcaoMoedas);

}
