import javax.swing.JOptionPane;

public class Punto25 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Digite una frase: ");
        String [] separar = frase.split(" ");

        for (int i = 0; i == 0 || i < separar.length;) {
            JOptionPane.showMessageDialog(null, separar);
            break;                  
        }
    }
}
