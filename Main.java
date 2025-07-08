import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> contrasenas = new ArrayList<>();
        String input;

        // Mostrar encabezado del marco
        System.out.println(ANSI_CYAN +
            "╔════════════════════════════════════════════════════════════════════╗");
        System.out.println("║    Ingrese contraseñas una por una (escriba 'fin' para terminar)  ║");
        System.out.println("╟────────────────────────────────────────────────────────────────────╢" +
            ANSI_RESET);

        while (true) {
            System.out.print("» "); // Indicador de entrada
            input = entrada.nextLine().trim();

            if (input.equalsIgnoreCase("fin")) {
                contrasenas.add("fin");
                break;
            }

            contrasenas.add(input);
        }

        // Mostrar el contenido dentro del marco
        System.out.println(ANSI_CYAN + "║                                                                    ║");
        for (String pass : contrasenas) {
            // Aseguramos que el texto quede dentro del marco (máx. 66 caracteres)
            String linea = String.format("║ %-66s║", pass);
            System.out.println(linea);
        }
        System.out.println("╚════════════════════════════════════════════════════════════════════╝" +
            ANSI_RESET);
    }
}
