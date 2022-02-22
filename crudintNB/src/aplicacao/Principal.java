/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import conexao.ConexaoMySQL;
import dao.ContatoDAO;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Contato;

/**
 *
 * @author fabiomacz
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                // TODO code application logic here
            new frmPrincipal().setVisible(true);
        //console();

    }
    
    
    public static void console() {
        String teclado;
        int opcao;

        loop:
        do {
            
            teclado = JOptionPane.showInputDialog("Informe a opção desejada para Contato:\n1- Inserir\n2- Atualizar"
                    + "\n3- Apagar\n4- Encontar\n5- Listar\n0- Sair");
            opcao = Integer.parseInt(teclado);
        
            switch (opcao) {
                case 0:
                    System.out.println("Encerrando o sistema.\nAté mais...");
                    break loop;
                case 1:
                    inserir();
                    break;
                case 2:
                    atualizar();
                    break;
                case 3:
                    apagar();
                    break;
                case 4:
                    encontrar();
                    break;
                case 5:
                    listar();
                    break;
                default:
                    System.out.println("Opção Inválida");
            }

        } while (true);
    }
	
    public static void inserir() {
        Contato c1 = new Contato();

        c1.setNome(JOptionPane.showInputDialog("Informe o nome: "));
        c1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: ")));
        c1.setDataCadastro(new Date());

        ContatoDAO contatoDAO = new ContatoDAO();
        int linha = contatoDAO.inserir(c1);
        if (linha > 0) {
            System.out.println("Contato inserido com sucesso!");
        } else {
            System.out.println("Contato Não inserido!");
        }
    }
	
    public static void atualizar() {
        Contato contato = encontrar();
        if (contato != null) {
            Contato c1 = new Contato();
            c1.setId(contato.getId());
            c1.setNome(JOptionPane.showInputDialog("Informe o novo nome: "));
            c1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a nova idade: ")));

            ContatoDAO contatoDAO = new ContatoDAO();
            int linha = contatoDAO.atualizar(c1);
            if (linha > 0) {
                System.out.println("Contato atualizado com sucesso!");
            } else {
                System.out.println("Contato Não atualizado!");
            }
        }
    }

    public static void apagar() {
        ContatoDAO contatoDAO = new ContatoDAO();
        int linha = contatoDAO.apagar(Integer.parseInt(JOptionPane.showInputDialog("Informe o id: ")));
        if (linha > 0) {
            System.out.println("Contato apagado com sucesso!");
        } else {
            System.out.println("Contato Não existe!");
        }

    }
	
    public static Contato encontrar() {
        ContatoDAO contatoDAO = new ContatoDAO();
        Contato contato =
                contatoDAO.encontrarContato(Integer.parseInt(JOptionPane.showInputDialog("Informe o id para pesquisar: ")));
        if (contato == null) {
            System.out.println("Contato Não existe!");
        } else {
            System.out.println("Contato Encontrado:\n" + contato);
        }
        return contato;
    }
	
    public static void listar() {
        ContatoDAO contatoDAO = new ContatoDAO();
        System.out.println("Listando os contatos:");
        for (Contato contato : contatoDAO.listarContatos()) {
            System.out.println(contato);
        }
        System.out.println("Fim da Listagem.");
    }

}
