import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;;

public class Faturamento {
    public static void main(String[] args) {
        JSONObject jsonObject;
        JSONParser parser = new JSONParser();
        
        double[] faturamento = new double[30];

        try (FileReader reader = new FileReader("dados.json")){
            
            jsonObject = (JSONObject) parser.parse(reader);
            
            for(int i = 0; i < 30; i++){

                faturamento[i] = (double) jsonObject.get("valor");
                System.out.println(faturamento[i]);
            }

        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        } catch (IOException e) {
            
            e.printStackTrace();
        } catch (ParseException e) {
            
            e.printStackTrace();
        }

    }
}
