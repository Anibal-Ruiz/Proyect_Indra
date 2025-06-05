import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Inicialización de listas
        List<Evento> eventos = new ArrayList<>();
        List<Usuario> usuarios = new ArrayList<>();
        List<Inscripcion> inscripciones = new ArrayList<>();

        // 1. Crear ubicación
        Ubicacion ubicacionTaller = new Ubicacion("Presencial", "Sala A, Calle Principal 123");

        // 2. Organizador crea evento
        Organizador org = new Organizador("GreenTech");
        Evento taller = org.crearEvento(
            "Taller Reciclaje", 
            "15/10/2023", 
            ubicacionTaller, // Usamos la ubicación
            "Taller"
        );
        eventos.add(taller);

        // 3. Usuario se registra
        Usuario ana = new Usuario("Ana", "ana@email.com");
        usuarios.add(ana);

        // 4. Inscripción
        Inscripcion ins = new Inscripcion(ana, taller);
        inscripciones.add(ins);

        // Mostrar resultados
        System.out.println("✔ Sistema listo con:");
        System.out.println("- Evento: " + taller.getNombre() + 
                          " | Ubicación: " + taller.getUbicacion().getDireccion());
        System.out.println("- Usuario: " + ana.getNombre());
    }

}
