/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter;

import java.text.DecimalFormat;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Currency extends javax.swing.JFrame {

	JComboBox c1, c2;

	/**
	 * Creates new form Login
	 */
	public Currency() {
		initComponents();
		setLocationRelativeTo(this);
	}

	Currency(String name) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb_input = new javax.swing.JComboBox<>();
        tf_input = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cb_output = new javax.swing.JComboBox<>();
        btn_convert = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        label_result = new javax.swing.JLabel();
        btn_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Century", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ü-Money");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Select your Input Currency :");

        cb_input.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rupiah", "Euro", "Dollar", "Yen" }));

        tf_input.setText("0");
        tf_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_inputKeyPressed(evt);
            }
        });

        jLabel3.setText("Select your Output Currency :");

        cb_output.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rupiah", "Euro", "Dollar", "Yen" }));

        btn_convert.setText("Convert");
        btn_convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_convertActionPerformed(evt);
            }
        });

        jLabel4.setText("Converted Amount :");

        label_result.setText("-");

        btn_clear.setText("Clear");
        btn_clear.setMaximumSize(new java.awt.Dimension(74, 32));
        btn_clear.setMinimumSize(new java.awt.Dimension(74, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_result))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cb_input, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tf_input, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(cb_output, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(52, 52, 52))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(30, 30, 30))))))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_convert))
                .addGap(187, 187, 187))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_convert)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(label_result))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 122, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_convertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_convertActionPerformed
		// TODO add your handling code here:
		c1 = cb_input;
		c2 = cb_output;

		float a, b, c = 0;
		a = Float.valueOf(tf_input.getText());
		DecimalFormat angka = new DecimalFormat("###,###");
		try {
			if (c1.getSelectedIndex() == 0 & c2.getSelectedIndex() == 1) {
				c = (float) (a * 0.000056);
				tf_input.setText("IDR " + angka.format(a));
				label_result.setText("EUR " + angka.format(c));
			}
			if (c1.getSelectedIndex() == 0 & c2.getSelectedIndex() == 2) {
				c = (float) (a * 0.000061);
				tf_input.setText("IDR " + angka.format(a));
				label_result.setText("USD " + angka.format(c));
			}
			if (c1.getSelectedIndex() == 0 & c2.getSelectedIndex() == 3) {
				c = (float) (a * 0.0067);
				tf_input.setText("IDR " + angka.format(a));
				label_result.setText("JPY " + angka.format(c));
			}

			if (c1.getSelectedIndex() == 1 & c2.getSelectedIndex() == 0) {
				c = a * 17819;
				tf_input.setText("EUR " + angka.format(a));
				label_result.setText("IDR " + angka.format(c));
			}
			if (c1.getSelectedIndex() == 1 & c2.getSelectedIndex() == 2) {
				c = (float) (a * 1.08);
				tf_input.setText("EUR " + angka.format(a));
				label_result.setText("USD " + angka.format(c));
			}
			if (c1.getSelectedIndex() == 1 & c2.getSelectedIndex() == 3) {
				c = (float) (a * 119.39);
				tf_input.setText("EUR " + angka.format(a));
				label_result.setText("JPY " + angka.format(c));
			}

			if (c1.getSelectedIndex() == 2 & c2.getSelectedIndex() == 0) {
				c = a * 16474;
				tf_input.setText("USD " + angka.format(a));
				label_result.setText("IDR " + angka.format(c));
			}
			if (c1.getSelectedIndex() == 2 & c2.getSelectedIndex() == 1) {
				c = (float) (a * 0.92);
				tf_input.setText("USD " + angka.format(a));
				label_result.setText("EUR " + angka.format(c));
			}
			if (c1.getSelectedIndex() == 2 & c2.getSelectedIndex() == 3) {
				c = (float) (a * 110.36);
				tf_input.setText("USD " + angka.format(a));
				label_result.setText("JPY " + angka.format(c));
			}

			if (c1.getSelectedIndex() == 3 & c2.getSelectedIndex() == 0) {
				c = (float) (a * 149.28);
				tf_input.setText("JPY " + angka.format(a));
				label_result.setText("IDR " + angka.format(c));
			}
			if (c1.getSelectedIndex() == 3 & c2.getSelectedIndex() == 1) {
				c = (float) (a * 0.0084);
				tf_input.setText("JPY " + angka.format(a));
				label_result.setText("EUR " + angka.format(c));
			}
			if (c1.getSelectedIndex() == 3 & c2.getSelectedIndex() == 2) {
				c = (float) (a * 0.0091);
				tf_input.setText("JPY " + angka.format(a));
				label_result.setText("USD " + angka.format(c));
			}
		} catch (Exception error) {
			System.out.println("Error");
		}
    }//GEN-LAST:event_btn_convertActionPerformed

    private void tf_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_inputKeyPressed
        // TODO add your handling code here:
		
    }//GEN-LAST:event_tf_inputKeyPressed

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
			java.util.logging.Logger.getLogger(Currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Currency().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_convert;
    private javax.swing.JComboBox<String> cb_input;
    private javax.swing.JComboBox<String> cb_output;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_result;
    private javax.swing.JTextField tf_input;
    // End of variables declaration//GEN-END:variables
}
