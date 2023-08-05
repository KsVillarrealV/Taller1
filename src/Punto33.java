import java.util.Arrays;

public class Punto33 {
    public static void main(String[] args) {
        int [] orden ={9, 2, 0, 0, 0, 2, 8, 9, 10, 0, 11};
        Arrays.sort(orden);
        int contador = 0;
        int aux = orden[0];
        for (int i = 0; i < orden.length; i++) {
            if (aux == orden[i]) {
                contador++;
            }else{
                System.out.println("El numero "+aux+" se repite: \n"+contador+" veces." );
                contador = 1;
                aux = orden[i];
            }
        }
    }    
}
