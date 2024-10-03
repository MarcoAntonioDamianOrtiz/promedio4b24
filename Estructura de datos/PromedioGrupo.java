
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromedioGrupo {

    //Arreglo de un tipo de dato abtracto(TDA)
    public static estudiante[] estudiantes;

    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    public static void leerEstudiantes() throws IOException {
        String matricula, nombre;

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("==============================================================================");
            System.out.println("Informacion del estudiante [" + (i + 0) + "]");
            System.out.println("Matricula: ");
            entrada = bufer.readLine();
            matricula = entrada;
            System.out.println("Nombre: ");
            entrada = bufer.readLine();
            nombre = entrada;
            estudiante e = new estudiante(matricula, nombre);

            System.out.println("Escriba  calificacion de estructuras: ");
            entrada = bufer.readLine();
            e.setEstructuras(Double.parseDouble(entrada));

            System.out.println("Escriba  calificacion de evalucaion: ");
            entrada = bufer.readLine();
            e.setEvaluacion(Double.parseDouble(entrada));

            System.out.println("Escriba  calificacion de ingles: ");
            entrada = bufer.readLine();
            e.setIngles(Double.parseDouble(entrada));
            e.setPromedio();
            estudiantes[i] = e; //agregamos un objeto estudiante al arreglo
        }
    }

    public static void imprimirEstudiantes() {
        for (estudiante e : estudiantes) {
            System.out.println(e.toString());

        }

    }

    public static double calcularPromedioGrupo(){
        double suma = 0;

        for ( estudiante e : estudiantes){
            suma += e.getPromedio();
        }
        return suma / estudiantes.length;
    }

    public static void main(String[] args) throws IOException {
        int N;

        //Arreglo de tipo de dato primitiva(double)
        double[] calificaciones;
        double suma = 0;
        double promedio;

        System.out.println("Programa que calgula promedio de grupo");
        System.out.println("Escribe tamaño del grupo: ");
        entrada = bufer.readLine();
        N = Integer.parseInt(entrada);

        //Construyendo el areeglo de estudiantes
        estudiantes = new estudiante[N];
        //lectura de la informacion de los estudiantes
        leerEstudiantes();

        //contruimos el arreglo de calificaciones 
        calificaciones = new double[N];

        // imprimir el contenido del arrglo estudiantes
        System.out.println(estudiantes);

        // 
        imprimirEstudiantes();

        // calcular promedio de grupo
        promedio = calcularPromedioGrupo();

        System.out.println("El promedio del grupo es: " + promedio);
    }
}
