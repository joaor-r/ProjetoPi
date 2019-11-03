/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoPI.view;



import projetoPI.controller.ProdutoController;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import projetoPI.view.ListaProdutoView;


public final class CadastroProdutoView extends javax.swing.JFrame {
    ListaProdutoView produto = new ListaProdutoView ();
   // ListaProdutoView tblProduto = new ListaProdutoView();
    private String modoTela;
    
   ;
    
    public CadastroProdutoView() {
        initComponents();
       // tblProduto.setVisible(false);
        LoadTable();
        this.setLocationRelativeTo(null);
        DesabilitarFormulario();
        
        
        //Oculto O ID
     //  lblIDProduto.setVisible(false);
    }
    
   public void LoadTable(){
    ArrayList<String[]> listaProdutos = ProdutoController.getProdutos();
    
    DefaultTableModel tmProduto = new DefaultTableModel();
    
          tmProduto.addColumn("SEQ");
          tmProduto.addColumn("PRODUTO");
          tmProduto.addColumn("DESCRICAO");
          tmProduto.addColumn("CATEGORIA");
          tmProduto.addColumn("SUBCATEGORIA");
          tmProduto.addColumn("VALOR");
          tmProduto.addColumn("IMPOSTO");
          tmProduto.addColumn("COMISSAO");
          tmProduto.addColumn("DIMENSAO");
          tmProduto.addColumn("COR");
          tmProduto.addColumn("PESO");
          tmProduto.addColumn("GARANTIA");
          tmProduto.addColumn("MARCA");
          tmProduto.addColumn("LINHA");
          tmProduto.addColumn("1");
          tmProduto.addColumn("U2");
          tmProduto.addColumn("3");
           tmProduto.addColumn("Nome do Produto");
           tmProduto.addColumn("Código");
           tmProduto.addColumn("Nome do Produto");
           tmProduto.addColumn("Código");
           tmProduto.addColumn("Nome do Produto");
           tmProduto.addColumn("Nome do Produto");
           tmProduto.addColumn("ESTOQUE");
           tmProduto.addColumn("UNIDADE");
           tmProduto.addColumn("OBS");

          tblProduto.setModel(tmProduto);
          
            //Removo a coluna da View (JTable) mas mantenho na model para armazenar o ID
        tblProduto.removeColumn(tblProduto.getColumnModel().getColumn(14));
        tblProduto.removeColumn(tblProduto.getColumnModel().getColumn(15));
        tblProduto.removeColumn(tblProduto.getColumnModel().getColumn(16));
        tblProduto.removeColumn(tblProduto.getColumnModel().getColumn(17));
        tblProduto.removeColumn(tblProduto.getColumnModel().getColumn(18));
        tblProduto.removeColumn(tblProduto.getColumnModel().getColumn(19));
      //  tblProduto.removeColumn(tblProduto.getColumnModel().getColumn(20));
     //  tblProduto.removeColumn(tblProduto.getColumnModel().getColumn(21));
     //  tblProduto.removeColumn(tblProduto.getColumnModel().getColumn(22));
 
    //Opção 2 - Descomentar linhas abaixo caso queira reutilizar o modelo padrão
        //Resgato o modelo da tabela
       // DefaultTableModel tmProduto = (DefaultTableModel) this.txtIdProduto.getModel();
        ////Limpo a tabela, excluindo todas as linhas
        //tmClientes.setRowCount(0);
    
    for(String[] c : listaProdutos)
        {
            tmProduto.addRow(c);
        }
        
        //Defino o tamanho para cada coluna
    // tmProduto.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
      tblProduto.getColumnModel().getColumn(0).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(1).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(2).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(3).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(4).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(5).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(6).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(7).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(8).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(9).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(10).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(11).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(13).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(14).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(15).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(16).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(17).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(18).setPreferredWidth(100);
      tblProduto.getColumnModel().getColumn(19).setPreferredWidth(100);
   // tblProduto.getColumnModel().getColumn(20).setPreferredWidth(300);
    // tblProduto.getColumnModel().getColumn(21).setPreferredWidth(100);
   //  tblProduto.getColumnModel().getColumn(22).setPreferredWidth(300);
  //   tblProduto.getColumnModel().getColumn(23).setPreferredWidth(100);   
   //  tblProduto.getColumnModel().getColumn(24).setPreferredWidth(300);
    // tblProduto.getColumnModel().getColumn(25).setPreferredWidth(100);  

    
}
    
    public void LimparFormulario()
    {
txtIdProduto.setText("");
txtNomeProduto.setText("");
txtDescricaoProduto.setText("");
//txtCategoriaProduto.setText("Sofa");
//txtSubcategoriaProduto.setText("");
txtValorvendaProduto.setText("");
txtImpostoProduto.setText("");
txtComissaoProduto.setText("");
txtDimensoesProduto.setText("");
txtCorProduto.setText("");
txtPesoProduto.setText("");
//txtGarantiaProduto.setText("");
txtMarcaProduto.setText("");
txtLinhaProduto.setText("");
txtDocfornProduto.setText("");
txtNomefornProduto.setText("");
txtEnderecofornProduto.setText("");
txtCidadefornProduto.setText("");
//txtUffornProduto.setText("AC");
txtContatofornProduto.setText("");
txtTelefonefornProduto.setText("");
txtEmailfornProduto.setText("");
txtEstoqueProduto.setText("");
//txtUnidademProduto.setText("");
txtRefProduto.setText("");

        
    }
    
    
       public void DesabilitarFormulario()
    {
txtIdProduto.setEnabled(false);
txtNomeProduto.setEnabled(false);
txtDescricaoProduto.setEnabled(false);
txtCategoriaProduto.setEditable(false);
txtSubcategoriaProduto.setEditable(false);
txtValorvendaProduto.setEditable(false);
txtImpostoProduto.setEditable(false);
txtComissaoProduto.setEditable(false);
txtDimensoesProduto.setEditable(false);
txtCorProduto.setEditable(false);
txtPesoProduto.setEditable(false);
txtGarantiaProduto.setEditable(false);
txtMarcaProduto.setEditable(false);
txtLinhaProduto.setEditable(false);
txtDocfornProduto.setEditable(false);
txtNomefornProduto.setEditable(false);
txtEnderecofornProduto.setEditable(false);
txtCidadefornProduto.setEditable(false);
txtUffornProduto.setEditable(false);
txtContatofornProduto.setEditable(false);
txtTelefonefornProduto.setEditable(false);
txtEmailfornProduto.setEditable(false);
txtEstoqueProduto.setEditable(false);
txtUnidademProduto.setEditable(false);
txtRefProduto.setEditable(false);


    } 
    
    
    
        public void HabilitarFormulario()
    {
        txtIdProduto.setEnabled(true);
txtDescricaoProduto.setEnabled(true);
txtNomeProduto.setEnabled(true);
txtCategoriaProduto.setEditable(true);
txtSubcategoriaProduto.setEditable(true);
txtValorvendaProduto.setEditable(true);
txtImpostoProduto.setEditable(true);
txtComissaoProduto.setEditable(true);
txtDimensoesProduto.setEditable(true);
txtCorProduto.setEditable(true);
txtPesoProduto.setEditable(true);
txtGarantiaProduto.setEditable(true);
txtMarcaProduto.setEditable(true);
txtLinhaProduto.setEditable(true);
txtDocfornProduto.setEditable(true);
txtNomefornProduto.setEditable(true);
txtEnderecofornProduto.setEditable(true);
txtCidadefornProduto.setEditable(true);
txtUffornProduto.setEditable(true);
txtContatofornProduto.setEditable(true);
txtTelefonefornProduto.setEditable(true);
txtEmailfornProduto.setEditable(true);
txtEstoqueProduto.setEditable(true);
txtUnidademProduto.setEditable(true);
txtRefProduto.setEditable(true);

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField8 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        pnlComputador = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtIdProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDescricaoProduto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCategoriaProduto = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtSubcategoriaProduto = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtComissaoProduto = new javax.swing.JFormattedTextField();
        txtImpostoProduto = new javax.swing.JFormattedTextField();
        txtValorvendaProduto = new javax.swing.JFormattedTextField();
        pnlSO = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCorProduto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtMarcaProduto = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtLinhaProduto = new javax.swing.JTextField();
        txtDimensoesProduto = new javax.swing.JFormattedTextField();
        txtPesoProduto = new javax.swing.JFormattedTextField();
        txtGarantiaProduto = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnAdicionarProduto = new javax.swing.JButton();
        btnEditarProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        btnConsultarProduto = new javax.swing.JButton();
        pnlHD3 = new javax.swing.JPanel();
        txtEstoqueProduto = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtUnidademProduto = new javax.swing.JComboBox<>();
        txtRefProduto = new javax.swing.JTextField();
        pnlHD = new javax.swing.JPanel();
        txtDocfornProduto = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        txtContatofornProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtNomefornProduto = new javax.swing.JTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        txtCidadefornProduto = new javax.swing.JTextField();
        txtEmailfornProduto = new javax.swing.JTextField();
        txtTelefonefornProduto = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtEnderecofornProduto = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtUffornProduto = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        btnSalvarProduto = new javax.swing.JButton();
        btnCancelarProduto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Compra Personalizada");
        setResizable(false);

        pnlComputador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24))); // NOI18N
        pnlComputador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setText("Código*");

        txtIdProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProdutoActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Descrição*");

        jLabel8.setText("Categoria*");

        txtCategoriaProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Móveis\t", "Utensilios Domesticos", "Cama, Mesa e Banho" }));
        txtCategoriaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaProdutoActionPerformed(evt);
            }
        });

        jLabel12.setText("Subcategoria*");

        txtSubcategoriaProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sofás", "Poltronas", "Mesas" }));

        jLabel16.setText("Valor Venda (R$)");

        jLabel1.setText("Comissão (%)");

        jLabel9.setText("Nome do Produto*");

        jLabel11.setText("Valor Impostos (R$)");

        txtComissaoProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getPercentInstance())));

        txtImpostoProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        txtValorvendaProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.##"))));

        javax.swing.GroupLayout pnlComputadorLayout = new javax.swing.GroupLayout(pnlComputador);
        pnlComputador.setLayout(pnlComputadorLayout);
        pnlComputadorLayout.setHorizontalGroup(
            pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlComputadorLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlComputadorLayout.createSequentialGroup()
                        .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeProduto))
                    .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlComputadorLayout.createSequentialGroup()
                        .addComponent(txtCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtSubcategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlComputadorLayout.createSequentialGroup()
                        .addComponent(txtValorvendaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtImpostoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtComissaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlComputadorLayout.setVerticalGroup(
            pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComputadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(txtSubcategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11)
                    .addComponent(txtComissaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtImpostoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorvendaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        pnlSO.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Caracteristicas do Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24))); // NOI18N

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Dimensões LxAxC (em cm)");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Peso (kg)");

        jLabel10.setText("Marca");

        jLabel15.setText("Tempo Garantia (anos)");

        jLabel21.setText("Cor");

        jLabel22.setText("Linha");

        try {
            txtDimensoesProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###x###x###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDimensoesProduto.setToolTipText("");
        txtDimensoesProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDimensoesProdutoActionPerformed(evt);
            }
        });

        txtPesoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoProdutoActionPerformed(evt);
            }
        });

        txtGarantiaProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 meses", "6 meses", "12 meses", "18 meses", "24 meses" }));
        txtGarantiaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGarantiaProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSOLayout = new javax.swing.GroupLayout(pnlSO);
        pnlSO.setLayout(pnlSOLayout);
        pnlSOLayout.setHorizontalGroup(
            pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSOLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlSOLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtGarantiaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel10))
                    .addGroup(pnlSOLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDimensoesProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlSOLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel22)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(txtLinhaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSOLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(txtCorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSOLayout.setVerticalGroup(
            pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel7)
                    .addComponent(txtDimensoesProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel10)
                    .addComponent(txtMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtLinhaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGarantiaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pnlSOLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel15, jLabel6, jLabel7});

        pnlSOLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCorProduto, txtLinhaProduto, txtMarcaProduto});

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel2.setText("Módulo de Produto");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/yellow-archive-icon.png"))); // NOI18N

        btnAdicionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/yellow-document-plus-icon.png"))); // NOI18N
        btnAdicionarProduto.setText("Adicionar");
        btnAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdutoActionPerformed(evt);
            }
        });

        btnEditarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/yellow-notes-icon.png"))); // NOI18N
        btnEditarProduto.setText("Editar");
        btnEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdutoActionPerformed(evt);
            }
        });

        btnExcluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/yellow-document-cross-icon.png"))); // NOI18N
        btnExcluirProduto.setText("Excluir");
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        btnConsultarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/yellow-search-icon_1.png"))); // NOI18N
        btnConsultarProduto.setText("Consultar");
        btnConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProdutoActionPerformed(evt);
            }
        });

        pnlHD3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações de Estoque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24))); // NOI18N

        txtEstoqueProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstoqueProdutoActionPerformed(evt);
            }
        });

        jLabel13.setText("Referencias/Obs.:");

        jLabel23.setText("Estoque*");

        jLabel31.setText("Unidade de Medida");

        txtUnidademProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Litros", "Unidades", "Metros" }));
        txtUnidademProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidademProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHD3Layout = new javax.swing.GroupLayout(pnlHD3);
        pnlHD3.setLayout(pnlHD3Layout);
        pnlHD3Layout.setHorizontalGroup(
            pnlHD3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHD3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlHD3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlHD3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHD3Layout.createSequentialGroup()
                        .addComponent(txtEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(txtUnidademProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRefProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        pnlHD3Layout.setVerticalGroup(
            pnlHD3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHD3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHD3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(txtUnidademProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlHD3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtRefProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnlHD.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do Fornecedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24))); // NOI18N

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Nome*");

        jLabel3.setText("Contato");

        jLabel18.setText("CNPJ Fornecedor*");

        jLabel20.setText("CEP");

        jLabel25.setText("Cidade");

        txtTelefonefornProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonefornProdutoActionPerformed(evt);
            }
        });

        jLabel27.setText("Email");

        jLabel28.setText("Telefone");

        txtEnderecofornProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecofornProdutoActionPerformed(evt);
            }
        });

        jLabel29.setText("Endereço");

        txtUffornProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txtUffornProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUffornProdutoActionPerformed(evt);
            }
        });

        jLabel30.setText("UF");

        javax.swing.GroupLayout pnlHDLayout = new javax.swing.GroupLayout(pnlHD);
        pnlHD.setLayout(pnlHDLayout);
        pnlHDLayout.setHorizontalGroup(
            pnlHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHDLayout.createSequentialGroup()
                .addGroup(pnlHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHDLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pnlHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel29))
                        .addGap(18, 18, 18)
                        .addGroup(pnlHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContatofornProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEnderecofornProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHDLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHDLayout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCidadefornProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtUffornProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHDLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDocfornProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnlHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(pnlHDLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNomefornProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlHDLayout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel28)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTelefonefornProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel27)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEmailfornProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlHDLayout.setVerticalGroup(
            pnlHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtDocfornProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomefornProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(pnlHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHDLayout.createSequentialGroup()
                        .addGroup(pnlHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEnderecofornProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHDLayout.createSequentialGroup()
                        .addGroup(pnlHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUffornProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(txtCidadefornProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(18, 18, 18)))
                .addGroup(pnlHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtContatofornProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailfornProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonefornProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalvarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/green-ok-icon.png"))); // NOI18N
        btnSalvarProduto.setText("Salvar");
        btnSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProdutoActionPerformed(evt);
            }
        });

        btnCancelarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/red-cross-icon (1).png"))); // NOI18N
        btnCancelarProduto.setText("Cancelar");
        btnCancelarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarProdutoActionPerformed(evt);
            }
        });

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblProduto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pnlComputador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlSO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(pnlHD3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 57, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 223, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addComponent(pnlComputador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlHD, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlHD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluirProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        pnlComputador.getAccessibleContext().setAccessibleName("Selecione o cliente");
        pnlComputador.getAccessibleContext().setAccessibleDescription("");
        pnlHD.getAccessibleContext().setAccessibleName("Detalhes do Pedido");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed
   
        modoTela = "Criar";
        HabilitarFormulario();
        LimparFormulario();
        Random gerador = new Random();
        txtIdProduto.setText(Integer.toString(gerador.nextInt(60000)));
        btnAdicionarProduto.setEnabled(false);
        btnExcluirProduto.setEnabled(false);
        btnEditarProduto.setEnabled(false);
        btnConsultarProduto.setEnabled(false);
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

    private void btnEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarProdutoActionPerformed

    private void btnConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarProdutoActionPerformed
        // TODO add your handling code here:
        produto.setVisible(true);
    }//GEN-LAST:event_btnConsultarProdutoActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void txtEstoqueProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstoqueProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstoqueProdutoActionPerformed

    private void txtCategoriaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaProdutoActionPerformed

    private void txtDimensoesProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDimensoesProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDimensoesProdutoActionPerformed

    private void txtPesoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoProdutoActionPerformed

    private void txtGarantiaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGarantiaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGarantiaProdutoActionPerformed

    private void txtUnidademProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidademProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidademProdutoActionPerformed

    private void btnSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProdutoActionPerformed
             
        if(ValidarFormulario())
        {
            if(modoTela.equals("Criar"))
            {
                //Passo ao controller a entrada do usuário e peço para salvar no banco de dados
                if(ProdutoController.salvar(

txtNomeProduto.getText(),
txtDescricaoProduto.getText(),
txtCategoriaProduto.getSelectedItem().toString(),
txtSubcategoriaProduto.getSelectedItem().toString(),
txtValorvendaProduto.getText(),
txtImpostoProduto.getText(),
txtComissaoProduto.getText(),
txtDimensoesProduto.getText(),
txtCorProduto.getText(),
txtPesoProduto.getText(),
txtGarantiaProduto.getSelectedItem().toString(),
txtMarcaProduto.getText(),
txtLinhaProduto.getText(),
txtDocfornProduto.getText(),
txtNomefornProduto.getText(),
txtEnderecofornProduto.getText(),
txtCidadefornProduto.getText(),
txtUffornProduto.getSelectedItem().toString(),
txtContatofornProduto.getText(),
txtTelefonefornProduto.getText(),
txtEmailfornProduto.getText(),
txtEstoqueProduto.getText(),
txtUnidademProduto.getSelectedItem().toString(),
txtRefProduto.getText()
                ))
                {
                    //Recarrego a tabela com os dados resgatados do banco de dados
                    this.LoadTable();
                    
                    JOptionPane.showMessageDialog(null,"Produto cadastrado com sucesso!");
                    LimparFormulario();
                }else{
                    JOptionPane.showMessageDialog(null,"Falha ao cadastrar Produto!");
                }

                 btnAdicionarProduto.setEnabled(true);
        btnExcluirProduto.setEnabled(true);
        btnEditarProduto.setEnabled(true);
        btnConsultarProduto.setEnabled(true);
                
            }else
            {

                //Passo ao controller a entrada do usuário e peço para atualizar o banco de dados
                if(ProdutoController.atualizar(
                        Integer.parseInt(txtIdProduto.getText()), 
txtNomeProduto.getText(),
txtDescricaoProduto.getText(),
txtCategoriaProduto.getSelectedItem().toString(),
txtSubcategoriaProduto.getSelectedItem().toString(),
txtValorvendaProduto.getText(),
txtImpostoProduto.getText(),
txtComissaoProduto.getText(),
txtDimensoesProduto.getText(),
txtCorProduto.getText(),
txtPesoProduto.getText(),
txtGarantiaProduto.getSelectedItem().toString(),
txtMarcaProduto.getText(),
txtLinhaProduto.getText(),
txtDocfornProduto.getText(),
txtNomefornProduto.getText(),
txtEnderecofornProduto.getText(),
txtCidadefornProduto.getText(),
txtUffornProduto.getSelectedItem().toString(),
txtContatofornProduto.getText(),
txtTelefonefornProduto.getText(),
txtEmailfornProduto.getText(),
txtEstoqueProduto.getText(),
txtUnidademProduto.getSelectedItem().toString(),
txtRefProduto.getText()      
                ))
                {
                    //Recarrego a tabela com os dados resgatados do banco de dados
                    this.LoadTable();
                    JOptionPane.showMessageDialog(this,"Carro atualizado com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(this,"Falha ao atualizar Carro!");
                }

            }

            LimparFormulario();
            DesabilitarFormulario();
        btnAdicionarProduto.setEnabled(true);
        btnExcluirProduto.setEnabled(true);
        btnEditarProduto.setEnabled(true);
        btnConsultarProduto.setEnabled(true);
        
        }
    }//GEN-LAST:event_btnSalvarProdutoActionPerformed

    private void btnCancelarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarProdutoActionPerformed
     LimparFormulario();
    }//GEN-LAST:event_btnCancelarProdutoActionPerformed

    private void txtIdProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProdutoActionPerformed
              // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProdutoActionPerformed

    private void txtUffornProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUffornProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUffornProdutoActionPerformed

    private void txtEnderecofornProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecofornProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecofornProdutoActionPerformed

    private void txtTelefonefornProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonefornProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonefornProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProdutoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnCancelarProduto;
    private javax.swing.JButton btnConsultarProduto;
    private javax.swing.JButton btnEditarProduto;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnSalvarProduto;
    private javax.swing.JFormattedTextField jFormattedTextField2;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel pnlComputador;
    private javax.swing.JPanel pnlHD;
    private javax.swing.JPanel pnlHD3;
    private javax.swing.JPanel pnlSO;
    private javax.swing.JTable tblProduto;
    private javax.swing.JComboBox<String> txtCategoriaProduto;
    private javax.swing.JTextField txtCidadefornProduto;
    private javax.swing.JFormattedTextField txtComissaoProduto;
    private javax.swing.JTextField txtContatofornProduto;
    private javax.swing.JTextField txtCorProduto;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JFormattedTextField txtDimensoesProduto;
    private javax.swing.JFormattedTextField txtDocfornProduto;
    private javax.swing.JTextField txtEmailfornProduto;
    private javax.swing.JTextField txtEnderecofornProduto;
    private javax.swing.JFormattedTextField txtEstoqueProduto;
    private javax.swing.JComboBox<String> txtGarantiaProduto;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JFormattedTextField txtImpostoProduto;
    private javax.swing.JTextField txtLinhaProduto;
    private javax.swing.JTextField txtMarcaProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtNomefornProduto;
    private javax.swing.JFormattedTextField txtPesoProduto;
    private javax.swing.JTextField txtRefProduto;
    private javax.swing.JComboBox<String> txtSubcategoriaProduto;
    private javax.swing.JTextField txtTelefonefornProduto;
    private javax.swing.JComboBox<String> txtUffornProduto;
    private javax.swing.JComboBox<String> txtUnidademProduto;
    private javax.swing.JFormattedTextField txtValorvendaProduto;
    // End of variables declaration//GEN-END:variables

private boolean ValidarFormulario() {
        
        if(this.txtNomeProduto.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um nome para o Modelo!");
            return false;
        }
        
        if(this.txtDescricaoProduto.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um Ano para o Carro!");
            return false;
        }
        
         if(this.txtIdProduto.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um Ano para o Carro!");
            return false;
        }
        
        return true;
        
    }

}
