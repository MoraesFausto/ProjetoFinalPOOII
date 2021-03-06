/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.fausto.pfboxe.view.swing;

import br.edu.utfpr.fausto.pfboxe.modelo.rn.CategoriaRN;
import br.edu.utfpr.fausto.pfboxe.modelo.rn.ClienteRN;
import br.edu.utfpr.fausto.pfboxe.modelo.rn.TreinadorRN;
import br.edu.utfpr.fausto.pfboxe.modelo.vo.Categoria;
import br.edu.utfpr.fausto.pfboxe.modelo.vo.Treinador;
import br.edu.utfpr.fausto.pfboxe.modelo.vo.tipoPeso;
import br.edu.utfpr.fausto.pfboxe.modelo.vo.tipoTreinador;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author f4ustx
 */
public final class CadastrarTreinador extends javax.swing.JInternalFrame {
    private Long idAlteracao = 0L;
    private CategoriaRN categoriaRN;
    private Categoria categoria;
    private List<Categoria> categorias;
    private tipoTreinador tipos;
    private Treinador treinador;
    private TreinadorRN treinadorRN;

    private tipoPeso tipopeso;

    /**
     * Creates new form CadastrarTreinador
     */
    public CadastrarTreinador() {
        this.categoriaRN = new CategoriaRN();
        this.categoria = new Categoria();
        this.treinador = new Treinador();
        this.treinadorRN = new TreinadorRN();
        initComponents();
        FillBox();
    }
    
    public CadastrarTreinador(Long idAlteracao){
        this.categoriaRN = new CategoriaRN();
        this.categoria = new Categoria();
        this.treinador = new Treinador();
        this.treinadorRN = new TreinadorRN();
        initComponents();
        FillBox();
        this.idAlteracao = idAlteracao;
        
        try{
            Treinador t = treinadorRN.listarUm(idAlteracao);
            bolsa1.setText( String.valueOf(t.getBolsa()));
            nome.setText(t.getNome());
            cpf.setText(t.getCpf());
            tel.setText(t.getTelefone());
            sex.setText(t.getSexo());
            age.setText(String.valueOf(t.getIdade()));
            licenca.setText(t.getLicenca());
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        
    }
    
    public void FillBox(){
        try{
            this.categorias  = categoriaRN.listaTodos();
            this.categorias.forEach((c) -> {
                ctg.addItem(c.getDescricao());
             });
            tipo.setModel(new DefaultComboBoxModel<>(tipoTreinador.values()));
            p1.setModel(new DefaultComboBoxModel<>(tipoPeso.values()));

        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        licenca = new javax.swing.JTextField();
        ctg = new javax.swing.JComboBox<>();
        tipo = new javax.swing.JComboBox<>();
        cadastrar = new javax.swing.JButton();
        tel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bolsa1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        p1 = new javax.swing.JComboBox<>();
        sex = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();

        jLabel1.setText("Licen??a:");

        jLabel2.setText("Categoria:");

        jLabel3.setText("Especialidade:");

        cadastrar.setText("Salvar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        tel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setText("Idade:");

        bolsa1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bolsa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolsa1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Sexo:");

        jLabel10.setText("Telefone:");

        jLabel11.setText("Bolsa:");

        jLabel12.setText("Peso:");

        sex.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        age.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nome.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel13.setText("Nome:");

        cpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel14.setText("CPF:");

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                .addComponent(age, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(sex))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bolsa1))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tipo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(licenca, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ctg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cancelar)
                            .addComponent(cadastrar))
                        .addGap(57, 57, 57))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cadastrar, cancelar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(licenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ctg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(cadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(bolsa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        // TODO add your handling code here:
        try{
                if(this.idAlteracao == 0){
                    categoria = categoriaRN.listarDesc(ctg.getSelectedItem().toString());
                    
                    treinador.setNome(nome.getText());
                    treinador.setCpf(cpf.getText());
                    treinador.setLicenca(licenca.getText());
                    treinador.setIdade(Integer.parseInt(age.getText()));
                    treinador.setSexo(sex.getText());
                    treinador.setBolsa(Float.parseFloat(bolsa1.getText()));
                    treinador.setTelefone(tel.getText());
                    treinador.setTipopeso(tipopeso.valueOf(p1.getSelectedItem().toString()));
                    treinador.setTipo(tipoTreinador.valueOf(tipo.getSelectedItem().toString()));
                    treinador.setCategoria(categoria);
                    

                    treinadorRN.salvar(treinador);
                    JOptionPane.showMessageDialog(this, "Treinador cadastrado!");
                }else{
                    categoria = categoriaRN.listarDesc(ctg.getSelectedItem().toString());
                    
                    Treinador t = treinadorRN.listarUm(idAlteracao);
                    
                    t.setNome(nome.getText());
                    t.setCpf(cpf.getText());
                    t.setLicenca(licenca.getText());
                    t.setIdade(Integer.parseInt(age.getText()));
                    t.setSexo(sex.getText());
                    t.setBolsa(Float.parseFloat(bolsa1.getText()));
                    t.setTelefone(tel.getText());
                    t.setTipopeso(tipopeso.valueOf(p1.getSelectedItem().toString()));
                    t.setTipo(tipoTreinador.valueOf(tipo.getSelectedItem().toString()));
                    t.setCategoria(categoria);
                    
                   treinadorRN.atualizar(t);
                   JOptionPane.showMessageDialog(this, "Treinador atualizado!");
                    
                }
            
        } catch(Exception err){
            JOptionPane.showMessageDialog(this, err);
        }
    }//GEN-LAST:event_cadastrarActionPerformed

    private void bolsa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolsa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bolsa1ActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JTextField bolsa1;
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cpf;
    private javax.swing.JComboBox<String> ctg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField licenca;
    private javax.swing.JTextField nome;
    private javax.swing.JComboBox<tipoPeso> p1;
    private javax.swing.JTextField sex;
    private javax.swing.JTextField tel;
    private javax.swing.JComboBox<tipoTreinador> tipo;
    // End of variables declaration//GEN-END:variables
}
