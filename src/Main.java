import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante(
                1, "Jordan Sanchez", "jordansanchez@gamil.com", "1234",
                "Ingeniería de Sistemas", new ArrayList<>(), new HashMap<>()
        );

        Estudiante estudiante2 = new Estudiante(
                2, "Manuela Vargas", "manuelavargas@gmail.com", "5678",
                "Matemáticas", new ArrayList<>(), new HashMap<>()
        );

        // Añadir asignaturas y progreso al estudiante1
        estudiante1.selectAsignatura("Programación");
        estudiante1.selectAsignatura("Bases de Datos");
        estudiante1.getProgreso().put("Programación", 80);
        estudiante1.getProgreso().put("Bases de Datos", 60);

        // Crear profesor
        Profesor profesor1 = new Profesor(
                3, "Julian Yepes", "julianyepes@gmail.com", "profe123",
                "Ciencias de la Computación", "Programación", new ArrayList<>()
        );

        profesor1.crearQuiz("Quiz 1 - Estructuras de Datos");

        Map<Integer, Estudiante> estudiantes = new HashMap<>();
        estudiantes.put(estudiante1.getId(), estudiante1);
        estudiantes.put(estudiante2.getId(), estudiante2);

        System.out.println("=== Ver Progreso del Estudiante ===");
        profesor1.verProgresoEstudiante(1, estudiantes);

        System.out.println("\n=== Intentar Ver Progreso de un Estudiante Inexistente ===");
        profesor1.verProgresoEstudiante(99, estudiantes);

        System.out.println("\n=== Login del Estudiante ===");
        if (estudiante1.login("jordansanchez@gamil.com", "1234")) {
            System.out.println("¡Login exitoso para " + estudiante1.getNombre() + "!");
        } else {
            System.out.println("Credenciales incorrectas para " + estudiante1.getNombre());
        }

        estudiante1.logout();

        System.out.println("\n=== Quizzes Creados por el Profesor ===");
        System.out.println("Profesor: " + profesor1.getNombre());
        System.out.println("Quizzes: " + profesor1.getQuizzesCreados());

        // Ver progreso del estudiante2 (sin progreso inicial)
        System.out.println("\n=== Ver Progreso del Estudiante 2 ===");
        profesor1.verProgresoEstudiante(2, estudiantes);
    }
}