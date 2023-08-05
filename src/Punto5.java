import javax.swing.JOptionPane;

public class Punto5 {
    public static void main(String[] args) {
        int A = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor: "));
        int B = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo valor:"));
        if (A > B) {
            JOptionPane.showMessageDialog(null, A + " Es mayor que " + B);
        } else if (A == B || B == A) {
            JOptionPane.showMessageDialog(null, B + " Es igual a " + A);
        } else {
            JOptionPane.showMessageDialog(null, B + " Es mayor que " + A);
        }
    }
}
