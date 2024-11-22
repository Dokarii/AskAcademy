import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estudiante extends Usuario {
    private String programa;
    private List<String> asignaturas;
    private Map<String, Integer> progreso;

    public Estudiante() {
    }

    public Estudiante(int id, String nombre, String correo, String contraseña, String programa, List<String> asignaturas, Map<String, Integer> progreso) {
        super(id, nombre, correo, contraseña);
        this.programa = programa;
        this.asignaturas = asignaturas != null ? asignaturas : new ArrayList<>();
        this.progreso = progreso != null ? progreso : new HashMap<>();
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public List<String> getasignaturas() {
        return asignaturas;
    }

    public void setasignaturas(List<String> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public Map<String, Integer> getProgreso() {
        return progreso;
    }

    public void setProgreso(Map<String, Integer> progreso) {
        this.progreso = progreso;
    }

    //Metodos
    public void selectAsignatura(String asignatura) {
        asignaturas.add(asignatura);
    }

    public void viewProgress() {
        for (String asignatura : progreso.keySet()) {
            System.out.println("Materia: " + asignatura + ", Progreso: " + progreso.get(asignatura) + "%");
        }
    }
}
