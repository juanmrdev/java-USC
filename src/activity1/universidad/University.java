package activity1.universidad;

import java.io.PrintStream;

public class University {
    static final PrintStream writeConsole = System.out;
    public static void main(String[] args){
        Subject subject = new Subject(
        "APO", "", 323, 2020
        );

        writeConsole.println(subject);
        writeConsole.println(subject.getProfessor());
    }
}