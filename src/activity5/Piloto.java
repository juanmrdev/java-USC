package activity5;

public interface Piloto {
    int DEFAULT_ID = 0;
    int DEFAULT_AGE = 22;
    String nombre = "nombrePiloto";
    String apellido = "apellidoPiloto";
    int id = DEFAULT_ID;
    int edad = DEFAULT_AGE;
    default String mostrarDatos(){
        return  "el nombre es: "+nombre+", el apellido es "+apellido +
                ",\nel id es "+id+", y tiene una edad de "+edad+".";
    }
    void setCantidadVehiculosManejados(int cantidad);
}
