package activity5;

public final class PilotoBarco implements Piloto {
    String nombre;
    String apellido;
    int id;
    int edad;
    int cantidadBarcosManejados;
    int tiempoServicio;

    private PilotoBarco(Builder builder) {
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.id = builder.id;
        this.edad = builder.edad;
        this.cantidadBarcosManejados = builder.cantidadBarcosManejados;
        this.tiempoServicio = builder.tiempoServicio;
    }

    public static class Builder {
        private String nombre = Piloto.nombre;
        private String apellido = Piloto.apellido;
        private int id = Piloto.id;
        private int edad = Piloto.edad;
        private int cantidadBarcosManejados = 0;
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
            this.cantidadBarcosManejados = param1;
            this.tiempoServicio = param2;
            return this;
        }
        public PilotoBarco build() {
            return new PilotoBarco(this);
        }
    }

    @Override
    public String mostrarDatos() {
        return "el nombre es: "+nombre+", el apellido es "+apellido +
                ", el id es "+id+", y tiene una edad de "+edad+".\n" +
                "Ha manejado "+cantidadBarcosManejados+" barcos";
    }

    @Override
    public void setCantidadVehiculosManejados(int cantidad) {
        this.cantidadBarcosManejados = cantidad;
    }

    //OVERLOADING
    public void setCantidadVehiculosManejados(int cantidad, int tiempoServicio) {
        this.cantidadBarcosManejados = cantidad;
        this.tiempoServicio = tiempoServicio;
    }
}
