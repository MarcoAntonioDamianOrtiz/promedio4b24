public class Fact {

    public static int recursivo(int num) {
        int fact = 1;
        if (num != 0) {
            for (int i = num; i > 0; i--) {
                fact *= i;
            }
        }
        return fact;
    }

    public static void main(String[] args) {
        int result = recursivo(6);
        System.out.println(result); 
    }
}
//interactivo