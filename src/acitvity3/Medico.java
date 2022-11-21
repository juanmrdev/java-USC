package acitvity3;

public final class Medico extends Persona {
    public Medico(String name, String lastName, int age) {
        super(name, lastName, age);
    }

    @Override
    String mostrarDatos() {
        return "El nombre del médico es: " + name + " " + lastName + " y tiene " + age + " años.";
    }
}
