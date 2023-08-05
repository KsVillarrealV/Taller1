import javax.swing.JOptionPane;

public class Punto20 {
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Escriba una palabra: ");
        String invertido = "";

        for (int indice = cadena.length() - 1; indice >= 0 ; indice--) {
            invertido += cadena.charAt(indice);
        }
        JOptionPane.showMessageDialog(null, "La frase es: "+cadena+"\n"+"La frase invertida es: "+invertido);		
    }
}
