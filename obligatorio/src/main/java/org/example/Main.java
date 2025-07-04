package org.example;

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

    // METODO PARA IMPRIMIR BIENVENIDA
    // USA CODIGO UNICODE PARA COLOREAR LA SALIDA
    public static void bienvenida(){
        // VARIABLES DE COLORES
        final String VERDE = "\u001B[32m";
        final String ROJO = "\u001B[31m";
        final String RESET = "\u001B[0m";

        // TITULO
        System.out.println(VERDE + "██████╗  █████╗ ███████╗███████╗██╗    ██╗ ██████╗ ██████╗ ██████╗               ");
        System.out.println(        "██╔══██╗██╔══██╗██╔════╝██╔════╝██║    ██║██╔═══██╗██╔══██╗██╔══██╗              ");
        System.out.println(        "██████╔╝███████║███████╗███████╗██║ █╗ ██║██║   ██║██████╔╝██║  ██║              ");
        System.out.println(        "██╔═══╝ ██╔══██║╚════██║╚════██║██║███╗██║██║   ██║██╔══██╗██║  ██║              ");
        System.out.println(        "██║     ██║  ██║███████║███████║╚███╔███╔╝╚██████╔╝██║  ██║██████╔╝              ");
        System.out.println(        "╚═╝     ╚═╝  ╚═╝╚══════╝╚══════╝ ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═╝╚═════╝               ");
        System.out.println("                                                                                 ");
        System.out.println(        " █████╗  ██████╗███████╗██████╗ ████████╗ █████╗ ██████╗ ██╗     ███████╗███████╗");
        System.out.println(        "██╔══██╗██╔════╝██╔════╝██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗██║     ██╔════╝██╔════╝");
        System.out.println(        "███████║██║     █████╗  ██████╔╝   ██║   ███████║██████╔╝██║     █████╗  ███████╗");
        System.out.println(        "██╔══██║██║     ██╔══╝  ██╔═══╝    ██║   ██╔══██║██╔══██╗██║     ██╔══╝  ╚════██║");
        System.out.println(        "██║  ██║╚██████╗███████╗██║        ██║   ██║  ██║██████╔╝███████╗███████╗███████║");
        System.out.println(        "╚═╝  ╚═╝ ╚═════╝╚══════╝╚═╝        ╚═╝   ╚═╝  ╚═╝╚═════╝ ╚══════╝╚══════╝╚══════╝" + RESET);
    }

    public static String pedirContrasenias(){
        String contraseniaIngresada = "";

        System.out.println("Ingrese contraseñas una por una (escriba 'fin' para terminar):");
        contraseniaIngresada = entrada.nextLine();
        return contraseniaIngresada.toLowerCase(); // Retorno la contraseña conviertiendola a minuscula

    }

    public static void main(String[] args) {
        ArrayList<String> contrasenas = new ArrayList<>();
        String contraseniaIngresada = "";

        // Imprimimos el "logo" del programa al iniciar
        bienvenida();

        while (!contraseniaIngresada.equals("fin")){
            contraseniaIngresada = pedirContrasenias(); //LLamo al metodo para que pida la contraseña y la guardo

            contraseniaIngresada = contraseniaIngresada.toLowerCase(); //Ignoro las mayusculas

            contrasenas.add(contraseniaIngresada); //Añado al arrayList la contraseña ingresada
        }

    }
}