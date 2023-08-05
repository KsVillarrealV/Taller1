public class Punto29 {
    public static void main(String[] args) {
        int[] numeros = new int[] { 28, 53, 40, 300, 200, 404, 10, 5, 754, 84 };
		int mayor = numeros[0];
		for (int x = 1; x < numeros.length; x++) {
			if (numeros[x] > mayor) {
				mayor = numeros[x];
			}
		}
		System.out.println("El mayor es: " + mayor);
    }
}
