import javax.swing.JOptionPane;

public class Punto2 {
    public static void main(String[] args) {

        int num=Integer.parseInt(JOptionPane.showInputDialog("Digite un número:"));
        int r= num % 2;
        if(r == 0){
            JOptionPane.showMessageDialog(null, "El número "+ num + " es par.");
        }else{
            JOptionPane.showMessageDialog(null, "El número "+num+" es impar.");
        }
                
    }
}
