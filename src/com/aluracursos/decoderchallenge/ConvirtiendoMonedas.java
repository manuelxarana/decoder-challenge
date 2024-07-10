package com.aluracursos.decoderchallenge;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConvirtiendoMonedas {

    public double dolaresAPesosCol(double montoAConvertir) throws IOException, InterruptedException {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/ef8553c405bb8ada8ffd9152/pair/USD/COP/"+montoAConvertir);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Resultado conversion = new Gson().fromJson(response.body(), Resultado.class);
            return conversion.conversion_result();
    }

    public double pesosColADolares(double montoAConvertir) throws IOException, InterruptedException {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/ef8553c405bb8ada8ffd9152/pair/COP/USD/"+montoAConvertir);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Resultado conversion = new Gson().fromJson(response.body(), Resultado.class);
        return conversion.conversion_result();
    }

    public double dolaresAQuetzales(double montoAConvertir) throws IOException, InterruptedException {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/ef8553c405bb8ada8ffd9152/pair/USD/GTQ/"+montoAConvertir);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Resultado conversion = new Gson().fromJson(response.body(), Resultado.class);
        return conversion.conversion_result();
    }

    public double quetzalesADolares(double montoAConvertir) throws IOException, InterruptedException {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/ef8553c405bb8ada8ffd9152/pair/GTQ/USD/"+montoAConvertir);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Resultado conversion = new Gson().fromJson(response.body(), Resultado.class);
        return conversion.conversion_result();
    }

    public double dolaresAPesosMex(double montoAConvertir) throws IOException, InterruptedException {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/ef8553c405bb8ada8ffd9152/pair/USD/MXN/"+montoAConvertir);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Resultado conversion = new Gson().fromJson(response.body(), Resultado.class);
        return conversion.conversion_result();
    }

    public double pesosMexADolares(double montoAConvertir) throws IOException, InterruptedException {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/ef8553c405bb8ada8ffd9152/pair/MXN/USD/"+montoAConvertir);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Resultado conversion = new Gson().fromJson(response.body(), Resultado.class);
        return conversion.conversion_result();
    }

}
