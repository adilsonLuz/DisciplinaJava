/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adilson
 */
public class FrameCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form FrameCalculadora
     */
    public FrameCalculadora() {
        initComponents();
        tfResultado.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEntrada = new javax.swing.JPanel();
        lbnum2 = new javax.swing.JLabel();
        tfNum1 = new javax.swing.JTextField();
        tfNum2 = new javax.swing.JTextField();
        lbResultado = new javax.swing.JLabel();
        tfResultado = new javax.swing.JTextField();
        lbNum1 = new javax.swing.JLabel();
        panelBotões = new javax.swing.JPanel();
        btSomar = new javax.swing.JButton();
        btOff = new javax.swing.JButton();
        btSubtrair = new javax.swing.JButton();
        btMultiplicar = new javax.swing.JButton();
        btDividir = new javax.swing.JButton();
        btCE = new javax.swing.JButton();
        btIgual = new javax.swing.JButton();
        btSete = new javax.swing.JButton();
        btOito = new javax.swing.JButton();
        btNove = new javax.swing.JButton();
        btQuatro = new javax.swing.JButton();
        btCinco = new javax.swing.JButton();
        btSeis = new javax.swing.JButton();
        btUm = new javax.swing.JButton();
        btDois = new javax.swing.JButton();
        btTrês = new javax.swing.JButton();
        btZero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Básica");
        setFocusable(false);

        panelEntrada.setBackground(new java.awt.Color(244, 244, 244));
        panelEntrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbnum2.setText("2º Número");

        tfNum1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNum1ActionPerformed(evt);
            }
        });

        tfNum2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNum2ActionPerformed(evt);
            }
        });

        lbResultado.setText("Resultado");

        tfResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfResultadoActionPerformed(evt);
            }
        });

        lbNum1.setText("1º Número");

        javax.swing.GroupLayout panelEntradaLayout = new javax.swing.GroupLayout(panelEntrada);
        panelEntrada.setLayout(panelEntradaLayout);
        panelEntradaLayout.setHorizontalGroup(
            panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNum1)
                    .addComponent(lbnum2)
                    .addComponent(lbResultado))
                .addGap(18, 18, 18)
                .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEntradaLayout.setVerticalGroup(
            panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNum1)
                    .addComponent(tfNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnum2)
                    .addComponent(tfNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbResultado)
                    .addComponent(tfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        panelBotões.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btSomar.setBackground(new java.awt.Color(0, 0, 0));
        btSomar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSomar.setForeground(new java.awt.Color(255, 255, 255));
        btSomar.setText("+");
        btSomar.setToolTipText("Clique para somar");
        btSomar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btSomar.setMaximumSize(new java.awt.Dimension(23, 23));
        btSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSomarActionPerformed(evt);
            }
        });

        btOff.setBackground(new java.awt.Color(240, 64, 64));
        btOff.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btOff.setText("Off");
        btOff.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOffActionPerformed(evt);
            }
        });

        btSubtrair.setBackground(new java.awt.Color(0, 0, 0));
        btSubtrair.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btSubtrair.setForeground(new java.awt.Color(255, 255, 255));
        btSubtrair.setText("-");
        btSubtrair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubtrairActionPerformed(evt);
            }
        });

        btMultiplicar.setBackground(new java.awt.Color(0, 0, 0));
        btMultiplicar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btMultiplicar.setForeground(new java.awt.Color(255, 255, 255));
        btMultiplicar.setText("X");
        btMultiplicar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMultiplicarActionPerformed(evt);
            }
        });

        btDividir.setBackground(new java.awt.Color(0, 0, 0));
        btDividir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btDividir.setForeground(new java.awt.Color(255, 255, 255));
        btDividir.setText(":");
        btDividir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDividirActionPerformed(evt);
            }
        });

        btCE.setBackground(new java.awt.Color(0, 0, 0));
        btCE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCE.setForeground(new java.awt.Color(255, 255, 255));
        btCE.setText("CE");
        btCE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCEActionPerformed(evt);
            }
        });

        btIgual.setBackground(new java.awt.Color(254, 64, 64));
        btIgual.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btIgual.setForeground(new java.awt.Color(255, 255, 255));
        btIgual.setText("=");
        btIgual.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btSete.setBackground(new java.awt.Color(0, 0, 0));
        btSete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSete.setForeground(new java.awt.Color(255, 255, 255));
        btSete.setText("7");
        btSete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btOito.setBackground(new java.awt.Color(0, 0, 0));
        btOito.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btOito.setForeground(new java.awt.Color(255, 255, 255));
        btOito.setText("8");
        btOito.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btNove.setBackground(new java.awt.Color(0, 0, 0));
        btNove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btNove.setForeground(new java.awt.Color(255, 255, 255));
        btNove.setText("9");
        btNove.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btQuatro.setBackground(new java.awt.Color(0, 0, 0));
        btQuatro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btQuatro.setForeground(new java.awt.Color(255, 255, 255));
        btQuatro.setText("4");
        btQuatro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btCinco.setBackground(new java.awt.Color(0, 0, 0));
        btCinco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btCinco.setForeground(new java.awt.Color(255, 255, 255));
        btCinco.setText("5");
        btCinco.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btSeis.setBackground(new java.awt.Color(0, 0, 0));
        btSeis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSeis.setForeground(new java.awt.Color(255, 255, 255));
        btSeis.setText("6");
        btSeis.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btUm.setBackground(new java.awt.Color(0, 0, 0));
        btUm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btUm.setForeground(new java.awt.Color(255, 255, 255));
        btUm.setText("1");
        btUm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btDois.setBackground(new java.awt.Color(0, 0, 0));
        btDois.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btDois.setForeground(new java.awt.Color(255, 255, 255));
        btDois.setText("2");
        btDois.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btTrês.setBackground(new java.awt.Color(0, 0, 0));
        btTrês.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTrês.setForeground(new java.awt.Color(255, 255, 255));
        btTrês.setText("3");
        btTrês.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btZero.setBackground(new java.awt.Color(0, 0, 0));
        btZero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btZero.setForeground(new java.awt.Color(255, 255, 255));
        btZero.setText("0");
        btZero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panelBotõesLayout = new javax.swing.GroupLayout(panelBotões);
        panelBotões.setLayout(panelBotõesLayout);
        panelBotõesLayout.setHorizontalGroup(
            panelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotõesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBotõesLayout.createSequentialGroup()
                        .addGroup(panelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btUm, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBotõesLayout.createSequentialGroup()
                                .addComponent(btCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBotõesLayout.createSequentialGroup()
                                .addComponent(btDois, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btTrês, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btZero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBotõesLayout.createSequentialGroup()
                                .addComponent(btOito, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btNove, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btCE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btOff, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBotõesLayout.setVerticalGroup(
            panelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotõesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBotõesLayout.createSequentialGroup()
                        .addGroup(panelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btOff, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(btDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(panelBotõesLayout.createSequentialGroup()
                        .addGroup(panelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btOito, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNove, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(panelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(panelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBotõesLayout.createSequentialGroup()
                        .addComponent(btSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBotõesLayout.createSequentialGroup()
                        .addGroup(panelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btUm, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btDois, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btTrês, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btZero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBotões, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotões, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNum2ActionPerformed

    private void tfNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNum1ActionPerformed
        //O codigo a seguir fechar o frame
    private void btOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOffActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btOffActionPerformed

    private void btSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSomarActionPerformed
        int num1, num2, result;
        tfResultado.setEnabled(false);
        num1 = Integer.parseInt(tfNum1.getText());
        num2 = Integer.parseInt(tfNum2.getText());
        result = num1 + num2;
        tfResultado.setText(Integer.toString(result));
        
        
    }//GEN-LAST:event_btSomarActionPerformed

    private void tfResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfResultadoActionPerformed

    private void btSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubtrairActionPerformed
        int num1, num2, result;
        tfResultado.setEnabled(false);
        num1 = Integer.parseInt(tfNum1.getText());
        num2 = Integer.parseInt(tfNum2.getText());
        result = num1 - num2;
        tfResultado.setText(Integer.toString(result));
    }//GEN-LAST:event_btSubtrairActionPerformed
    //O Código abaixo efetua a multiplicação e retorna o resultado
    private void btMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMultiplicarActionPerformed
        int num1, num2, result;
        tfResultado.setEnabled(false);
        num1 = Integer.parseInt(tfNum1.getText());
        num2 = Integer.parseInt(tfNum2.getText());
        result = num1 * num2;
        tfResultado.setText(Integer.toString(result));
    }//GEN-LAST:event_btMultiplicarActionPerformed

    private void btDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDividirActionPerformed
        int num1, num2;
        float div;
        tfResultado.setEnabled(false);
        num1 = Integer.parseInt(tfNum1.getText());
        num2 = Integer.parseInt(tfNum2.getText());
        div = (float) num1 / num2;
        tfResultado.setText(Float.toString(div));
    }//GEN-LAST:event_btDividirActionPerformed

    private void btCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCEActionPerformed
        tfNum1.setText("");
        tfNum2.setText("");
        tfResultado.setText("");
    }//GEN-LAST:event_btCEActionPerformed

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
            java.util.logging.Logger.getLogger(FrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCE;
    private javax.swing.JButton btCinco;
    private javax.swing.JButton btDividir;
    private javax.swing.JButton btDois;
    private javax.swing.JButton btIgual;
    private javax.swing.JButton btMultiplicar;
    private javax.swing.JButton btNove;
    private javax.swing.JButton btOff;
    private javax.swing.JButton btOito;
    private javax.swing.JButton btQuatro;
    private javax.swing.JButton btSeis;
    private javax.swing.JButton btSete;
    private javax.swing.JButton btSomar;
    private javax.swing.JButton btSubtrair;
    private javax.swing.JButton btTrês;
    private javax.swing.JButton btUm;
    private javax.swing.JButton btZero;
    private javax.swing.JLabel lbNum1;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JLabel lbnum2;
    private javax.swing.JPanel panelBotões;
    private javax.swing.JPanel panelEntrada;
    private javax.swing.JTextField tfNum1;
    private javax.swing.JTextField tfNum2;
    private javax.swing.JTextField tfResultado;
    // End of variables declaration//GEN-END:variables
}
