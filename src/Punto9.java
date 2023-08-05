import javax.swing.JOptionPane;

public class Punto9 {
    public static void main(String[] args) {
        int numero = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Digite el valor del cual desea saber su factoeial: "));
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        JOptionPane.showMessageDialog(null, "El factorial de " + numero + "! es: " + factorial);
    }
}
