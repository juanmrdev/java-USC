package acitvity3;

import activity1.universidad.Subject;

import java.io.PrintStream;

public class HospitalMain {
    static final PrintStream writeConsole = System.out;
    public static void main(String[] args){
        Persona paciente = new Paciente("Juan", "Muñoz", 26);
        Persona medico = new Medico("Italia", "Rojas", 51);
        writeConsole.println(paciente.mostrarDatos());
        writeConsole.println(medico.mostrarDatos());
    }
}
