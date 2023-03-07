package moedas;

import java.io.BufferedReader;
import java.io.IOException;

public class JsonParser {
    public static String jsonEmString(BufferedReader buffereReader) throws IOException{
        String resposta, jsonEmString = "";
        while((resposta = buffereReader.readLine()) != null){
            jsonEmString += resposta;
        }
        return jsonEmString;
    }
}
