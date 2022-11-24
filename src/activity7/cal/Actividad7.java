package activity7.cal;

import java.util.Scanner;

public class Actividad7 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(
                """
                        Elija una opción:
                        1. Iniciar Calculadora
                        2. Abrir un archivo
                        """
        );

        int[] options = {1, 2};
        int option = sc.nextInt();

        try {
            int caseN = options[option - 1] ;
            switch (caseN){
                case 1 -> {
                    new Calculator();
                }
                case 2 -> {
                    System.out.println("Abrió reader file");
                    new FileReader();
                }
            }
        } catch (Exception e){
            throw new Exception("La opción ingresada no existe.");
        }
    }
}
