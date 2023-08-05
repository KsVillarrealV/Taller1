import javax.swing.JOptionPane;

public class Punto6 {
    public static void main(String[] args) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor: "));
        if (valor == 0) {
            JOptionPane.showMessageDialog(null, valor + " Es 0.");
        } else if (valor < 0) {
            JOptionPane.showMessageDialog(null, valor + " Es negativo. ");
        } else if (valor > 0) {
            JOptionPane.showMessageDialog(null, valor + " Es positivo. ");
        }
    }
}
