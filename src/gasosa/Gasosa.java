package gasosa;

import javax.swing.JOptionPane;

public class Gasosa {
    public static void main(String[] args) {
        double precolitro, valorpagamento, litrostanque;
        
        precolitro = Double.parseDouble(JOptionPane.showInputDialog("Informar valor do litro:"));
        valorpagamento = Double.parseDouble(JOptionPane.showInputDialog("Informar valor do pagamento"));
        
        litrostanque = precolitro * valorpagamento;
        
        JOptionPane.showMessageDialog(null,"O motorista colocou "+litrostanque+" litros.");
    }
    
}
