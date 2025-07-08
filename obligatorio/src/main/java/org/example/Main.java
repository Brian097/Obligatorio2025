package org.example;

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

    /*
     * Variables con codigo ANSI para colorear la salida en consola.
     * Puede que no funcione en todas las consolas.
     */
    public static final String VERDE = "\u001B[32m";
    public static final String ROJO = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    // ArrayList global para almacenar las contraseñas válidas
    public static ArrayList<String> contraseniasIngresadas = new ArrayList<>();

    /**
     * METODO PARA IMPRIMIR BIENVENIDA AL PROGRAMA
     * Este metodo imprime una bienvenida al programa usando colores con codigo ANSI
     */
    public static void mostrarBienvenida(){

        // TITULO EN ESTILO ASCII
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

    /**
     * METODO PARA PEDIR Y RETORNAR UNA CONTRASEÑA
     * Este metodo le pide al usuario una contraseña, la convierte en minuscula y la retorna
     */
    public static String pedirContrasenias(){
        String contraseniaIngresada = "";

        System.out.println("Ingrese contraseñas una por una (escriba 'fin' para terminar):");
        contraseniaIngresada = entrada.nextLine();

        contraseniaIngresada = contraseniaIngresada.toLowerCase(); // Convierto la contraseña ingresada a minuscula
        return contraseniaIngresada; // Retorno la contraseña
    }

    /**
     * METODO PARA VERIFICAR QUE LA CONTRASEÑA INGRESADA SOLO CONTENGA CARACTERES VÁLIDOS
     *
     * Recibe una contraseña y verifica que se hayan ingresado unicamente caracteres válidos.
     * Luego de verificar retorna un booleano
     */
    public static boolean verificarContraseniaIngresada(String contrasenia){

        // Este contador se usa para contar la cantidad de caracteres válidos
        int contador = 0;

        // Acá guardo en una variable la cantidad de caracteres que contiene la contraseña
        final int largoContraseña = contrasenia.length();

        // Esta variable almacena si la contraseña es válida
        boolean valida;

        // Compruebo que la cantidad de caracteres este dentro de los parametros.
        if (largoContraseña >= 1 && largoContraseña <= 20){

            /*
             * Si la cantidad de caracteres esta dentro de los parametros recorro la contraseña verificando que sus
             * caracteres sean válidos (solo se aceptan de la 'a' a la 'z' incluyendo 'ñ')
             */
            for (int i = 0; i < largoContraseña; i++) {
                char letra = contrasenia.charAt(i); // Obtendo el caracter de la posicion (i) dada por el bucle for

                /*
                 * Acá convierto a int el caracter obtenido.
                 * Al realizar esta conversión obtenemos el código ASCII del mismo
                 */
                int codigoASCII = (int) letra;
                /*
                 * Verifico que sea un caracter válido, si el número se encuentra entre 97 y 112 o es 241 es válido
                 * DE 97 A 122 ALFABETO EN MINUSCULA INGLES Y 241 ES Ñ
                 */
                if (codigoASCII >= 97 && codigoASCII <= 122 || codigoASCII == 241) {
                    contador++; // Al ser válido sumo uno al contador
                }
            }

            /*
             * Al terminar de recorrel el for verifico si la cantidad de caracteres válido es igual a la cantidad
             * de caracteres que contiene la contraseña, ya que si esto se cumple significa que la contraseña es válida.
             */
            if (contador == largoContraseña){
                valida = true;
            } else {
                /*
                 * Si para este punto la condicion no se cumple significa que se ingresó un caracter invalido,
                 * así que establezco la contraseña como invalidae y imprimo un mensaje de que solo se aceptan letras.
                 */
                valida = false;
                System.out.println("Solo se permiten letras");
            }
        } else {
            /*
             * En caso de que la condicion 'largoContraseña >= 1 && largoContraseña <= 20' no se cumpla
             * imprimo un mensaje de error y establezco la contraseña como invalida.
             */
            System.out.println("Las contraseñas deben contener como mínimo una y como máximo veinte letras.");
            valida = false;
        }

        //Al terminar las verificaciones retorno el resultado
        return valida;
    }

    /**
     * METODO PARA AGREGAR UNA CONTRASEÑA AL ARRAYLIST GLOBAL
     *  Recibe una contraseña (en este caso previametente verificada por metodo "verificarContraseniaIngresada"),
     *  y la guarda en el arrayList global.
     */
    public static void agregarAArrayList(String contrasenia){
        contraseniasIngresadas.add(contrasenia); //Añado al arrayList la contraseña ingresada
    }

    /**
     * METODO QUE DICE SI UN CARACTER ES UNA VOCAL O NO
     */
    public static boolean esVocal(char letra) {
        // Verifico si la letra es una de las vocales usando logica 'or' y retorno el resultado
        if (letra == 'a' ||letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ){
            return true;
        } else {
            return false;
        }
    }

    /**
     * METODO QUE VERIFICA LA REGLA UNO DE LA CONSIGNA
     * Regla uno: "Debe de contener al menos una vocal."
     */
    public static boolean reglaUno(String contrasenia){
        // Acá guardo en una variable la cantidad de caracteres que contiene la contraseña
        final int largoContraseña = contrasenia.length();
        boolean seCumple = false; // En esta variable guardo si se cumplio la regla, la inicializo en false

        // Recorro la contraseña para ir verificando letra por letra
        for (int i = 0; i < largoContraseña; i++) {
            // Verifico la letra obtenida y retorno el resultado
            if (esVocal(contrasenia.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    /**
     * METODO QUE VERIFICA LA REGLA DOS DE LA CONSIGNA
     * Regla dos: "No debe de tener tres vocales consecutivas o tres consonantes consecutivas"
     */
    public static boolean reglaDos(String contrasenia){
        // Acá guardo en una variable la cantidad de caracteres que contiene la contraseña
        final int largoContraseña = contrasenia.length();

        //En estos dos contadores guardo la cantidad de vocales o consonantes seguidas tengo
        int cantidadVocales = 0;
        int cantidadConsonantes = 0;

        // Recorro la contraseña
        for (int i = 0; i < largoContraseña; i++) {
            /*
             * Obtengo el caracter de la posicion i dada por el bucle for y
             * verifico si es vocal usando el metodo 'esVocal'
             */
            if (esVocal(contrasenia.charAt(i))) {
                /*
                 * Sumo uno al contador y reinicio el contador de consonantes
                 */
                cantidadVocales++;
                cantidadConsonantes = 0;
            } else {
                /*
                 * Sumo uno al contador y reinicio el contador de vocales
                 */
                cantidadConsonantes++;
                cantidadVocales = 0;
            }
            /* Verifico que ninguno de los contadores haya llegado a 3,
             * ya que significaria que hay 3 vocales o 3 consonantes seguidas.
             */
            if (cantidadConsonantes == 3 || cantidadVocales == 3) {
                return false; // Se rompio la regla, asi que retorno false.
            }
        }
        return true; // Si llego acá se no se rompio la regla, así que retorno true.
    }


    /**
     * METODO PRINCIPAL DONDE SE EJECUTA LA LOGICA DEL PROGRAMA.
     */
    public static void main(String[] args) {
        String contraseniaIngresada = "";

        // Imprimimos el "logo" del programa al iniciar
        mostrarBienvenida();

        while (!contraseniaIngresada.equals("fin")){
            contraseniaIngresada = pedirContrasenias(); //LLamo al metodo para que pida la contraseña y la guardo
            if (!contraseniaIngresada.equals("fin") && verificarContraseniaIngresada(contraseniaIngresada)){
                agregarAArrayList(contraseniaIngresada);
            }
        }

        for (int i = 0; i < contraseniasIngresadas.size(); i++) {
            boolean reglaUno;
            contraseniaIngresada = contraseniasIngresadas.get(i);
            reglaUno = reglaUno(contraseniaIngresada);
            if (reglaUno){
                System.out.println(contraseniaIngresada + " cumple regla uno");
            }
            if (reglaDos(contraseniaIngresada)){
                System.out.println(contraseniaIngresada + " cumple regla dos");
            }
        }

        System.out.println(contraseniasIngresadas);

    }
}