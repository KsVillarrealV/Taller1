import javax.swing.JOptionPane;

public class Punto7 {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un valor positivo: "));
        String resultado = "";
        if (x < 0) {
            JOptionPane.showMessageDialog(null, "Valor no valido, debe ser un número positivo.");
        } else {
            for (int i = 0; i <= 10; i++) {
                resultado += x + " x " + i + " = " + (x * i) + "\n";

            };
            JOptionPane.showMessageDialog(null, "La tabla de multiplicación de" + x + " es: \n" + resultado);
        }
    }
}
