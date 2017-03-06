
import javax.swing.JOptionPane;
/**
 *
 * Daniel Penasio dpenasio@gmail.com
 * RA: 266674
 */
public class Jogo extends javax.swing.JFrame {

    public boolean ehX = true;

    /**
     * Método que adiciona o valor X ou O no rótulo.
     *
     * @param label iremos escrever os texto X ou O.
     */
    public void adicionarOpcao(javax.swing.JLabel label) {
        /* Verifica se o texto do label está vazio, pois o mesmo só pode receber o texto uma vez. */
        if (label.getText().equals("")) {
            /* Se for a vez do jogador X, então irá escrever X no label. */
            if (ehX) {
                label.setText("X");
            } else {
                /* Senão é a vez do jogador O, então irá escrever O no label. */
                label.setText("O");
            }
            /* Depois de imprimir o texto no label troca a vez do jogador. */
            ehX = !ehX;
            
            verificaSeGanhouOuEmpatou();
            
        }
    }

    //médoto para verificar quem ganhou
    public void verificaSeGanhouOuEmpatou() {

        String vencedor = "";

        // verifica se a primeira linha está marcada com o mesmo texto
        if (!r11.getText().equals("") && r11.getText().equals(r12.getText()) 
                && r11.getText().equals(r13.getText())){
            vencedor = r11.getText();
        }else
        // verifica se a segunda linha está marcada com o mesmo texto    
            if (!r21.getText().equals("") && r21.getText().equals(r22.getText()) 
                && r21.getText().equals(r23.getText())){
            vencedor = r21.getText();
        }else
        // verifica se a terceira linha está marcada com o mesmo texto
            if (!r31.getText().equals("") && r31.getText().equals(r32.getText()) 
                && r31.getText().equals(r33.getText())){
            vencedor = r31.getText();   
        }else
        // verifica se a primeira coluna está marcada com o mesmo texto
            if (!r11.getText().equals("") && r11.getText().equals(r21.getText()) 
                && r11.getText().equals(r31.getText())){
            vencedor = r11.getText();
        }else
        // verifica se a segunda coluna está marcada com o mesmo texto
            if (!r12.getText().equals("") && r12.getText().equals(r22.getText()) 
                && r12.getText().equals(r32.getText())){
            vencedor = r12.getText();
        }else
        // verifica se a terceira coluna está marcada com o mesmo texto
            if (!r13.getText().equals("") && r13.getText().equals(r23.getText()) 
                && r13.getText().equals(r33.getText())){
            vencedor = r13.getText();
        }else
        // verifica se a diagonal esquerda para direita está marcada com o mesmo texto
            if (!r11.getText().equals("") && r11.getText().equals(r22.getText()) 
                && r11.getText().equals(r33.getText())){
            vencedor = r11.getText();
        }else
        // verifica se a diagonal direita para esquerda está marcada com o mesmo texto
            if (!r13.getText().equals("") && r13.getText().equals(r22.getText()) 
                && r13.getText().equals(r31.getText())){
            vencedor = r13.getText();
        }    
        
        //verifica se alguém venceu
        if(!vencedor.equals("")){
            //manda mensagem para tela
            JOptionPane.showMessageDialog(this, "O vencedor foi o: " + vencedor);
            LimparCampos();
        }else{
            /* Se ainda não tiver vencedor, verifica se deu empate. Para saber
            se deu empate verifica se todos os rótulos possuem texto. */
            if(!r11.getText().equals("") && !r12.getText().equals("") && 
                    !r13.getText().equals("") && !r21.getText().equals("") && 
                    !r22.getText().equals("") && !r23.getText().equals("") && 
                    !r31.getText().equals("") &&!r32.getText().equals("") && 
                    !r33.getText().equals("")) {
            /* Manda uma mensagem para a tela. */
            JOptionPane.showMessageDialog(this, "Empate");
            LimparCampos();
            }
        }
    }
    
    private void LimparCampos() {
        r11.setText("");
        r12.setText("");
        r13.setText("");
        r21.setText("");
        r22.setText("");
        r23.setText("");
        r31.setText("");
        r32.setText("");
        r33.setText("");
    }

    /**
     * Creates new form Jogo
     */
    public Jogo() {
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

        r11 = new javax.swing.JLabel();
        r12 = new javax.swing.JLabel();
        r13 = new javax.swing.JLabel();
        r21 = new javax.swing.JLabel();
        r22 = new javax.swing.JLabel();
        r23 = new javax.swing.JLabel();
        r31 = new javax.swing.JLabel();
        r32 = new javax.swing.JLabel();
        r33 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");
        setMinimumSize(new java.awt.Dimension(370, 443));
        setPreferredSize(new java.awt.Dimension(370, 443));
        setResizable(false);
        getContentPane().setLayout(null);

        r11.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        r11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        r11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r11MouseClicked(evt);
            }
        });
        getContentPane().add(r11);
        r11.setBounds(30, 80, 100, 90);

        r12.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        r12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        r12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r12MouseClicked(evt);
            }
        });
        getContentPane().add(r12);
        r12.setBounds(130, 80, 100, 90);

        r13.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        r13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        r13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r13MouseClicked(evt);
            }
        });
        getContentPane().add(r13);
        r13.setBounds(230, 80, 100, 90);

        r21.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        r21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        r21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r21MouseClicked(evt);
            }
        });
        getContentPane().add(r21);
        r21.setBounds(30, 170, 100, 90);

        r22.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        r22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        r22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r22MouseClicked(evt);
            }
        });
        getContentPane().add(r22);
        r22.setBounds(130, 170, 100, 90);

        r23.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        r23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        r23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r23MouseClicked(evt);
            }
        });
        getContentPane().add(r23);
        r23.setBounds(230, 170, 100, 90);

        r31.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        r31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        r31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r31MouseClicked(evt);
            }
        });
        getContentPane().add(r31);
        r31.setBounds(30, 260, 100, 90);

        r32.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        r32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        r32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r32MouseClicked(evt);
            }
        });
        getContentPane().add(r32);
        r32.setBounds(130, 260, 100, 90);

        r33.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        r33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        r33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r33MouseClicked(evt);
            }
        });
        getContentPane().add(r33);
        r33.setBounds(230, 260, 100, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fundo.png"))); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(370, 443));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 370, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r11MouseClicked
        adicionarOpcao(r11);
    }//GEN-LAST:event_r11MouseClicked

    private void r12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r12MouseClicked
        adicionarOpcao(r12);
    }//GEN-LAST:event_r12MouseClicked

    private void r13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r13MouseClicked
        adicionarOpcao(r13);
    }//GEN-LAST:event_r13MouseClicked

    private void r21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r21MouseClicked
        adicionarOpcao(r21);
    }//GEN-LAST:event_r21MouseClicked

    private void r22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r22MouseClicked
        adicionarOpcao(r22);
    }//GEN-LAST:event_r22MouseClicked

    private void r23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r23MouseClicked
        adicionarOpcao(r23);
    }//GEN-LAST:event_r23MouseClicked

    private void r31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r31MouseClicked
        adicionarOpcao(r31);
    }//GEN-LAST:event_r31MouseClicked

    private void r32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r32MouseClicked
        adicionarOpcao(r32);
    }//GEN-LAST:event_r32MouseClicked

    private void r33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r33MouseClicked
        adicionarOpcao(r33);
    }//GEN-LAST:event_r33MouseClicked

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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel r11;
    private javax.swing.JLabel r12;
    private javax.swing.JLabel r13;
    private javax.swing.JLabel r21;
    private javax.swing.JLabel r22;
    private javax.swing.JLabel r23;
    private javax.swing.JLabel r31;
    private javax.swing.JLabel r32;
    private javax.swing.JLabel r33;
    // End of variables declaration//GEN-END:variables

    
}
