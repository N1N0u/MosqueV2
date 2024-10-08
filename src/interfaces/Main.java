package interfaces;

import java.awt.Color;
import java.awt.Component;
import java.sql.SQLException;

import com.raven.event.EventMenu;
import com.raven.swing.scrollbar.ScrollBarCustom;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        EventMenu eventMenu = new EventMenu() {
            @Override
            public void selected(int index) {
                if (index == 0) {
                    showForm(new Statistics());
                } else if (index == 1){
                    try {
						showForm(new IncomeGUI());
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
                else if (index == 2){
                    try {
						showForm(new OutGUI());
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
                else if (index == 3){
                    try {
						showForm(new EmployesGui());
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
                else if (index == 4){
                   System.exit(0);
                }
            }
        };

        menu.initWinButton(Main.this, panelBackground1);
        menu.initMenu(eventMenu);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        scroll.getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        showForm(new Statistics());
    }

    private void showForm(Component com) {
        body.removeAll();
        body.add(com);
        body.revalidate();
        body.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground1 = new com.raven.swing.PanelBackground();
        menu = new component.Menu();
        scroll = new javax.swing.JScrollPane();
        body = new javax.swing.JPanel();
      //  header = new com.raven.component.Header();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        body.setOpaque(false);
        body.setLayout(new java.awt.BorderLayout());
        scroll.setViewportView(body);

        javax.swing.GroupLayout panelBackground1Layout = new javax.swing.GroupLayout(panelBackground1);
        panelBackground1.setLayout(panelBackground1Layout);
        panelBackground1Layout.setHorizontalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 1158, Short.MAX_VALUE))
                    .addContainerGap())
            );

        panelBackground1Layout.setVerticalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scroll)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
                new Main().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
  //  private com.raven.component.Header header;
    private component.Menu menu;
    private com.raven.swing.PanelBackground panelBackground1;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
