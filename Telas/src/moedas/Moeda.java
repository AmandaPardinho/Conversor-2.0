package moedas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
//https://pt.stackoverflow.com/questions/318716/importar-a-biblioteca-do-postgres-na-ide-intellij-idea
//link se aplica a qualquer biblioteca.jar

public class Moeda {
    public static String precoMoedas(String siglaMoedas)throws Exception{
        try {
            URL url = new URL("https://economia.awesomeapi.com.br/last/USD-BRL,EUR-BRL");
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if(conexao.getResponseCode() != 200){
                throw new RuntimeException("codigo de erro" + conexao.getResponseCode());
            }

            BufferedReader resposta = new BufferedReader(new InputStreamReader(conexao.getInputStream()));

            String convercao = JsonParser.jsonEmString(resposta);

            JSONObject obj = new JSONObject(convercao);

            String valorMoeda = obj.getJSONObject(siglaMoedas).getString("bid"); //usar um switch com as moedas??????
            return valorMoeda;

        } catch (IOException | RuntimeException e) {
            throw new Exception(e);
        }
    }

    public static double valorMoeda() throws Exception{
        String moeda = precoMoeda();
        double moedaValor = Double.parseDouble(moeda);

        return moedaValor;
    }

    public static String valorMoedaString() throws Exception{
        return String.format("%.2f", valorMoeda());
    }

    public static double converterMoeda(double valor, double moedaValor){
        return valor*moedaValor;
    }
}