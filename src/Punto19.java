import javax.swing.JOptionPane;

public class Punto19 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        JOptionPane.showMessageDialog(null,nombre.toLowerCase()+"\n"+nombre.toUpperCase());
    }
}
