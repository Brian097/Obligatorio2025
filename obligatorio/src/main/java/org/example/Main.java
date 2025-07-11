package org.example;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
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
    public static final String CYAN = "\u001B[36m";
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
     * METODO PARA IMPRIMIR ENCABEZADO DEL MARCO
     * Imprimo un encabezado para pedir las contraseñas al usuario
     */
    public static void mostrarEncabezado(){
        // Mostrar encabezado del marco
        System.out.println(VERDE + "╔════════════════════════════════════════════════════════════════════╗");
        System.out.println(       "║    Ingrese contraseñas una por una (escriba '"+ ROJO + "fin" + VERDE +  "' para terminar)   ║");
        System.out.println(       "╟────────────────────────────────────────────────────────────────────╝" + RESET);
    }

    /**
     * METODO PARA IMPRIMIR EL PIE DEL MARCO
     * Imprimo el cierre del marco después de pedir las contraseñas al usuario
     */
    public static void mostrarPie(){
        // Mostrar pie del marco
        System.out.println(VERDE + "╚═════════════════════════════════════════════════════════════════════" + RESET);
    }

    /**
     * METODO PARA PEDIR Y RETORNAR UNA CONTRASEÑA EN MINUSCULA
     * Este metodo le pide al usuario una contraseña, la convierte en minuscula y la retorna.
     * No se imprime el mensaje acá porque sino se estaria mostrando por cada contraseña que ingresa el usuario.
     * El objetivo principal del metodo es pedir la contraseña y retornarla en minuscula
     */
    public static String pedirContrasenias(){
        //Aca guardo la contraseña ingresada
        String contraseniaIngresada = "";

        //Pido la contraseña
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
             * Al terminar de recorrer el for verifico si la cantidad de caracteres válido es igual a la cantidad
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
                System.out.println(VERDE + "║ " + ROJO + "❌ Solo se permiten letras" + RESET);
            }
        } else {
            /*
             * En caso de que la condicion 'largoContraseña >= 1 && largoContraseña <= 20' no se cumpla
             * imprimo un mensaje de error y establezco la contraseña como invalida.
             */
            System.out.println(VERDE + "║ " + ROJO + "❌ Las contraseñas deben contener como mínimo una y como máximo veinte letras." +  RESET);
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
     * METODO QUE VERIFICA LA REGLA TRES DE LA CONSIGNA
     * Regla tres: "NO debe tener dos ocurrencias consecutivas de la misma letra,
     * exepto por 'ee' o 'oo'."
     */
    public static boolean reglaTres(String contrasenia){
        // Acá guardo en una variable la cantidad de caracteres que contiene la contraseña
        final int largoContraseña = contrasenia.length();

        // En estas variables guardo
        char letra;
        char letraAnterior;

        /**
         * Recorro la contraseña desde la posicion uno, obteniendo ese caracter y el anterior
         */
        for (int i = 1; i < largoContraseña; i++) {
            letra = contrasenia.charAt(i);  // Caracter de la posicion 'i' dada por el for
            letraAnterior = contrasenia.charAt(i - 1); // Caracter de la posicion 'i-1' dada por el for (el anterior)

            // Compruebo que no tenga dos ocurrencias seguidas exeptuando 'ee' o 'oo'
            if (letra == letraAnterior && (letra != 'e' && letra != 'o')) {
                return false; // En caso de que no se cumpla la regla retorno false
            }
        }
        return true; // En caso de que se cumpla la regla retorno true
    }

    /**
     * METODO PARA PEDIR Y ALMACENAR CONTRASEÑAS
     * Pide contraseñas una por una hasta que el usuario escriba 'fin'
     */
    public static void pedirContraseniasHastaFin() {
        String contraseniaIngresada = "";
        boolean esValida;

        while (!contraseniaIngresada.equals("fin")) {
            // Parte izquierda del marco que se muestra al ingresar texto
            System.out.print(VERDE + "║ " + RESET);

            // Pedir contraseña y verificar que solo tenga letras
            contraseniaIngresada = pedirContrasenias();
            esValida = verificarContraseniaIngresada(contraseniaIngresada);

            // Si es válida y no es "fin", la agrego a la lista
            if (!contraseniaIngresada.equals("fin") && esValida) {
                agregarAArrayList(contraseniaIngresada);
            }
        }
    }

    /**
     * METODO PARA VALIDAR LA CONTRASEÑA CON LAS REGLAS
     * Valida las contraseñas del array y muestra si cumple o no las reglas
     */
    public static void validarContrasenias() {
        String cumpleReglaUno;
        String cumpleReglaDos;
        String cumpleReglaTres;
        String esAceptable;

        for (int i = 0; i < contraseniasIngresadas.size(); i++) {
            String contrasenia = contraseniasIngresadas.get(i);

            // Verifico si cumple cada regla y asigno el color correspondiente
            if (reglaUno(contrasenia)) {
                cumpleReglaUno = VERDE;
            } else {
                cumpleReglaUno = ROJO;
            }

            if (reglaDos(contrasenia)) {
                cumpleReglaDos = VERDE;
            } else {
                cumpleReglaDos = ROJO;
            }

            if (reglaTres(contrasenia)) {
                cumpleReglaTres = VERDE;
            } else {
                cumpleReglaTres = ROJO;
            }

            // Si cumple las tres reglas, es aceptable
            if (cumpleReglaUno == VERDE && cumpleReglaDos == VERDE && cumpleReglaTres == VERDE) {
                esAceptable = VERDE;
                System.out.println(esAceptable + "\n✅ <" + contrasenia + "> es aceptado." + RESET);
            } else {
                esAceptable = ROJO;
                System.out.println(esAceptable + "\n❌ <" + contrasenia + "> no fue aceptado." + RESET);
            }

            // Mostrar el resultado de cada regla
            System.out.println(cumpleReglaUno + "   → Debe de contener al menos una vocal" + RESET);
            System.out.println(cumpleReglaDos + "   → No debe tener 3 vocales consecutivas o tres consonantes consecutivas." + RESET);
            System.out.println(cumpleReglaTres + "   → No debe tener dos ocurrencias consecutivas de la misma letra, excepto por 'ee' o 'oo'." + RESET);
        }
    }

    /**
     * METODO PRINCIPAL DONDE SE EJECUTA LA LOGICA DEL PROGRAMA.
     */
    public static void main(String[] args) {
        // Mostrar bienvenida al usuario
        mostrarBienvenida();
        mostrarEncabezado();

        // Pedir contraseñas hasta que el usuario escriba "fin"
        pedirContraseniasHastaFin();

        // Mostrar el pie del marco después de terminar de ingresar
        mostrarPie();

        // Validar las contraseñas ingresadas y mostrar si son aceptadas o no
        validarContrasenias();
    }
}