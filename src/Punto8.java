import javax.swing.JOptionPane;

public class Punto8 {
    public static void main(String[] args) {
        int intento = 0;
        int valorDado = (int) (Math.random() * 100 + 1);
        do {
            int aleatorio = Integer.parseInt(JOptionPane.showInputDialog("Digite un número de 1 a 100"));
            if (aleatorio == valorDado) {
                JOptionPane.showMessageDialog(null, "Felicdades el número aleatorio es: " + valorDado);
            } else if (aleatorio < valorDado) {
                JOptionPane.showMessageDialog(null,
                        "Lo sentimos \n" + "El valor ingresado es menor al número a adivinar.");
            } else if (aleatorio > valorDado) {
                JOptionPane.showMessageDialog(null,
                        "Lo sentimos \n" + "El valor ingresado es mayor al número a adividar.");
            }
            intento++;
        } while (intento <= 10);
        JOptionPane.showMessageDialog(null, "Los intentos se agotaron.");
    }
}
