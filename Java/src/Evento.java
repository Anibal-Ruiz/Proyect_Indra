public class Evento {
  private String nombre;
    private String fecha;
    private Ubicacion ubicacion; 
    private String tipo;
    private Organizador organizador;

    public Evento(String nombre, String fecha, Ubicacion ubicacion, String tipo, Organizador organizador) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
        this.organizador = organizador;
    }

    public String getNombre() {
        return nombre;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    public void setOrganizador(Organizador organizador) {
        this.organizador = organizador;
    }

    /**
     * Inscribe un usuario a este evento.
     * @param usuario El usuario a inscribir.
     * @return La inscripción creada.
     */
    public Inscripcion inscribirUsuario(Usuario usuario) {
        return new Inscripcion(usuario, this);
    }

    @Override
    public String toString() {
        return "Evento [nombre=" + nombre + ", fecha=" + fecha + ", ubicacion=" + ubicacion + ", tipo=" + tipo
                + ", organizador=" + organizador + "]";
    } 
    
}
