import javax.swing.JOptionPane;

public class Punto1 {
    public static void main(String[] args) throws Exception {
        
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor:"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo valor:"));
        JOptionPane.showMessageDialog(null, "Suma: "+(num1+num2)
        +"\n"+ "Resta: "+(num1-num2)
        +"\n"+ "Multiplicación: "+(num1*num2)
        +"\n"+ "Division: "+(num1/num2));
    }
}
