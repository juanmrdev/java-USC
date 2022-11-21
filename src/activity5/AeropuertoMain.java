package activity5;

import java.io.PrintStream;

public class AeropuertoMain {
    static final PrintStream writeConsole = System.out;

    public static void main(String[] args){
        Piloto piloto = new PilotoAvion.Builder().datosPiloto(
                1,
                "Alejandro",
                "Roa",
                25
        ).datosAdicionales(3, 4).build();
        writeConsole.println(piloto.mostrarDatos());

        Piloto pilotoCarro = new PilotoCarro.Builder().build();
        writeConsole.println(pilotoCarro.mostrarDatos());
    }
}
