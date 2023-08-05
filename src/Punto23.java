import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Punto23 {
    public static void main(String[] args) {
        String palabra = JOptionPane.showInputDialog(null, "Escriba una frase: ");

        StringTokenizer st = new StringTokenizer(palabra);

        JOptionPane.showMessageDialog(null, st.countTokens());
    }
}
