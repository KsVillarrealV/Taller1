import java.util.Arrays;

public class Punto31 {
    public static void main(String[] args) {
        int[] numeros = { 3, 5, 1, 2, 7, 0, -1, 71, 80, 7};
        Arrays.sort(numeros);
        for (int n : numeros) {
            System.out.println(n);
        }
    }
}
