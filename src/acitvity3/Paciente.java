package acitvity3;

public final class Paciente extends Persona implements PacienteAttr {
    int codigoPaciente;
    String diagnostico;
    public Paciente(String name, String lastName, int age) {
        super(name, lastName, age);
        this.codigoPaciente = PacienteAttr.codigoPaciente;
        this.diagnostico = PacienteAttr.diagnostico;
    }
    @Override
    String mostrarDatos() {
        return "El nombre del paciente es: " + name + " " + lastName + " y tiene " + age + " años." +
                "\nSu código es: " + codigoPaciente + " y su diagnóstico: " + diagnostico;
    }
}
