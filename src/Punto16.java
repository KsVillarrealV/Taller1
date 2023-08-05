import javax.swing.JOptionPane;

public class Punto16 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rango que desea generar: "));
        int x = 0;
        int num1 = 1;
        int num2;

        for (int i = 1; i <= numero; i++) {
            num2 = x;
            x = num1 + x;
            num1 = num2;

            JOptionPane.showMessageDialog(null, num1);
        }
    }
}
