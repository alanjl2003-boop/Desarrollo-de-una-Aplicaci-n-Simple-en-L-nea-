/**
 * Actividad: Desarrollo de aplicación simple en Java
 * Descripción: Sistema básico para registrar estudiantes y calcular su promedio.
 */
public class EstudianteApp {

    // 1. ATRIBUTOS (Características del estudiante)
    String nombre;
    String carrera;
    double calificacion1;
    double calificacion2;

    // 2. CONSTRUCTOR (Para inicializar los datos al crear el objeto)
    public EstudianteApp(String nombreEstudiante, String carreraEstudiante, double c1, double c2) {
        nombre = nombreEstudiante;
        carrera = carreraEstudiante;
        calificacion1 = c1;
        calificacion2 = c2;
    }

    // 3. MÉTODO PARA CALCULAR EL PROMEDIO
    public double calcularPromedio() {
        return (calificacion1 + calificacion2) / 2.0;
    }

    // 4. MÉTODO PARA MOSTRAR LA INFORMACIÓN
    public void mostrarDetalles() {
        System.out.println("----------------------------------------");
        System.out.println("Estudiante: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio Final: " + calcularPromedio());
        System.out.println("----------------------------------------");
    }

    // EL PROGRAMA PRINCIPAL (Donde se instancian los objetos y se corre todo)
    public static void main(String[] args) {
        System.out.println("Iniciando pruebas de la actividad...\n");

        // Instanciación de Objetos (Crear alumnos reales usando el constructor)
        EstudianteApp alumno1 = new EstudianteApp("Alejandro", "Ingeniería", 90.0, 85.5);
        EstudianteApp alumno2 = new EstudianteApp("Sofia", "Administración", 95.0, 92.0);

        // Uso de los métodos en los objetos creados
        alumno1.mostrarDetalles();
        alumno2.mostrarDetalles();
    }
}