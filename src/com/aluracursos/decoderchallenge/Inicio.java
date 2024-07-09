package com.aluracursos.decoderchallenge;

import java.io.IOException;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultandoMonedas consulta = new ConsultandoMonedas();
        System.out.println("****BIENVENIDX AL CONVERSOR DE MONEDAS****");
        System.out.println("Escriba el número correspondiente a su opción de conversión preferida:");
        System.out.println("1 - Dólar estadounidense (USD) a Peso colombiano (COP)\n");
        System.out.println("2 - Peso colombiano (COP) a Dólar estadounidense (USD)\n");

        try {
            var numeroDeOpcion = Integer.valueOf(lectura.nextLine());
            Conversion operacion = consulta.convirtiendo(numeroDeOpcion);
            System.out.println(operacion);
        } catch (NumberFormatException e){
            System.out.println("Opción no encontrada "+e.getMessage());
        //} catch(RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación...");
        }
    }
}
