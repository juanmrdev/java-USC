package listaClase;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListClass {

    public static void main(String[] args) {

        int howMany = -1;
        Scanner scan = new Scanner(System.in);

        Map<Integer, Student> list = new HashMap<>();

        while (howMany < 0) {
            System.out.println("Cuántos estudiantes desea ingresar?");
            howMany = scan.nextInt( );
        }

        for (int i = 1; i <= howMany; i++) {
            System.out.println("Ingrese estudiante "+ i +":");
            Student s = new Student(scan.nextInt(), scan.next(), scan.nextFloat());

            list.put(s.code(), s);
        }

        System.out.println("Ingrese el id del estudiante que desea buscar:");
        int id = scan.nextInt();
        System.out.println(list.get(id));

    }
}