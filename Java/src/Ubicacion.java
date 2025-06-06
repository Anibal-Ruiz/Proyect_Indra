public class Ubicacion {
 private String tipo; // "Online" o "Presencial"
    private String direccion; // Enlace o dirección física

    public Ubicacion(String tipo, String direccion) {
        this.tipo = tipo;
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Ubicacion [tipo=" + tipo + ", direccion=" + direccion + "]";
    } 
       
}
