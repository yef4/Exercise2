/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

/**
 *
 * @author s.lucas
 */
public class JFolhaDePagamento extends javax.swing.JFrame {

    /**
     * Creates new form JFolhaDePagamento
     */
    public JFolhaDePagamento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFuncionario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHoras = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtValorHora = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtQuantHExtras = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtQuantFilhos = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btGerar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbDescontoIR = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lbFuncionario = new javax.swing.JLabel();
        lbSalarioLiquido = new javax.swing.JLabel();
        lbSalarioBruto = new javax.swing.JLabel();
        lbDescontoINSS = new javax.swing.JLabel();
        lbHoras = new javax.swing.JLabel();
        lbQuantHorasExtras = new javax.swing.JLabel();
        lbValorHoraExtra = new javax.swing.JLabel();
        lbValorSalFamilia = new javax.swing.JLabel();

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setText("Folha de Pagamento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setText("Funcionário (Nome)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 190, 20));

        txtFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFuncionarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 760, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("Quant. horas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        jPanel1.add(txtHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 210, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("Valor hora");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));
        jPanel1.add(txtValorHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 360, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("Quant. horas extras");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        txtQuantHExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantHExtrasActionPerformed(evt);
            }
        });
        jPanel1.add(txtQuantHExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 360, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setText("Quant. Filhos");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        txtQuantFilhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantFilhosActionPerformed(evt);
            }
        });
        jPanel1.add(txtQuantFilhos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 210, -1));

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 100, -1));

        btGerar.setText("Gerar Folha");
        btGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerarActionPerformed(evt);
            }
        });
        jPanel1.add(btGerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 100, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbDescontoIR.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbDescontoIR.setText("?");
        jPanel2.add(lbDescontoIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel8.setText("Quantidade de horas extras:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setText("Funcionário:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel10.setText("Desconto IR: R$");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel12.setText("Quantidade de horas:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel13.setText("Salário liquido: R$");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel14.setText("Desconto INSS: R$");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel15.setText("Salário bruto: R$");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel16.setText("Valor horas extras: R$");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel17.setText("Valor salário família: R$");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel18.setText("Holerite - ");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel19.setText("Maio / 2023");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        lbFuncionario.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbFuncionario.setText("?");
        jPanel2.add(lbFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        lbSalarioLiquido.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbSalarioLiquido.setText("?");
        jPanel2.add(lbSalarioLiquido, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        lbSalarioBruto.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbSalarioBruto.setText("?");
        jPanel2.add(lbSalarioBruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        lbDescontoINSS.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbDescontoINSS.setText("?");
        jPanel2.add(lbDescontoINSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        lbHoras.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbHoras.setText("?");
        jPanel2.add(lbHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        lbQuantHorasExtras.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbQuantHorasExtras.setText("?");
        jPanel2.add(lbQuantHorasExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, -1, -1));

        lbValorHoraExtra.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbValorHoraExtra.setText("?");
        jPanel2.add(lbValorHoraExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, -1, -1));

        lbValorSalFamilia.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbValorSalFamilia.setText("?");
        jPanel2.add(lbValorSalFamilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 760, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFuncionarioActionPerformed

    private void txtQuantHExtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantHExtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantHExtrasActionPerformed

    private void txtQuantFilhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantFilhosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantFilhosActionPerformed

    private void btGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGerarActionPerformed
        double salBruto, salHorasExtras, salFam, horas, valorH, quantHE, descInss, descIR, salLiq;
        int filhos;
        lbFuncionario.setText(txtFuncionario.getText());
        lbHoras.setText(txtHoras.getText());
        lbQuantHorasExtras.setText(txtQuantHExtras.getText());
        horas = Double.parseDouble(txtHoras.getText());
        valorH = Double.parseDouble(txtQuantHExtras.getText());
        quantHE = Double.parseDouble(txtQuantHExtras.getText());
        salBruto = horas*valorH;
        salHorasExtras = quantHE*valorH*1.5;
        filhos = Integer.parseInt(txtQuantFilhos.getText());
        salFam = filhos*15;
        lbSalarioBruto.setText(String.valueOf(salBruto));
        lbValorHoraExtra.setText(String.valueOf(salHorasExtras));
        if (salBruto <= 1320.00){
            descInss = salBruto*0.075;
            lbDescontoINSS.setText(String.valueOf(descInss));
        }else if(salBruto >1320 && salBruto <= 2571.29){
            descInss = salBruto*0.09;
            lbDescontoINSS.setText(String.valueOf(descInss));
        }else if(salBruto > 2571.29 && salBruto < 3856.94){
            descInss = salBruto*0.12;
            lbDescontoINSS.setText(String.valueOf(descInss));
        }else{
            descInss = salBruto*0.14;
            lbDescontoINSS.setText(String.valueOf(descInss));
        }
        // Desconto IR
        if (salBruto < 1903.09){
            descIR = 0;
            lbDescontoIR.setText(String.valueOf(descIR));
        }else if(salBruto >= 1903.09 && salBruto <= 2826.65){
            descIR = salBruto*0.075;
            lbDescontoIR.setText(String.valueOf(descIR));
        }else if(salBruto > 2826.65 && salBruto <= 3751.05){
            descIR = salBruto*0.15;
            lbDescontoIR.setText(String.valueOf(descIR));
        }else if(salBruto > 3751.05 && salBruto <= 4664.68){
            descIR = salBruto*0.225;
            lbDescontoIR.setText(String.valueOf(descIR));
        }else{
            descIR = salBruto*0.275;
            lbDescontoIR.setText(String.valueOf(descIR));
        }
        salLiq = salBruto+salFam+salHorasExtras-descInss-descIR;
        lbSalarioLiquido.setText(String.valueOf(salLiq));
        lbValorSalFamilia.setText(String.valueOf(salFam));
    }//GEN-LAST:event_btGerarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        lbSalarioLiquido.setText("?");
        lbValorSalFamilia.setText("?");
        lbDescontoIR.setText("?");
        lbDescontoINSS.setText("?");
        lbValorHoraExtra.setText("?");
        lbSalarioBruto.setText("?");
        lbFuncionario.setText("?");
        lbHoras.setText("?");
        lbQuantHorasExtras.setText("?");
        txtFuncionario.setText(null);
        txtHoras.setText(null);
        txtQuantFilhos.setText(null);
        txtQuantHExtras.setText(null);
        txtValorHora.setText(null);
    }//GEN-LAST:event_btLimparActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFolhaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFolhaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFolhaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFolhaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFolhaDePagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGerar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbDescontoINSS;
    private javax.swing.JLabel lbDescontoIR;
    private javax.swing.JLabel lbFuncionario;
    private javax.swing.JLabel lbHoras;
    private javax.swing.JLabel lbQuantHorasExtras;
    private javax.swing.JLabel lbSalarioBruto;
    private javax.swing.JLabel lbSalarioLiquido;
    private javax.swing.JLabel lbValorHoraExtra;
    private javax.swing.JLabel lbValorSalFamilia;
    private javax.swing.JTextField txtFuncionario;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtQuantFilhos;
    private javax.swing.JTextField txtQuantHExtras;
    private javax.swing.JTextField txtValorHora;
    // End of variables declaration//GEN-END:variables
}
