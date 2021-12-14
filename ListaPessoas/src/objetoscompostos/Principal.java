package objetoscompostos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        
        ArrayList<Pessoa> pessoas = new ArrayList<>(); // Lista pessoas
        
        char opcao;
        do {
            long cpf;
            String nome;
            String teclado;


            cpf = Long.parseLong(JOptionPane.showInputDialog("Informe o CPF: "));
            nome = JOptionPane.showInputDialog("Informe o nome: ");

            Pessoa pessoa = new Pessoa(cpf, nome); // Instancia pessoa

            teclado = JOptionPane.showInputDialog("Deseja cadastrar o endereço? (S) - SIM (N) - NÃO:");
            opcao = teclado.toUpperCase().charAt(0);

            Endereco end = null;

            if (opcao == 'S') {

                String rua, complemento, cidade, estado;
                short numero;
                int cep;

                rua = JOptionPane.showInputDialog("Informe a rua: ");
                numero = Short.parseShort(JOptionPane.showInputDialog("Informe o número: "));
                complemento = JOptionPane.showInputDialog("Informe o complemento: ");
                cep = Integer.parseInt(JOptionPane.showInputDialog("Informe o CEP: "));
                cidade = JOptionPane.showInputDialog("Informe a cidade: ");
                estado = JOptionPane.showInputDialog("Informe o estado: ");

                end = new Endereco(rua, numero, complemento, cep, cidade, estado); //Instacia end
            }

            pessoa.setEndereco(end); // Set Atributo endereco de pessoa

            System.out.println(pessoa); //Imprime pessoa

            pessoas.add(pessoa); // Adiciona pessoa na lista pessoas
            
            teclado = JOptionPane.showInputDialog("Deseja cadastrar outra pessoa? (S) - SIM (N) - NÃO:");
            opcao = teclado.toUpperCase().charAt(0);
            
        } while (opcao == 'S');
        

        System.out.println("\n\nImprimindo a lista com " + pessoas.size() + " pessoas.");
        for(Pessoa p : pessoas) { // Para cada objeto p da classe Pessoa dentro da lista pessoas faça
            System.out.println(p); // Imprima o elemento p
        }
        
        
    }
}
