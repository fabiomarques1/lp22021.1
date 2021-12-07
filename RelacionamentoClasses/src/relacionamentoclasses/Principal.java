package relacionamentoclasses;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        
        long cpf; 
        String nome;
        String teclado;
        char opcao;
        
        cpf = Long.parseLong(JOptionPane.showInputDialog("Informe o CPF: "));
        nome = JOptionPane.showInputDialog("Informe o nome: ");
        
        Pessoa pessoa = new Pessoa(cpf, nome);
        
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
            
            end = new Endereco(rua, numero, complemento, cep, cidade, estado);
        }
        
        pessoa.setEndereco(end);
        
        System.out.println(pessoa);
        
    }
}
