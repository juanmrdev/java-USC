package activity2.cuadratica;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Ecuacion_Cuadratica {
    public static void main(String[] args) {
        double a, b, c;

        System.out.print("Ingrese coeficientes a, b y c de la ecuación: ");
        Scanner reader = new Scanner(System.in);
        a = reader.nextDouble();
        b = reader.nextDouble();
        c = reader.nextDouble();

        if (a == 0) {
            throw new IllegalArgumentException("El coeficiente a no puede ser igual a cero%n");
        } else {

            double discriminante = pow(b, 2) - 4 * a * c;
            
            if (discriminante >= 0) {
                if (discriminante == 0) {
                    double x = -b / (2 * a);
                    System.out.printf("La raíz única es %.3f%n", x);
                } else {
                    double x1, x2;
                    x1 = (-b + sqrt(discriminante)) / (2 * a);
                    x2 = (-b - sqrt(discriminante)) / (2 * a);
                    System.out.printf("La raíz real x1 es %.3f%n", x1);
                    System.out.printf("La raíz real x2 es %.3f%n", x2);
                }
            } else {
                double parteReal, parteImaginaria;
                discriminante = abs(discriminante);
                parteReal = -b / (2 * a);
                parteImaginaria = sqrt(discriminante) / (2 * a);
                System.out.printf("La raíz compleja x1 es %.3f + %.3fi%n", parteReal, parteImaginaria);
                System.out.printf("La raíz compleja x2 es %.3f - %.3fi%n", parteReal, parteImaginaria);
            }
        }
    }
}