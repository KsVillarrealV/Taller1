import javax.swing.JOptionPane;

public class Punto4 {
    public static void main(String[] args) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad: "));
        if (edad >=18){
            JOptionPane.showMessageDialog(null, "Usted es mayor de edad.");
        }else{
            JOptionPane.showMessageDialog(null, "Usted es menor de edad");
        }
    }
}
