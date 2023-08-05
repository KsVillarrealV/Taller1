import javax.swing.JOptionPane;
public class Punto22 {
    public static void main(String[] args) {
        String palabra = JOptionPane.showInputDialog("Escriba una palabra o frase:");
        JOptionPane.showMessageDialog(null, "la palabra " + palabra +" es polindroma? \n"+ esPolindromo(palabra));
    }

    public static boolean esPolindromo(String palabra) {
        palabra = palabra.toLowerCase();
        for (int i = 0, p = palabra.length() - 1; i <= p; i++, p--) {
            if (palabra.charAt(i) != palabra.charAt(p)) {
                return false;
            }
        }
        return true;
    }
}
