package main.java.org.example;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Prueba Semestral - Programación Avanzada
 * Brian Baldivieso
 * 56237477
 * Prof: Santiago Cal
 */

public class Main {
    // VARIABLES Y OBJETOS GLOBALES
    public static Scanner entrada = new Scanner(System.in);

    // VARIABLES DE COLORES
    public static final String VERDE = "\u001B[32m";
    public static final String ROJO = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    // METODO PARA IMPRIMIR BIENVENIDA
    // USA CODIGO UNICODE PARA COLOREAR LA SALIDA
    public static ArrayList<String> contraseniasIngresadas = new ArrayList<>();
    public static void bienvenida(){

        // TITULO
        System.out.println(VERDE + "██████╗  █████╗ ███████╗███████╗██╗    ██╗ ██████╗ ██████╗ ██████╗               ");
        System.out.println(        "██╔══██╗██╔══██╗██╔════╝██╔════╝██║    ██║██╔═══██╗██╔══██╗██╔══██╗              ");
        System.out.println(        "██████╔╝███████║███████╗███████╗██║ █╗ ██║██║   ██║██████╔╝██║  ██║              ");
        System.out.println(        "██╔═══╝ ██╔══██║╚════██║╚════██║██║███╗██║██║   ██║██╔══██╗██║  ██║              ");
        System.out.println(        "██║     ██║  ██║███████║███████║╚███╔███╔╝╚██████╔╝██║  ██║██████╔╝              ");
        System.out.println(        "╚═╝     ╚═╝  ╚═╝╚══════╝╚══════╝ ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═╝╚═════╝               ");
        System.out.println(        "                                                                                 ");
        System.out.println(        " █████╗  ██████╗███████╗██████╗ ████████╗ █████╗ ██████╗ ██╗     ███████╗███████╗");
        System.out.println(        "██╔══██╗██╔════╝██╔════╝██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗██║     ██╔════╝██╔════╝");
        System.out.println(        "███████║██║     █████╗  ██████╔╝   ██║   ███████║██████╔╝██║     █████╗  ███████╗");
        System.out.println(        "██╔══██║██║     ██╔══╝  ██╔═══╝    ██║   ██╔══██║██╔══██╗██║     ██╔══╝  ╚════██║");
        System.out.println(        "██║  ██║╚██████╗███████╗██║        ██║   ██║  ██║██████╔╝███████╗███████╗███████║");
        System.out.println(        "╚═╝  ╚═╝ ╚═════╝╚══════╝╚═╝        ╚═╝   ╚═╝  ╚═╝╚═════╝ ╚══════╝╚══════╝╚══════╝" + RESET);
        System.out.println("");
    }

    // METODO PARA PEDIR Y RETORNAR UNA CONTRASEÑA
    public static String pedirContrasenias(){
        String contraseniaIngresada = "";

        System.out.println("Ingrese contraseñas una por una (escriba 'fin' para terminar):");
        contraseniaIngresada = entrada.nextLine();
        return contraseniaIngresada.toLowerCase(); // Retorno la contraseña conviertiendola a minuscula
    }

    // METODO PARA AGREGAR UNA CONTRASEÑA AL ARRAYLIST GLOBAL CONVIRTIENDOLA A MINUSCULA
    public static void agregarAArrayList(String contrasenia){
        contrasenia = contrasenia.toLowerCase(); //Ignoro las mayusculas
        contraseniasIngresadas.add(contrasenia); //Añado al arrayList la contraseña ingresada
    }

    // METODO PARA VERIFICAR QUE LA CONTRASEÑA INGRESADA SOLO CONTENGA CARACTERES VÁLIDOS
    public static boolean verificarContraseaIngresada(String contrasenia){
        int contador = 0;
        final int largoContraseña = contrasenia.length();
        boolean valida;

        if (largoContraseña >= 1 && largoContraseña <= 20){
            for (int i = 0; i < largoContraseña; i++) {
                char letra = contrasenia.charAt(i);
                int codigoASCII = (int) letra;

                if (codigoASCII >= 97 && codigoASCII <= 122 || codigoASCII == 241) { //DE 97 A 122 ALFABETO EN MINUSCULA INGLES Y 241 ES Ñ
                    contador++;
                }
            }
            if (contador == largoContraseña){
                valida = true;
            } else {
                valida = false;
                System.out.println("Solo se permiten letras");
            }
        } else {
            System.out.println("Las contraseñas deben contener como mínimo una y como máximo veinte letras.");
            valida = false;
        }
        return valida;
    }


    public static void main(String[] args) {
        String contraseniaIngresada = "";

        // Imprimimos el "logo" del programa al iniciar
        bienvenida();

        while (!contraseniaIngresada.equals("fin")){
            contraseniaIngresada = pedirContrasenias(); //LLamo al metodo para que pida la contraseña y la guardo
            if (!contraseniaIngresada.equals("fin") && verificarContraseaIngresada(contraseniaIngresada)){
                agregarAArrayList(contraseniaIngresada);
            }
        }
        System.out.println(contraseniasIngresadas);

    }
}