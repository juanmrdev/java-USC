package activity5;

public final class PilotoAvion implements Piloto {
    String nombre = "juan";
    String apellido;
    int id;
    int edad;
    int cantidadAvionesManejados = 0;
    int tiempoServicio = 10;

    private PilotoAvion(PilotoAvion.Builder builder) {
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.id = builder.id;
        this.edad = builder.edad;
        this.cantidadAvionesManejados = builder.cantidadAvionesManejados;
        this.tiempoServicio = builder.tiempoServicio;
    }

    public static class Builder {
        private String nombre = Piloto.nombre;
        private String apellido = Piloto.apellido;
        private int id = Piloto.id;
        private int edad = Piloto.edad;
        private int cantidadAvionesManejados = 0;
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
            this.cantidadAvionesManejados = param1;
            this.tiempoServicio = param2;
            return this;
        }
        public PilotoAvion build() {
            return new PilotoAvion(this);
        }
    }

    @Override
    public String mostrarDatos() {
        return "el nombre es: "+nombre+", el apellido es "+apellido +
                ", el id es "+id+", y tiene una edad de "+edad+".\n" +
                "Ha manejado "+cantidadAvionesManejados+" aviones";
    }

    @Override
    public void setCantidadVehiculosManejados(int cantidad) {
        this.cantidadAvionesManejados = cantidad;
    }

    //OVERLOADING
    public void setCantidadVehiculosManejados(int cantidad, int tiempoServicio) {
        this.cantidadAvionesManejados = cantidad;
        this.tiempoServicio = tiempoServicio;
    }
}
