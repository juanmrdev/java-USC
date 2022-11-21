package activity6;

import java.util.Scanner;

public final class Menu {
    static Scanner sc = new Scanner(System.in);
    static Scanner scS = new Scanner(System.in);
    String cadena;

    {
        try {
            setupMenu();
        } catch (Exception e) {
            throw new IllegalArgumentException("Ingrese un texto válido");
        }
    }

    public void setupMenu() {
        System.out.println(
            """
                Elija una opción:
                1. charAt
                2. endsWith
                3. startsWith
                4. Equals
                5. indexOf
                6. Lengt
                7. Replace
                8. toLowerCas
                9. toUpperCase
                10. Salir"""
        );
        int option = sc.nextInt();
        System.out.println("Ingrese de texto: ");
        cadena = scS.nextLine();

        try {
            switch (option) {
                case 1 -> {
                    System.out.println("El método retorna un carácter en el índice espeífico de la cadena.");
                    System.out.println(cadena.charAt(1));
                }
                case 2 -> {
                    System.out.println("Verífica si termina la cadena con el parámetro ingresado.");
                    System.out.println(cadena.endsWith("w"));
                }
                case 3 -> {
                    System.out.println("Verífica si empeiza la cadena con el parámetro ingresado.");
                    System.out.println(cadena.startsWith("x"));
                }
                case 4 -> {
                    System.out.println("Verífica si tiene la misma palabra.");
                    System.out.println(cadena.equals("hey"));
                }
                case 5 -> {
                    System.out.println("Pasa una cadena y revisa en que posición se encuentra.");
                    System.out.println(cadena.indexOf("a"));
                }
                case 6 -> {
                    System.out.println("Indica la longitud de una cadena.");
                    System.out.println(cadena.length());
                }
                case 7 -> {
                    System.out.println("Indica la longitud de una cadena.");
                    System.out.println(cadena.replace("a", "u"));
                }
                case 8 -> {
                    System.out.println("Deja en minus todo.");
                    System.out.println(cadena.toLowerCase());
                }
                case 9 -> {
                    System.out.println("Deja en MAYUS todo.");
                    System.out.println(cadena.toUpperCase());
                }
                case 10 -> System.exit(1);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Elegí una opción correcta");
        }
    }
}
