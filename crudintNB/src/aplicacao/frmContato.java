/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import dao.ContatoDAO;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Contato;

/**
 *
 * @author fabiomacz
 */
public class frmContato extends javax.swing.JFrame {
    private Contato contato;

    /**
     * Creates new form frmContato
     */
    public frmContato(Contato contato) {
        initComponents();
        this.contato = contato;
        if (contato != null) {
            txtNome.setText(contato.getNome());
            txtIdade.setText(Integer.toString(contato.getIdade()));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNome.setText("Nome");

        lblIdade.setText("Idade");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(39, 39, 39)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(lblIdade)
                            .add(lblNome))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(txtIdade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txtNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .add(31, 31, 31)
                        .add(btnSalvar)
                        .add(43, 43, 43)
                        .add(btnSair)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(40, 40, 40)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblNome)
                    .add(txtNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(32, 32, 32)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblIdade)
                    .add(txtIdade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(38, 38, 38)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnSalvar)
                    .add(btnSair))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        cancelar();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (contato == null) {
            inserir();
        } else {
            editar(contato);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void inserir() {
        Contato contatoInserido = new Contato();
        contatoInserido.setNome(txtNome.getText());
        contatoInserido.setIdade(Integer.parseInt(txtIdade.getText()));
        contatoInserido.setDataCadastro(new Date());

        ContatoDAO contatoDAO = new ContatoDAO();
        int linha = contatoDAO.inserir(contatoInserido);
        if (linha > 0) {
            JOptionPane.showMessageDialog(this, "Contato inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao inserir Contato.");
        }
        this.dispose();
    }

    private void editar(Contato contato) {
        Contato contatoEditado = new Contato();
        contatoEditado.setId(contato.getId());
        contatoEditado.setNome(txtNome.getText());
        contatoEditado.setIdade(Integer.parseInt(txtIdade.getText()));
        contatoEditado.setDataCadastro(contato.getDataCadastro());

        ContatoDAO contatoDAO = new ContatoDAO();
        int linha = contatoDAO.atualizar(contatoEditado);
        if (linha > 0) {
            JOptionPane.showMessageDialog(this, "Contato editado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao editar Contato.");
        }
        this.dispose();
    }

    public void cancelar() {
        Object[] opcao = {"Não", "Sim"};
        int opcaoSelecionada = JOptionPane.showOptionDialog(this, "Deseja realmente sair?", "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcao, opcao[0]);
        if (opcaoSelecionada == 1) {
            this.dispose();
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
