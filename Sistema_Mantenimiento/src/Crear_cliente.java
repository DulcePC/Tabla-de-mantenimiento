import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Crear_cliente extends javax.swing.JFrame {
    DefaultTableModel model= new DefaultTableModel();
    public Crear_cliente() {
        initComponents();
   
        this.setTitle("Registros");
      
       model.addColumn("Nombre");
       model.addColumn("Apellido");
       model.addColumn("Codigo");
       model.addColumn("tipo de cliente");
       this.tabladatos.setModel(model);
       
        
        
        
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        txt_codigo = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmb_tipo_cliente = new javax.swing.JComboBox<>();
        Guardar = new javax.swing.JButton();
        txt_nuevo = new javax.swing.JButton();
        txtsalir = new javax.swing.JButton();
        txt_busca = new javax.swing.JTextField();
        mostrar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_title.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        txt_title.setForeground(new java.awt.Color(0, 255, 0));
        txt_title.setText("Crear:");
        getContentPane().add(txt_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 90, 20));

        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabladatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 600, 200));

        txt_codigo.setBackground(new java.awt.Color(204, 204, 255));
        txt_codigo.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txt_codigo.setForeground(new java.awt.Color(51, 255, 0));
        txt_codigo.setText("Codigo");
        getContentPane().add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 60, 30));

        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoKeyTyped(evt);
            }
        });
        getContentPane().add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 90, -1));

        jLabel1.setBackground(new java.awt.Color(51, 255, 51));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 90, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 0));
        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });
        txt_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 90, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("Tipo de cliente:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 20));

        cmb_tipo_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General ", "Premium" }));
        cmb_tipo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_tipo_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_tipo_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        txt_nuevo.setText("Nuevo");
        txt_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nuevoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 90, -1));

        txtsalir.setText("Salir");
        txtsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsalirActionPerformed(evt);
            }
        });
        getContentPane().add(txtsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        txt_busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_busca, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 110, -1));

        mostrar.setText("mostrar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 60, 90, -1));

        buscar.setText("Buscar:");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        jButton1.setText("Principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 90, -1));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/practica.jpg"))); // NOI18N
        lbl_fondo.setText("jLabel2");
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 600, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
       
    }//GEN-LAST:event_codigoActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
      
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void cmb_tipo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_tipo_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_tipo_clienteActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        String nomb,ape,cod,comb;
        String sql="";
        nomb = txt_nombre.getText();
        ape = txt_apellido.getText();
        cod = codigo.getText();
        comb = cmb_tipo_cliente.getSelectedItem().toString();
        sql="INSERT INTO conexion (nom_cli,ape_cli,cod_cli,comb_cli) VALUES (?,?,?,?)";
        try {
            PreparedStatement psd = cn.prepareStatement(sql);
            psd.setString(1,nomb);
            psd.setString(2,ape);
            psd.setString(3,cod);
            psd.setString(4,comb);
            int n=psd.executeUpdate();
            if(n>0){
            JOptionPane.showMessageDialog(null, "guardado");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Crear_cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
     //String  cadena2,cadena3,cadena4,cadena5,cadena6,cadena7;
     
     //cadena2= txt_nombre.getText();
     //cadena3= codigo.getText();
     //cadena4= txt_apellido.getText();
     //cadena5=cmb_tipo_cliente.getSelectedItem().toString();
        
        
      String []Guardar=new String[4];
      Guardar[0]=txt_nombre.getText();
      Guardar[1]=txt_apellido.getText();
      Guardar[2]=codigo.getText();
      Guardar[3]=cmb_tipo_cliente.getSelectedItem().toString();
      model.addRow(Guardar);
        
    }//GEN-LAST:event_GuardarActionPerformed

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        //Esto es para que acepte solo caracteres, una condicion
        char letras = evt.getKeyChar();
        if((letras<'a' || letras>'z')  && (letras<'A' || letras>'Z' )) evt.consume();
        
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyTyped
            // //Esto es para que acepte solo numeros, una condicion
            char numb = evt.getKeyChar();
            if((numb<'0' || numb>'9')) evt.consume();
            
    }//GEN-LAST:event_codigoKeyTyped

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
       
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void txt_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoKeyTyped
        char letras = evt.getKeyChar();
        if((letras<'a' || letras>'z')  && (letras<'A' || letras>'Z' )) evt.consume();  
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoKeyTyped

    private void txt_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nuevoActionPerformed
        txt_nombre.setText("");
        codigo.setText("");
        txt_apellido.setText("");  
        
    }//GEN-LAST:event_txt_nuevoActionPerformed

    private void txtsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_txtsalirActionPerformed

    private void txt_buscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscaActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        usuarios principal = new usuarios();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Crear_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox<String> cmb_tipo_cliente;
    private javax.swing.JTextField codigo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JButton mostrar;
    private javax.swing.JTable tabladatos;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_busca;
    private javax.swing.JLabel txt_codigo;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JButton txt_nuevo;
    private javax.swing.JLabel txt_title;
    private javax.swing.JButton txtsalir;
    // End of variables declaration//GEN-END:variables

}
