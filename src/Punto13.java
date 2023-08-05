import javax.swing.JOptionPane;

public class Punto13 {
    public static void main(String[] args) {
            
            double decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un digito decimal: "));
            
            double roundOff = Math.round(decimal * 1000.0) / 1000.0;
            JOptionPane.showMessageDialog(null,"Decimal aproximado: "+roundOff);
    }
}
