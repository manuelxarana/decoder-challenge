package com.aluracursos.decoderchallenge;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultandoMonedas {

    public Conversion convirtiendo(int numeroDeOpcion){
        //URI direccion = URI.create("https://v6.exchangerate-api.com/v6/ef8553c405bb8ada8ffd9152/pair/"+origen+"/"+destino+"/"+valor);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                //.uri(direccion)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversion.class);
        } catch (Exception e) {
            throw new RuntimeException("OPCIÓN NO VÁLIDA");
        }
    }

}
