package org.example;

/**
 * Prueba Semestral - Programación Avanzada
 * Brian Baldivieso
 * 56237477
 * Prof: Santiago Cal
 */

public class Main {

    // METODO PARA IMPRIMIR BIENVENIDA
    // USA CODIGO UNICODE PARA COLOREAR LA SALIDA
    public static void bienvenida(){
        // VARIABLES DE COLORES
        final String VERDE = "\u001B[32m";
        final String ROJO = "\u001B[31m";
        final String RESET = "\u001B[0m";

        // TITULO
        System.out.println(VERDE + "██████╗  █████╗ ███████╗███████╗██╗    ██╗ ██████╗ ██████╗ ██████╗               ");
        System.out.println("██╔══██╗██╔══██╗██╔════╝██╔════╝██║    ██║██╔═══██╗██╔══██╗██╔══██╗              ");
        System.out.println("██████╔╝███████║███████╗███████╗██║ █╗ ██║██║   ██║██████╔╝██║  ██║              ");
        System.out.println("██╔═══╝ ██╔══██║╚════██║╚════██║██║███╗██║██║   ██║██╔══██╗██║  ██║              ");
        System.out.println("██║     ██║  ██║███████║███████║╚███╔███╔╝╚██████╔╝██║  ██║██████╔╝              ");
        System.out.println("╚═╝     ╚═╝  ╚═╝╚══════╝╚══════╝ ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═╝╚═════╝               ");
        System.out.println("                                                                                 ");
        System.out.println(" █████╗  ██████╗███████╗██████╗ ████████╗ █████╗ ██████╗ ██╗     ███████╗███████╗");
        System.out.println("██╔══██╗██╔════╝██╔════╝██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗██║     ██╔════╝██╔════╝");
        System.out.println("███████║██║     █████╗  ██████╔╝   ██║   ███████║██████╔╝██║     █████╗  ███████╗");
        System.out.println("██╔══██║██║     ██╔══╝  ██╔═══╝    ██║   ██╔══██║██╔══██╗██║     ██╔══╝  ╚════██║");
        System.out.println("██║  ██║╚██████╗███████╗██║        ██║   ██║  ██║██████╔╝███████╗███████╗███████║");
        System.out.println("╚═╝  ╚═╝ ╚═════╝╚══════╝╚═╝        ╚═╝   ╚═╝  ╚═╝╚═════╝ ╚══════╝╚══════╝╚══════╝" + RESET);
    }

    public static void main(String[] args) {
        // Imprimimos el "logo" del programa al iniciar
        bienvenida();

        

    }
}