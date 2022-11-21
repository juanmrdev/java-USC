package activity5;

public final class PilotoCarro implements Piloto {

    String nombre = "juan";
    String apellido;
    int id;
    int edad;
    int cantidadCarrosManejados;
    int tiempoServicio;



    private PilotoCarro(Builder builder) {
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.id = builder.id;
        this.edad = builder.edad;
        this.cantidadCarrosManejados = builder.cantidadCarrosManejados;
        this.tiempoServicio = builder.tiempoServicio;
    }

    public static class Builder {
        private String nombre = Piloto.nombre;
        private String apellido = Piloto.apellido;
        private int id = Piloto.id;
        private int edad = Piloto.edad;
        private int cantidadCarrosManejados = 0;
        private int tiempoServicio = 10;
        public Builder datosPiloto(
            int param1,
            String param2,
            String param3,
            int param4
        ) {
            this.id = param1;
            this.nombre = param2;
            this.apellido = param3;
            this.edad = param4;
            return this;
        }
        public Builder datosAdicionales(int param1, int param2) {
            this.cantidadCarrosManejados = param1;
            this.tiempoServicio = param2;
            return this;
        }
        public PilotoCarro build() {
            return new PilotoCarro(this);
        }
    }

    @Override
    public void setCantidadVehiculosManejados(int cantidad) {
        this.cantidadCarrosManejados = cantidad;
    }

    //OVERLOADING
    public void setCantidadVehiculosManejados(int cantidad, int tiempoServicio) {
        this.cantidadCarrosManejados = cantidad;
        this.tiempoServicio = tiempoServicio;
    }
}
