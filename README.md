# Conversor de Monedas

Este es un programa en Java que convierte varias monedas utilizando la API de ExchangeRate-API. El programa permite a los usuarios convertir entre Dólares Estadounidenses (USD), Pesos Colombianos (COP), Quetzales Guatemaltecos (GTQ) y Pesos Mexicanos (MXN).

## Características

- Conversión de USD a COP y viceversa.
- Conversión de USD a GTQ y viceversa.
- Conversión de USD a MXN y viceversa.
- Interfaz de usuario en la línea de comandos.
- Validación de entradas de usuario.
- Reutilización de código para realizar las solicitudes HTTP y procesar las respuestas.

## Requisitos

- Java 11 o superior.
- Conexión a internet para acceder a la API de ExchangeRate-API.
- Una cuenta y clave de API de [ExchangeRate-API](https://www.exchangerate-api.com/).

## Instalación

1. Clona este repositorio:
   ```sh
   git clone https://github.com/tu-usuario/conversor-de-monedas.git
2. Navega al directorio del proyecto:
cd conversor-de-monedas

Asegúrate de tener Java instalado y configurado en tu sistema.
## Configuración
1. Obtén una clave de API de ExchangeRate-API.

2. Abre el archivo ConvirtiendoMonedas.java y reemplaza el valor de API_KEY con tu clave de API:

private static final String API_KEY = "tu-clave-de-api";

## Uso
1. Compila el programa:
javac -d out src/com/aluracursos/decoderchallenge/*.java

2. Ejecuta el programa:
java -cp out com.aluracursos.decoderchallenge.Inicio

3. Sigue las instrucciones en la consola para seleccionar la conversión deseada y proporcionar el monto a convertir.

## Estructura del Código

- Inicio.java: Contiene el método main y maneja la interacción con el usuario.
= ConvirtiendoMonedas.java: Contiene los métodos para realizar las conversiones de moneda utilizando la API de ExchangeRate-API.
- Resultado.java: Clase para deserializar las respuestas JSON de la API.

## Ejemplo
****BIENVENIDX AL CONVERSOR DE MONEDAS****
Escriba el número correspondiente a su opción de conversión preferida:
1 - Dólar estadounidense (USD) a Peso colombiano (COP)
2 - Peso colombiano (COP) a Dólar estadounidense (USD)
3 - Dólar estadounidense (USD) a Quetzal guatemalteco (GTQ)
4 - Quetzal guatemalteco (GTQ) a Dólar estadounidense (USD)
5 - Dólar estadounidense (USD) a Peso mexicano (MXN)
6 - Peso mexicano (MXN) a Dólar estadounidense (USD)
7 - SALIR

Ingrese el monto a convertir:
100
100 USD equivale a 40385.102 COP.
¿Desea realizar otra conversión? (Si/No)

