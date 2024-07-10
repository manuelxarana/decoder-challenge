package com.aluracursos.decoderchallenge;

import java.io.IOException;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        ConvirtiendoMonedas consulta = new ConvirtiendoMonedas();
        System.out.println("****BIENVENIDX AL CONVERSOR DE MONEDAS****");
        System.out.println("Escriba el número correspondiente a su opción de conversión preferida:");
        System.out.println("1 - Dólar estadounidense (USD) a Peso colombiano (COP)\n");
        System.out.println("2 - Peso colombiano (COP) a Dólar estadounidense (USD)\n");
        System.out.println("3 - Dólar estadounidense (USD) a Quetzal guatemalteco (GTQ)\n");
        System.out.println("4 - Quetzal guatemalteco (GTQ) a Dólar estadounidense (USD)\n");
        System.out.println("5 - Dólar estadounidense (USD) a Peso mexicano (MXN)\n");
        System.out.println("6 - Peso mexicano (MXN) a Dólar estadounidense (USD)\n");
        System.out.println("7 - SALIR\n");

        var numeroDeOpcion = Integer.valueOf(lectura.nextLine());
        var montoAConvertir = 0.0;

        switch(numeroDeOpcion){
            case 1:
                System.out.println("Ingrese el monto a convertir:\n");
                montoAConvertir = Double.valueOf(lectura.nextLine());
                double operacion1 = consulta.dolaresAPesosCol(montoAConvertir);
                System.out.println(montoAConvertir+ " USD equivale a "+operacion1+" COP.");
                break;
            case 2:
                System.out.println("Ingrese el monto a convertir:");
                montoAConvertir = Double.valueOf(lectura.nextLine());
                double operacion2 = consulta.pesosColADolares(montoAConvertir);
                System.out.println(montoAConvertir+ " COP equivale a "+operacion2+" USD.");
                break;
            case 3:
                System.out.println("Ingrese el monto a convertir:");
                montoAConvertir = Double.valueOf(lectura.nextLine());
                double operacion3 = consulta.dolaresAQuetzales(montoAConvertir);
                System.out.println(montoAConvertir+ " USD equivale a "+operacion3+" GTQ.");
                break;
            case 4:
                System.out.println("Ingrese el monto a convertir:");
                montoAConvertir = Double.valueOf(lectura.nextLine());
                double operacion4 = consulta.quetzalesADolares(montoAConvertir);
                System.out.println(montoAConvertir+ " GTQ equivale a "+operacion4+" USD.");
                break;
            case 5:
                System.out.println("Ingrese el monto a convertir:");
                montoAConvertir = Double.valueOf(lectura.nextLine());
                double operacion5 = consulta.dolaresAPesosMex(montoAConvertir);
                System.out.println(montoAConvertir+ " USD equivale a "+operacion5+" MXN.");
                break;
            case 6:
                System.out.println("Ingrese el monto a convertir:");
                montoAConvertir = Double.valueOf(lectura.nextLine());
                double operacion6 = consulta.pesosMexADolares(montoAConvertir);
                System.out.println(montoAConvertir+ " MXN equivale a "+operacion6+" USD.");
                break;
            case 7:
                break;
            default:
                System.out.println("OPCIÓN NO VÁLIDA");
        }

    }
}
