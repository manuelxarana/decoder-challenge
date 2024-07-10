package com.aluracursos.decoderchallenge;

import java.io.IOException;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        try (Scanner lectura = new Scanner(System.in)) {
            ConvirtiendoMonedas consulta = new ConvirtiendoMonedas();
            boolean continuar = true;

            while (continuar) {
                System.out.println("****BIENVENIDX AL CONVERSOR DE MONEDAS****");
                System.out.println("Escriba el número correspondiente a su opción de conversión preferida:");
                System.out.println("1 - Dólar estadounidense (USD) a Peso colombiano (COP)");
                System.out.println("2 - Peso colombiano (COP) a Dólar estadounidense (USD)");
                System.out.println("3 - Dólar estadounidense (USD) a Quetzal guatemalteco (GTQ)");
                System.out.println("4 - Quetzal guatemalteco (GTQ) a Dólar estadounidense (USD)");
                System.out.println("5 - Dólar estadounidense (USD) a Peso mexicano (MXN)");
                System.out.println("6 - Peso mexicano (MXN) a Dólar estadounidense (USD)");
                System.out.println("7 - SALIR\n");

                int numeroDeOpcion = -1;
                try {
                    numeroDeOpcion = Integer.parseInt(lectura.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("OPCIÓN NO VÁLIDA");
                    continue;
                }

                if (numeroDeOpcion == 7) {
                    continuar = false;
                    continue;
                }

                double montoAConvertir = solicitarMonto(lectura);
                if (montoAConvertir < 0) {
                    System.out.println("Monto no válido");
                    continue;
                }

                switch (numeroDeOpcion) {
                    case 1 -> System.out.println(montoAConvertir + " USD equivale a " + consulta.dolaresAPesosCol(montoAConvertir) + " COP.");
                    case 2 -> System.out.println(montoAConvertir + " COP equivale a " + consulta.pesosColADolares(montoAConvertir) + " USD.");
                    case 3 -> System.out.println(montoAConvertir + " USD equivale a " + consulta.dolaresAQuetzales(montoAConvertir) + " GTQ.");
                    case 4 -> System.out.println(montoAConvertir + " GTQ equivale a " + consulta.quetzalesADolares(montoAConvertir) + " USD.");
                    case 5 -> System.out.println(montoAConvertir + " USD equivale a " + consulta.dolaresAPesosMex(montoAConvertir) + " MXN.");
                    case 6 -> System.out.println(montoAConvertir + " MXN equivale a " + consulta.pesosMexADolares(montoAConvertir) + " USD.");
                    default -> System.out.println("OPCIÓN NO VÁLIDA");
                }

                System.out.println("¿Desea realizar otra conversión? (Si/No)");
                String respuesta = lectura.nextLine();
                if (!respuesta.equalsIgnoreCase("si")) {
                    continuar = false;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static double solicitarMonto(Scanner lectura) {
        double montoAConvertir = -1;
        System.out.println("Ingrese el monto a convertir:");
        try {
            montoAConvertir = Double.parseDouble(lectura.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Monto no válido");
        }
        return montoAConvertir;
    }
}
