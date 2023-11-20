/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GtpConected;

import com.login.Login;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import okhttp3.*;
import java.net.HttpURLConnection;

        



/**
 *
 * @author eduar
 */
public class GtpConectedapi {
    
    
    public static void main(String[] args){
    
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
        loginFrame.setLocationRelativeTo(null);
        
        System.out.println(Gpthorario("Cuentame un chiste en espanol ademas dime quien eres"));
 
    }
    
       public static String Gpthorario(String message) {
        String url = "https://api.openai.com/v1/chat/completions";
        String apiKey = "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";
        String model = "gpt-3.5-turbo-instruct"; 

        try {
            
            URL objeto = new URL(url);
            HttpURLConnection coneccion = (HttpURLConnection) objeto.openConnection();
            coneccion.setRequestMethod("POST");
            coneccion.setRequestProperty("Authorization", "Bearer " + apiKey);
            coneccion.setRequestProperty("Content-Type", "application/json");

            
            String body = "{\"model\": \"" + model + "\", \"messages\": [{\"role\": \"user\", \"content\": \"" + message + "\"}], \"max_tokens\": " + 200 + "}";
            coneccion.setDoOutput(true);
            OutputStreamWriter writer = new OutputStreamWriter(coneccion.getOutputStream());
            writer.write(body);
            writer.flush();
            writer.close();

            
            BufferedReader in = new BufferedReader(new InputStreamReader(coneccion.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            
            return extraerRespuesta(response.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String extraerRespuesta(String respuesta) {
        int inicioDelMarcador = respuesta.indexOf("content")+11; 
        int finDelMarcador = respuesta.indexOf("\"", inicioDelMarcador); 
        return respuesta.substring(inicioDelMarcador, finDelMarcador); 
    }
    
    
}
    

