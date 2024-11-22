import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Profesor extends Usuario{
    private String area;
    private String asignaturas;
    private List<String> quizzesCreados;

    public Profesor() {
    }

    public Profesor(int id, String nombre, String correo, String contraseña, String area, String asignaturas, List<String> quizzesCreados) {
        super(id, nombre, correo, contraseña);
        this.area = area;
        this.asignaturas = asignaturas;
        this.quizzesCreados = quizzesCreados;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String asignaturas) {
        this.asignaturas = asignaturas;
    }

    public List<String> getQuizzesCreados() {
        return quizzesCreados;
    }

    public void setQuizzesCreados(List<String> quizzesCreados) {
        this.quizzesCreados = quizzesCreados;
    }

    //Metodos
    public void crearQuiz(String quiz) {
        quizzesCreados.add(quiz);
    }

    public void verProgresoEstudiante(int idEstudiante, Map<Integer, Estudiante> estudiantes) {
        Estudiante estudiante = estudiantes.get(idEstudiante);
        if (estudiante != null) {
            System.out.println("Progreso del estudiante " + estudiante.getNombre() + ":");
            estudiante.viewProgress();
        } else {
            System.out.println("No se encontró al estudiante con ID: " + idEstudiante);
        }
    }
}
