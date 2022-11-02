package listaClase;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListClass {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Map<Integer, Student> listHM = new HashMap<>();
        System.out.println("Cuántos estudiantes desea ingresar?");
        int numStudents = scan.nextInt();
        if(numStudents <= 0) throw new IllegalArgumentException("El número de estudiantes debe ser mayor a 0");

        for (int i = 1; i <= numStudents; i++) {
            System.out.println("Ingrese estudiante "+ i +":");
            Student student = new Student(scan.nextInt(), new Scanner(System.in).nextLine(), scan.nextFloat());
            listHM.put(student.code(), student);
        }

        listHM.forEach((k,v)-> System.out.println(v));

        System.out.println("Ingrese el Id del estudiante que desea buscar:");
        System.out.println(listHM.get( scan.nextInt()));

    }
}