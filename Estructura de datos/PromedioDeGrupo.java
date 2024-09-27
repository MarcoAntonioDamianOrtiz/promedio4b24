import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromedioDeGrupo {

    /* 

    * El tamaño del grupo es N
    * Las calificaciones se leen y se almacenan en un arreglo de tamaño N
    
    */
    public static void main(String[] args) throws IOException {
        int N; // el tamaño del arreglo
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double[] calificaciones; // arreglo de calificaciones
        double suma = 0;  // para sumar calificaciones
        double promedio; // el promedio del grupo 

        System.out.println("Programa que calcula el promedio de un grupo");
        System.out.println("Escribe el tamaño del grupo:");
        entrada = bufer.readLine();
        N = Integer.parseInt(entrada);

        // construye el arreglo de calificaciones
        calificaciones = new double[N];

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Escribe la calificación del alumno " + (i + 1) + ": ");
            entrada = bufer.readLine();
            calificaciones[i] = Double.parseDouble(entrada);
            suma += calificaciones[i];
        }
        promedio = suma / N;

        System.out.println("Las calificaciones del grupo son: ");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println(calificaciones[i]);
        }
        System.out.println("El promedio del grupo es: " + promedio);
    }
}
