public class Inscripcion {
 private Usuario usuario;
    private Evento evento;

    public Inscripcion(Usuario usuario, Evento evento) {
        this.usuario = usuario;
        this.evento = evento;   
}

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "Inscripcion [usuario=" + usuario + ", evento=" + evento + "]";
    }

}
