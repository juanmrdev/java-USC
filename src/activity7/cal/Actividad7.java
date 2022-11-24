package activity7.cal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
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
                    try {
                        Scanner scs = new Scanner(System.in);
                        System.out.println("""
                                Ingrese el nombre de un archivo .txt
                                Puedes probar con el archivo llamado aguacate.
                                """);
                        String fileName = scs.nextLine();
                        File myObj = new File("./src/activity7/cal/"+fileName+".txt");
                        Scanner myReader = new Scanner(myObj);
                        BufferedReader reader = new BufferedReader(new FileReader(myObj));
                        while (myReader.hasNextLine()) {
                            String data = myReader.nextLine();
                            System.out.println(data);
                        }
                        myReader.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e){
            throw new Exception("La opción ingresada no existe.");
        }
    }
}
