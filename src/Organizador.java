public class Organizador {
    private String nombre;

    public Organizador(String nombre) {
        this.nombre = nombre;
    }

    public Evento crearEvento(String nombreEvento, String fecha, Ubicacion ubicacion, String tipo) {
        return new Evento(nombreEvento, fecha, ubicacion, tipo, this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Organizador [nombre=" + nombre + "]";
    }
    
}