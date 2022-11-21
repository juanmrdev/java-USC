package acitvity3;

public abstract class Persona {

    String name = "";
    String lastName="";
    int age = 0;

    public Persona(
        String name,
        String lastName,
        int age
    ){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    abstract String mostrarDatos();
}
