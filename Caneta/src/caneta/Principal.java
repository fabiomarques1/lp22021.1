
package caneta;

import caneta.Caneta;
import javax.swing.JOptionPane;

public class Principal {


    public static void main(String[] args) {
       int opcao;
       
       Caneta caneta1 = new Caneta();
       
       caneta1.setModelo(JOptionPane.showInputDialog("Informe o modelo:"));
       
        try {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Informe a cor: 1-Azul, 2-Vermelha, 3-Verde, 4-Preta"));
            caneta1.setCor(opcao);
        } catch (Exception e) {
            caneta1.setCor(0);
        }
      
       caneta1.setPonta(Double.parseDouble(JOptionPane.showInputDialog("Informe a ponta:")));
       caneta1.setCarga(Integer.parseInt(JOptionPane.showInputDialog("Informe a carga:")));
       caneta1.setTampada(true);
       
       System.out.println(caneta1);
       
       System.out.println(caneta1.tampar());
       
       System.out.println(caneta1.destampar());
       
       System.out.println(caneta1.escrever());
       
    }
}
