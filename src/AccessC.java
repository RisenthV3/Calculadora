/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LABMOVIL
 */
public class AccessC extends javax.swing.JFrame {
    
    public double numero1;
    public double numero2;
    
    public String operador;
       
    public boolean finish = false;
    
    /**
     * Creates new form AccessC
     */
    public AccessC() {
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

        jPanel1 = new javax.swing.JPanel();
        CalculatorField = new javax.swing.JTextField();
        CEButton = new javax.swing.JButton();
        SevenButton = new javax.swing.JButton();
        CButton = new javax.swing.JButton();
        EightButton = new javax.swing.JButton();
        FourButton = new javax.swing.JButton();
        OneButton = new javax.swing.JButton();
        ZeroButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        DivisionButton = new javax.swing.JButton();
        NineButton = new javax.swing.JButton();
        MultiplyButton = new javax.swing.JButton();
        FiveButton = new javax.swing.JButton();
        SixButton = new javax.swing.JButton();
        SubstractionButton = new javax.swing.JButton();
        TwoButton = new javax.swing.JButton();
        ThreeButton = new javax.swing.JButton();
        PlusButton = new javax.swing.JButton();
        TripleZeroButton = new javax.swing.JButton();
        DotButton = new javax.swing.JButton();
        EqualButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        CalculatorField.setEditable(false);
        CalculatorField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        CalculatorField.setText("0");

        CEButton.setText("CE");
        CEButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEButtonActionPerformed(evt);
            }
        });

        SevenButton.setText("7");
        SevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SevenButtonActionPerformed(evt);
            }
        });

        CButton.setText("C");
        CButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CButtonActionPerformed(evt);
            }
        });

        EightButton.setText("8");
        EightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EightButtonActionPerformed(evt);
            }
        });

        FourButton.setText("4");
        FourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourButtonActionPerformed(evt);
            }
        });

        OneButton.setText("1");
        OneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneButtonActionPerformed(evt);
            }
        });

        ZeroButton.setText("0");
        ZeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZeroButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        DivisionButton.setText("/");
        DivisionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisionButtonActionPerformed(evt);
            }
        });

        NineButton.setText("9");
        NineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NineButtonActionPerformed(evt);
            }
        });

        MultiplyButton.setText("*");
        MultiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplyButtonActionPerformed(evt);
            }
        });

        FiveButton.setText("5");
        FiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiveButtonActionPerformed(evt);
            }
        });

        SixButton.setText("6");
        SixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SixButtonActionPerformed(evt);
            }
        });

        SubstractionButton.setText("-");
        SubstractionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubstractionButtonActionPerformed(evt);
            }
        });

        TwoButton.setText("2");
        TwoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoButtonActionPerformed(evt);
            }
        });

        ThreeButton.setText("3");
        ThreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreeButtonActionPerformed(evt);
            }
        });

        PlusButton.setText("+");
        PlusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusButtonActionPerformed(evt);
            }
        });

        TripleZeroButton.setText("000");
        TripleZeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TripleZeroButtonActionPerformed(evt);
            }
        });

        DotButton.setText(".");
        DotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DotButtonActionPerformed(evt);
            }
        });

        EqualButton.setText("=");
        EqualButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CalculatorField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ZeroButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FourButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CEButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(SevenButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TripleZeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TwoButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FiveButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EightButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DotButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ThreeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SixButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(NineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DivisionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MultiplyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SubstractionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PlusButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(EqualButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CalculatorField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CEButton)
                    .addComponent(CButton)
                    .addComponent(DeleteButton)
                    .addComponent(DivisionButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SevenButton)
                    .addComponent(EightButton)
                    .addComponent(NineButton)
                    .addComponent(MultiplyButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FourButton)
                    .addComponent(FiveButton)
                    .addComponent(SixButton)
                    .addComponent(SubstractionButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OneButton)
                    .addComponent(TwoButton)
                    .addComponent(ThreeButton)
                    .addComponent(PlusButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ZeroButton)
                    .addComponent(TripleZeroButton)
                    .addComponent(DotButton)
                    .addComponent(EqualButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CEButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEButtonActionPerformed
        
        if(numero1 != 0){
            
            numero1 = 0;
            this.CalculatorField.setText("0");
            
        }
        else{
            
            this.CalculatorField.setText("0");
            
        }
        
    }//GEN-LAST:event_CEButtonActionPerformed

    private void DivisionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisionButtonActionPerformed
              
        this.numero1 = Double.parseDouble(this.CalculatorField.getText());

        this.operador = "/";

        this.CalculatorField.setText("0");
        
    }//GEN-LAST:event_DivisionButtonActionPerformed

    private void OneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneButtonActionPerformed
               
        String confir = CalculatorField.getText();

        if((confir.equals("0")) || finish){
            
            finish = false;

            this.CalculatorField.setText("1");

        }
        else{

            if(CalculatorField.getText().length() <= 7){

                this.CalculatorField.setText(this.CalculatorField.getText()+"1");

            }            

        }       
        
    }//GEN-LAST:event_OneButtonActionPerformed

    private void TwoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoButtonActionPerformed
        
        String confir = CalculatorField.getText();

        if((confir.equals("0")) || finish){
            
            finish = false;
            
            this.CalculatorField.setText("2");

        }
        else{

            if(CalculatorField.getText().length() <= 7){

                this.CalculatorField.setText(this.CalculatorField.getText()+"2");

            }

        }
        
    }//GEN-LAST:event_TwoButtonActionPerformed

    private void ThreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreeButtonActionPerformed
               
        String confir = CalculatorField.getText();

        if((confir.equals("0")) || finish){
            
            finish = false;

            this.CalculatorField.setText("3");

        }
        else{

            if(CalculatorField.getText().length() <= 7){

                this.CalculatorField.setText(this.CalculatorField.getText()+"3");

            }

        }
        
    }//GEN-LAST:event_ThreeButtonActionPerformed

    private void FourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourButtonActionPerformed
          
        String confir = CalculatorField.getText();

        if((confir.equals("0")) || finish){
            
            finish = false;

            this.CalculatorField.setText("4");

        }
        else{

            if(CalculatorField.getText().length() <= 7){

                this.CalculatorField.setText(this.CalculatorField.getText()+"4");

            }

        }
        
    }//GEN-LAST:event_FourButtonActionPerformed

    private void FiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiveButtonActionPerformed
                
        String confir = CalculatorField.getText();

        if((confir.equals("0")) || finish){
            
            finish = false;

            this.CalculatorField.setText("5");

        }
        else{

            if(CalculatorField.getText().length() <= 7){

                this.CalculatorField.setText(this.CalculatorField.getText()+"5");

            }

        }
        
    }//GEN-LAST:event_FiveButtonActionPerformed

    private void SixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SixButtonActionPerformed
                
        String confir = CalculatorField.getText();

        if((confir.equals("0")) || finish){
            
            finish = false;

            this.CalculatorField.setText("6");

        }
        else{

            if(CalculatorField.getText().length() <= 7){

                this.CalculatorField.setText(this.CalculatorField.getText()+"6");

            }

        }
        
    }//GEN-LAST:event_SixButtonActionPerformed

    private void SevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SevenButtonActionPerformed
                
        String confir = CalculatorField.getText();

        if((confir.equals("0")) || finish){
            
            finish = false;

            this.CalculatorField.setText("7");

        }
        else{

            if(CalculatorField.getText().length() <= 7){

                this.CalculatorField.setText(this.CalculatorField.getText()+"7");

            }

        }
        
    }//GEN-LAST:event_SevenButtonActionPerformed

    private void EightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EightButtonActionPerformed
                
        String confir = CalculatorField.getText();

        if((confir.equals("0")) || finish){
            
            finish = false;

            this.CalculatorField.setText("8");

        }
        else{

            if(CalculatorField.getText().length() <= 7){

                this.CalculatorField.setText(this.CalculatorField.getText()+"8");

            }

        }
        
    }//GEN-LAST:event_EightButtonActionPerformed

    private void NineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NineButtonActionPerformed
                
        String confir = CalculatorField.getText();

        if((confir.equals("0")) || finish){
            
            finish = false;

            this.CalculatorField.setText("9");

        }
        else{

            if(CalculatorField.getText().length() <= 7){

                this.CalculatorField.setText(this.CalculatorField.getText()+"9");

            }

        }
        
    }//GEN-LAST:event_NineButtonActionPerformed

    private void ZeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZeroButtonActionPerformed
        
        if(finish){
            
            finish = false;
            CalculatorField.setText("0");
            
        } 
        
        String confir = CalculatorField.getText();

        if(!confir.equals("0")){

            if(CalculatorField.getText().length() <= 7){

                this.CalculatorField.setText(this.CalculatorField.getText()+"0");

            }            

        }
        
    }//GEN-LAST:event_ZeroButtonActionPerformed

    private void TripleZeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TripleZeroButtonActionPerformed
        
        if(finish){
            
            finish = false;
            CalculatorField.setText("0");
            
        }
            
        String confir = CalculatorField.getText();

        if(!confir.equals("0")){

            if(CalculatorField.getText().length() <= 5){

                this.CalculatorField.setText(this.CalculatorField.getText()+"000");

            }

        }
        
    }//GEN-LAST:event_TripleZeroButtonActionPerformed

    private void DotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DotButtonActionPerformed
        
        if(finish){
            
            finish = false;
            
            CalculatorField.setText("0.0");
            
        }
        
        String confir = CalculatorField.getText();

        if(!confir.contains(".")){

            if(CalculatorField.getText().length() <= 6){

                this.CalculatorField.setText(this.CalculatorField.getText()+".");

            }

        }
        
    }//GEN-LAST:event_DotButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
               
        String confir = CalculatorField.getText();

        if(!confir.equals("0")){

            StringBuffer sb = new StringBuffer(confir);

            sb.deleteCharAt(sb.length()-1);

            confir = sb.toString();

            CalculatorField.setText(confir);

            if(CalculatorField.getText().equals("")){

                CalculatorField.setText("0");

            }
        }
        
        
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void PlusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusButtonActionPerformed
        
        this.numero1 = Double.parseDouble(this.CalculatorField.getText());

        this.operador = "+";

        this.CalculatorField.setText("0");
        
    }//GEN-LAST:event_PlusButtonActionPerformed

    private void EqualButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualButtonActionPerformed
        
        finish = true;
        
        this.numero2 = Double.parseDouble(this.CalculatorField.getText());

        if(this.operador != null){

            switch(this.operador){

                case("+"):

                    this.CalculatorField.setText(Double.toString(this.numero1+this.numero2));
                
                    if((CalculatorField.getText().length() > 8) && ((this.numero1/this.numero2) < 99999999) && ((this.numero1/this.numero2) > 0.000001)){

                        while(CalculatorField.getText().length() > 8){

                            String confir = CalculatorField.getText();

                            StringBuffer sb = new StringBuffer(confir);

                            sb.deleteCharAt(sb.length()-1);

                            confir = sb.toString();

                        CalculatorField.setText(confir);

                    }

                }
                
                break;               

                case("-"):

                    this.CalculatorField.setText(Double.toString(this.numero1-this.numero2));
                    
                    if((CalculatorField.getText().length() > 8) && ((this.numero1/this.numero2) < 99999999) && ((this.numero1/this.numero2) > 0.000001)){

                        while(CalculatorField.getText().length() > 8){

                            String confir = CalculatorField.getText();

                            StringBuffer sb = new StringBuffer(confir);

                            sb.deleteCharAt(sb.length()-1);

                            confir = sb.toString();

                            CalculatorField.setText(confir);

                        }

                    }
                    
                break;

                case("*"):

                    this.CalculatorField.setText(Double.toString(this.numero1*this.numero2));
                    
                    if((CalculatorField.getText().length() > 8) && ((this.numero1/this.numero2) < 99999999) && ((this.numero1/this.numero2) > 0.000001)){

                        while(CalculatorField.getText().length() > 8){

                            String confir = CalculatorField.getText();

                            StringBuffer sb = new StringBuffer(confir);

                            sb.deleteCharAt(sb.length()-1);

                            confir = sb.toString();

                            CalculatorField.setText(confir);

                        }

                    }
                    
                break;

                case("/"):

                    this.CalculatorField.setText(Double.toString(this.numero1/this.numero2));
                    
                    if((CalculatorField.getText().length() > 8) && ((this.numero1/this.numero2) < 99999999) && ((this.numero1/this.numero2) > 0.000001)){

                        while(CalculatorField.getText().length() > 8){

                            String confir = CalculatorField.getText();

                            StringBuffer sb = new StringBuffer(confir);

                            sb.deleteCharAt(sb.length()-1);

                            confir = sb.toString();

                            CalculatorField.setText(confir);

                        }

                    }

                break;

            }
        }        
                
    }//GEN-LAST:event_EqualButtonActionPerformed

    private void CButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CButtonActionPerformed
               
        this.CalculatorField.setText("0");
               
    }//GEN-LAST:event_CButtonActionPerformed

    private void SubstractionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubstractionButtonActionPerformed
           
        this.numero1 = Double.parseDouble(this.CalculatorField.getText());

        this.operador = "-";

        this.CalculatorField.setText("0");
        
    }//GEN-LAST:event_SubstractionButtonActionPerformed

    private void MultiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplyButtonActionPerformed
        
        this.numero1 = Double.parseDouble(this.CalculatorField.getText());

        this.operador = "*";

        this.CalculatorField.setText("0");
        
    }//GEN-LAST:event_MultiplyButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AccessC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccessC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccessC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccessC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccessC().setVisible(true);
            }
        });  
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CButton;
    private javax.swing.JButton CEButton;
    private javax.swing.JTextField CalculatorField;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton DivisionButton;
    private javax.swing.JButton DotButton;
    private javax.swing.JButton EightButton;
    private javax.swing.JButton EqualButton;
    private javax.swing.JButton FiveButton;
    private javax.swing.JButton FourButton;
    private javax.swing.JButton MultiplyButton;
    private javax.swing.JButton NineButton;
    private javax.swing.JButton OneButton;
    private javax.swing.JButton PlusButton;
    private javax.swing.JButton SevenButton;
    private javax.swing.JButton SixButton;
    private javax.swing.JButton SubstractionButton;
    private javax.swing.JButton ThreeButton;
    private javax.swing.JButton TripleZeroButton;
    private javax.swing.JButton TwoButton;
    private javax.swing.JButton ZeroButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
