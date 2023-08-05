import java.util.Arrays;
import javax.swing.JOptionPane;

public class Punto27 {
    public static void main(String[] args) {
        String oracion = JOptionPane.showInputDialog("Escriba una frase: ");
        String [] arreglo= oracion.split(" ");
        Arrays.sort(arreglo);
        JOptionPane.showMessageDialog(null, arreglo); 
    }
}
