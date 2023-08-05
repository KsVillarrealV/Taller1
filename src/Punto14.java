import javax.swing.JOptionPane;

public class Punto14 {
    public static void main(String[] args) {
        int i;
        int suma = 0;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero entero positivo: "));

        for (i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma = suma + i;
            }
        }
        if (suma == numero) {

            JOptionPane.showMessageDialog(null, "El número ingresado es perfecto.");

        } else {

            JOptionPane.showMessageDialog(null, "El número ingresado no es perfecto.");

        }
    }
}
