public class Punto32 {
    public static int existeEnArreglo(int[] arreglo, int busqueda) {
        for (int x = 0; x < arreglo.length; x++) {
            if (arreglo[x] == busqueda) {
                return x;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        // Demostración con enteros
        int[] numeros = { 33, 222, 3, 67, 14, 65, 26};
        int numeroBuscado = 33;
        int posicionDeElementoBuscado = existeEnArreglo(numeros, numeroBuscado);
        if (posicionDeElementoBuscado == -1) {
            System.out.println("El elemento NO existe en el arreglo");
        } else {
            System.out.println("El elemento existe en la posición: " + posicionDeElementoBuscado);
        }
    }
}
