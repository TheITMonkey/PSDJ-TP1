package UniversalCalculatorView;

import UniversalCalculatorModel.Contacto;
import java.io.FileNotFoundException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gcama
 */
public class ContactosView {

    // Variables declaration - do not modify                     
    private javax.swing.JButton apagarContactoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton novoContactoButton;
    private javax.swing.JButton regressarButton;
    private javax.swing.JButton reunioesButton;
    JFrame myFrame;
    private View view;
    // End of variables declaration  
    /**
     * Creates new form ContactosFrame
     * @throws java.io.FileNotFoundException
     */
    public ContactosView() throws FileNotFoundException{
        this.myFrame = new JFrame("ContactosView");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        reunioesButton = new javax.swing.JButton();
        novoContactoButton = new javax.swing.JButton();
        apagarContactoButton = new javax.swing.JButton();
        regressarButton = new javax.swing.JButton();

        this.myFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel1.setText("Universal Calculator");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        jLabel2.setText("Agenda");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Email"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        reunioesButton.setText("Reuniões");
        reunioesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reunioesButtonActionPerformed(evt);
            }
        });

        novoContactoButton.setText("Novo Contacto");
        novoContactoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoContactoButtonActionPerformed(evt);
            }
        });

        apagarContactoButton.setText("Apagar Contacto");
        apagarContactoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarContactoButtonActionPerformed(evt);
            }
        });

        regressarButton.setText("Regressar");
        regressarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regressarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.myFrame.getContentPane());
        this.myFrame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(reunioesButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(regressarButton))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(apagarContactoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(novoContactoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(novoContactoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apagarContactoButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reunioesButton)
                    .addComponent(regressarButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        this.myFrame.pack();
        this.myFrame.setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void reunioesButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        view.openAgendaViewPage();
        this.myFrame.setVisible(false);
    }                                              

    private void regressarButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        this.myFrame.setVisible(false);
    }                                               

    private void novoContactoButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
        view.openContactEdit();
    }                                                  

    private void apagarContactoButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {
        String nome = (String) this.jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0);
        String telf = (String) this.jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1);
        String email = (String) this.jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2);
        this.view.deleteContactToController(nome, telf, email);
        this.reloadTable();
    }
    
    public void addContact(String nome,String telf,String email)
    {
        view.addContactToController(nome, telf, email);
    }

    void setView(View view) {
        this.view = view;
    }

    void preencheTabela(List<Contacto> lista) 
    {
        DefaultTableModel mod = (DefaultTableModel) this.jTable1.getModel();
        mod.setRowCount(0);

        for(Contacto c : lista)
        {
            System.out.println(c.getNome());
            mod.addRow(new Object[]{c.getNome(), c.getNumTelm(), c.getEmail()});
        }
    }
    
    public void reloadTable()
    {
        view.reloadTableContacts();
    }
}
