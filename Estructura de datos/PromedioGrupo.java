import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromedioGrupo {

    // Arreglo de un tipo de dato abstracto (TDA)
    public static estudiante[] estudiantes;

    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    // Método para leer la información de los estudiantes
    public static void leerEstudiantes() throws IOException {
        String matricula, nombre;

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("==============================================================================");
            System.out.println("Informacion del estudiante [" + (i + 1) + "]");
            System.out.println("Matricula: ");
            entrada = bufer.readLine();
            matricula = entrada;
            System.out.println("Nombre: ");
            entrada = bufer.readLine();
            nombre = entrada;
            estudiante e = new estudiante(matricula, nombre);

            System.out.println("Escriba calificacion de estructuras: ");
            entrada = bufer.readLine();
            e.setEstructuras(Double.parseDouble(entrada));

            System.out.println("Escriba calificacion de evaluacion: ");
            entrada = bufer.readLine();
            e.setEvaluacion(Double.parseDouble(entrada));

            System.out.println("Escriba calificacion de ingles: ");
            entrada = bufer.readLine();
            e.setIngles(Double.parseDouble(entrada));
            e.setPromedio();
            estudiantes[i] = e; // Agregamos un objeto estudiante al arreglo
        }
    }

    // Método para imprimir la información de los estudiantes
    public static void imprimirEstudiantes() {
        for (estudiante e : estudiantes) {
            System.out.println(e.toString());
        }
    }

    // Método para calcular el promedio general del grupo
    public static double calcularPromedioGrupo() {
        double suma = 0;
        for (estudiante e : estudiantes) {
            suma += e.getPromedio();
        }
        return suma / estudiantes.length;
    }

    // Método para calcular el promedio de estructuras
    public static double calcularPromedioEstructuras() {
        double suma = 0;
        for (estudiante e : estudiantes) {
            suma += e.getEstructuras();
        }
        return suma / estudiantes.length;
    }

    // Método para calcular el promedio de evaluación
    public static double calcularPromedioEvaluacion() {
        double suma = 0;
        for (estudiante e : estudiantes) {
            suma += e.getEvaluacion();
        }
        return suma / estudiantes.length;
    }

    // Método para calcular el promedio de inglés
    public static double calcularPromedioIngles() {
        double suma = 0;
        for (estudiante e : estudiantes) {
            suma += e.getIngles();
        }
        return suma / estudiantes.length;
    }
    public static void main(String[] args) throws IOException {
        int N;

        // Arreglo de tipo de dato primitivo (double)
        double[] calificaciones;
        double promedio;

        System.out.println("Programa que calcula promedio de grupo");
        System.out.println("Escribe tamaño del grupo: ");
        entrada = bufer.readLine();
        N = Integer.parseInt(entrada);

        // Construyendo el arreglo de estudiantes
        estudiantes = new estudiante[N];
        // Lectura de la información de los estudiantes
        leerEstudiantes();

        // Construimos el arreglo de calificaciones
        calificaciones = new double[N];

        // Imprimir el contenido del arreglo estudiantes
        System.out.println(estudiantes);

        // Imprimir los estudiantes
        imprimirEstudiantes();

        // Calcular promedio de grupo
        promedio = calcularPromedioGrupo();
        System.out.println("El promedio general del grupo es: " + promedio);

        // Calcular promedio por materias
        double promedioEstructuras = calcularPromedioEstructuras();
        double promedioEvaluacion = calcularPromedioEvaluacion();
        double promedioIngles = calcularPromedioIngles();

        System.out.println("El promedio del grupo en Estructuras es: " + promedioEstructuras);
        System.out.println("El promedio del grupo en Evaluación es: " + promedioEvaluacion);
        System.out.println("El promedio del grupo en Inglés es: " + promedioIngles);
    }
}
