package activity4;

import acitvity3.Medico;
import acitvity3.Paciente;
import acitvity3.Persona;

import java.io.PrintStream;

public class ReinoAnimal {
    static final PrintStream writeConsole = System.out;
    public static void main(String[] args){
        Animal serpiente = new Invertebrado();
        serpiente.transportarse();

        Vertebrado pez = new Pez();
        pez.transportarse();

        Vertebrado ave = new Ave();
        ave.transportarse();
        writeConsole.println(ave);
    }
}
