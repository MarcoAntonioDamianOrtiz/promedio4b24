public class  SumatoriaRecur{

    public static int sumatoriaRecursiva(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n * n + sumatoriaRecursiva(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("La sumatoria de " + n + " es: " + sumatoriaRecursiva(n));
    }
}