/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo.guayacan_api;

import java.awt.Color;
//import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
/*import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;*/
import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/*import javax.swing.JComponent;
import javax.swing.border.MatteBorder;*/
import javax.swing.table.DefaultTableModel;
/*import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;*/

/**
 *
 * @author Diego Condemarin & João Pedro
 */

public class index extends javax.swing.JFrame {

    //Alteração das Cores das Barras de seleção será feita aqui:
    int[] cl_sel = new int[]{153, 153, 153};//Barra selecionada
    int[] cl_not_sel = new int[]{95, 95, 95};//Barra não selecionada
    int FLAG = 0;//EVITA FAZER A CONSULTA AO BANCO VARIAS VEZES, ASSIM QUE O BOTÃO É PRESSIONADO
    //FLAG = {1,2,3,4,5,6} 1 - FUNC/ 2- ESTQ/3 - ORÇAMENTO/4 - PROD/5 - CLI/6 - PROJ
    Color BT = new Color(cl_sel[0], cl_sel[1], cl_sel[2]);//Salvar as cores em uma array, assim só precisa chamar a instancia cor sem prcisar ficar colocando arrays
    Color NOT_BT = new Color(cl_not_sel[0], cl_not_sel[1], cl_not_sel[2]);
    BD con = new BD();
    //CRiADO ArraY PARA TITULOS DA TABELA
    String[] tilt_func = new String[]{"Código_Funcionário", "Nome", "Função"};
    String[] tilt_Estq = new String[]{"Código_Estoque", "Disponibilidade", "Quantidade"};
    String[] tilt_Orc = new String[]{"Código_Orçamento", "Data", "Valor"};
    String[] tilt_Prd = new String[]{"Código_Produto", "Nome", "Preço"};
    String[] tilt_Cli = new String[]{"Endereço", "CPF", "Nome"};
    String[] tilt_Proj = new String[]{"Data_Início", "Data_Entrega", "Código_Projeto"};
    //Armazenando arrays em uma array Universal
    String[][] arrays = {tilt_func,
        tilt_Estq,
        tilt_Orc,
        tilt_Prd,
        tilt_Cli,
        tilt_Proj};
    //MODEL QUE SERÁ UTILIZADO
    DefaultTableModel tableModel = new DefaultTableModel();

    public index() {
        //Componentes padrãos criados na tela design
        initComponents();

        //Verificar se o banco está conectado
        Status();
        //Adição dos icons
        Icon produto_imagem = new ImageIcon("C:/Users/Dell/Documents/Guayacan_API/Guayacan_API/target/icons8_people_15px.png");
        btn_clientes.setIcon(produto_imagem);
        produto_imagem = new ImageIcon("C:/Users/Dell/Documents/Guayacan_API/Guayacan_API/target/icons8_trolley_30px.png");
        btn_estoque.setIcon(produto_imagem);
        produto_imagem = new ImageIcon("C:/Users/Dell/Documents/Guayacan_API/Guayacan_API/target/icons8_contact_30px_1.png");
        btn_usuarios.setIcon(produto_imagem);
        produto_imagem = new ImageIcon("C:/Users/Dell/Documents/Guayacan_API/Guayacan_API/target/icons8_idea_sharing_30px.png");
        btn_produtos.setIcon(produto_imagem);
        produto_imagem = new ImageIcon("C:/Users/Dell/Documents/Guayacan_API/Guayacan_API/target/icons8_people_30px.png");
        btn_projetos4.setIcon(produto_imagem);
        produto_imagem = new ImageIcon("C:/Users/Dell/Documents/Guayacan_API/Guayacan_API/target/icons8_Smart_Home_Automation_15px.png");
        btn_projetos2.setIcon(produto_imagem);
        produto_imagem = new ImageIcon("C:/Users/Dell/Documents/Guayacan_API/Guayacan_API/target/Guayacan_300px.png");
        jLabel7.setIcon(produto_imagem);
        
        //È onde é vizualizado todas as mudanças e salvo
        AbstractAction action = new AbstractAction()
{
    public void actionPerformed(ActionEvent e)
    {
        TableCellListener tcl = (TableCellListener)e.getSource();
        System.out.println("Row   : " + tcl.getRow());
        System.out.println("Column: " + tcl.getColumn());
        System.out.println("Old   : " + tcl.getOldValue());//valor que estava antes
        System.out.println("New   : " + tcl.getNewValue());//valor que foi modificado
        //jTable1.paint(blue);
    }
}; 
        

TableCellListener tcl = new TableCellListener(jTable1, action);
        //jTable1.paint(g);
    //falta apenas adicionar borda e a opção de editar ou reverter as alteração anteriores
    //OPÇÃO DE DELETAR UMA LINHA E FAZER A ALTERAÇÃO DOS CÓDIGOS
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Panel_clientes = new javax.swing.JPanel();
        btn_clientes = new javax.swing.JLabel();
        Panel_estq = new javax.swing.JPanel();
        btn_estoque = new javax.swing.JLabel();
        Panel_user = new javax.swing.JPanel();
        btn_usuarios = new javax.swing.JLabel();
        Panel_prod = new javax.swing.JPanel();
        btn_produtos = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Panel_orc = new javax.swing.JPanel();
        btn_projetos4 = new javax.swing.JLabel();
        Panel_proj = new javax.swing.JPanel();
        btn_projetos2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Tiltulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        result = new javax.swing.JLabel();
        Panel_user1 = new javax.swing.JPanel();
        btn_projetos3 = new javax.swing.JLabel();
        Panel_user2 = new javax.swing.JPanel();
        Atualizar = new javax.swing.JLabel();
        Panel_user3 = new javax.swing.JPanel();
        Add_Linha = new javax.swing.JLabel();
        Panel_user4 = new javax.swing.JPanel();
        Del_Linha = new javax.swing.JLabel();
        STATUS1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(228, 228, 228));
        setPreferredSize(new java.awt.Dimension(1800, 900));
        setSize(new java.awt.Dimension(900, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(34, 34, 34));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new java.awt.BorderLayout());
        jPanel3.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 770, 750, -1));

        Panel_clientes.setBackground(new java.awt.Color(153, 153, 153));
        Panel_clientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Panel_clientes.setLayout(new java.awt.BorderLayout());

        btn_clientes.setBackground(new java.awt.Color(139, 61, 255));
        btn_clientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_clientes.setText("CLIENTES");
        btn_clientes.setToolTipText("");
        btn_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clientes(evt);
            }
        });
        Panel_clientes.add(btn_clientes, java.awt.BorderLayout.CENTER);

        jPanel1.add(Panel_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, 70));

        Panel_estq.setBackground(new java.awt.Color(95, 95, 95));
        Panel_estq.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Panel_estq.setLayout(new java.awt.BorderLayout());

        btn_estoque.setBackground(new java.awt.Color(139, 61, 255));
        btn_estoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_estoque.setText("ESTOQUE");
        btn_estoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_estoqueMouseClicked(evt);
            }
        });
        Panel_estq.add(btn_estoque, java.awt.BorderLayout.CENTER);

        jPanel1.add(Panel_estq, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 200, 70));

        Panel_user.setBackground(new java.awt.Color(95, 95, 95));
        Panel_user.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Panel_user.setLayout(new java.awt.BorderLayout());

        btn_usuarios.setBackground(new java.awt.Color(139, 61, 255));
        btn_usuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_usuarios.setText("USUÁRIOS");
        btn_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_usuariosMouseClicked(evt);
            }
        });
        Panel_user.add(btn_usuarios, java.awt.BorderLayout.CENTER);

        jPanel1.add(Panel_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 200, 70));

        Panel_prod.setBackground(new java.awt.Color(95, 95, 95));
        Panel_prod.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Panel_prod.setLayout(new java.awt.BorderLayout());

        btn_produtos.setBackground(new java.awt.Color(139, 61, 255));
        btn_produtos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_produtos.setText("PRODUTOS");
        btn_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_produtosMouseClicked(evt);
            }
        });
        Panel_prod.add(btn_produtos, java.awt.BorderLayout.CENTER);

        jPanel1.add(Panel_prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 200, 70));

        jLabel7.setPreferredSize(new java.awt.Dimension(600, 182));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, 200, 80));

        Panel_orc.setBackground(new java.awt.Color(95, 95, 95));
        Panel_orc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Panel_orc.setLayout(new java.awt.BorderLayout());

        btn_projetos4.setBackground(new java.awt.Color(139, 61, 255));
        btn_projetos4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_projetos4.setText("ORÇAMENTO");
        btn_projetos4.setAlignmentY(0.8F);
        btn_projetos4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_projetos4MouseClicked(evt);
            }
        });
        Panel_orc.add(btn_projetos4, java.awt.BorderLayout.CENTER);

        jPanel1.add(Panel_orc, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 40, 196, 70));

        Panel_proj.setBackground(new java.awt.Color(95, 95, 95));
        Panel_proj.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Panel_proj.setLayout(new java.awt.BorderLayout());

        btn_projetos2.setBackground(new java.awt.Color(139, 61, 255));
        btn_projetos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_projetos2.setText("PROJETO");
        btn_projetos2.setAlignmentY(0.8F);
        btn_projetos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_projetos2MouseClicked(evt);
            }
        });
        Panel_proj.add(btn_projetos2, java.awt.BorderLayout.CENTER);

        jPanel1.add(Panel_proj, new org.netbeans.lib.awtextra.AbsoluteConstraints(1002, 40, 200, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 110));

        jPanel2.setBackground(new java.awt.Color(228, 228, 228));
        jPanel2.setForeground(new java.awt.Color(228, 228, 228));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Cliente", "Nome ", "Endereço", "CPF", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTable1.setDoubleBuffered(true);
        jTable1.setDragEnabled(true);
        jTable1.setDropMode(javax.swing.DropMode.ON);
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 930, 380));

        Tiltulo.setEditable(false);
        Tiltulo.setBackground(new java.awt.Color(228, 228, 228));
        Tiltulo.setFont(new java.awt.Font("Segoe UI Historic", 0, 36)); // NOI18N
        Tiltulo.setForeground(new java.awt.Color(143, 143, 143));
        Tiltulo.setText("Clientes");
        Tiltulo.setBorder(null);
        Tiltulo.setMinimumSize(new java.awt.Dimension(1000, 126));
        Tiltulo.setPreferredSize(new java.awt.Dimension(250, 48));
        jPanel2.add(Tiltulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 300, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("STATUS: ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 60, -1, -1));

        result.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        result.setForeground(new java.awt.Color(0, 204, 204));
        result.setText(" ");
        jPanel2.add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 400, 270, 50));

        Panel_user1.setBackground(new java.awt.Color(0, 204, 204));
        Panel_user1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Panel_user1.setForeground(new java.awt.Color(0, 153, 153));
        Panel_user1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_user1MouseClicked(evt);
            }
        });
        Panel_user1.setLayout(new java.awt.BorderLayout());

        btn_projetos3.setBackground(new java.awt.Color(139, 61, 255));
        btn_projetos3.setForeground(new java.awt.Color(0, 0, 0));
        btn_projetos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_projetos3.setText("TESTAR TABELA");
        btn_projetos3.setAlignmentY(0.8F);
        btn_projetos3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_projetos3MouseClicked(evt);
            }
        });
        Panel_user1.add(btn_projetos3, java.awt.BorderLayout.CENTER);

        jPanel2.add(Panel_user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 160, 340, 50));

        Panel_user2.setBackground(new java.awt.Color(204, 204, 204));
        Panel_user2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Panel_user2.setForeground(new java.awt.Color(0, 153, 153));
        Panel_user2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_user2MouseClicked(evt);
            }
        });
        Panel_user2.setLayout(new java.awt.BorderLayout());

        Atualizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Atualizar.setForeground(new java.awt.Color(153, 153, 153));
        Atualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Atualizar.setText("Atualizador BD");
        Atualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Atualizar.setFocusable(false);
        Atualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtulizaBD(evt);
            }
        });
        Panel_user2.add(Atualizar, java.awt.BorderLayout.CENTER);

        jPanel2.add(Panel_user2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 230, 336, 46));

        Panel_user3.setBackground(new java.awt.Color(204, 204, 204));
        Panel_user3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Panel_user3.setForeground(new java.awt.Color(153, 153, 153));
        Panel_user3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_user3MouseClicked(evt);
            }
        });
        Panel_user3.setLayout(new java.awt.BorderLayout());

        Add_Linha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Add_Linha.setForeground(new java.awt.Color(153, 153, 153));
        Add_Linha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add_Linha.setText("Adicionar Linha");
        Add_Linha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Add_Linha.setFocusable(false);
        Add_Linha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_LinhaMouseClicked(evt);
            }
        });
        Panel_user3.add(Add_Linha, java.awt.BorderLayout.CENTER);

        jPanel2.add(Panel_user3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 300, 160, 42));

        Panel_user4.setBackground(new java.awt.Color(204, 204, 204));
        Panel_user4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Panel_user4.setForeground(new java.awt.Color(0, 153, 153));
        Panel_user4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_user4MouseClicked(evt);
            }
        });
        Panel_user4.setLayout(new java.awt.BorderLayout());

        Del_Linha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Del_Linha.setForeground(new java.awt.Color(153, 153, 153));
        Del_Linha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Del_Linha.setText("Remover Linha");
        Del_Linha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Del_Linha.setFocusable(false);
        Del_Linha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Del_LinhaMouseClicked(evt);
            }
        });
        Panel_user4.add(Del_Linha, java.awt.BorderLayout.CENTER);

        jPanel2.add(Panel_user4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 300, 156, 40));

        STATUS1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        STATUS1.setForeground(new java.awt.Color(0, 204, 204));
        STATUS1.setText("NÃO CONECTADO");
        jPanel2.add(STATUS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 100, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1430, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void btn_clientes(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientes
        /*DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[] {null,"VALOR","NOME",null,"TESTE"});
        model.removeRow(1);
         */
        
        DefaultTableModel Model_cli = new DefaultTableModel();
        if (FLAG != 5) {
            FLAG = 5;
            con.dataBaseSelect(FLAG);
            String[] row = new String[con.Select.size()];
            String[] vare = new String[con.var2.size()];
            String[] vare1 = new String[con.var3.size()];
            String[] vare2 = new String[con.dados_cod.size()];
            for (String columnName : arrays[FLAG - 1]) {
                Model_cli.addColumn(columnName);
            }
            for (int a = 0; a < con.var2.size(); a++) {
                row[0] = con.var2.get(a).toString();
                row[1] = con.var3.get(a).toString();
                row[2] = con.dados_cod.get(a).toString();
                Model_cli.addRow(row);
                System.out.println(row[a]);
            }
            jTable1.setModel(Model_cli);
            jTable1.repaint();
            con.ArrayClear();
            //con.ArrayClear();
        }
        Tiltulo.setText("Clientes");
        Panel_clientes.setBackground(BT);
        Panel_user.setBackground(NOT_BT);
        Panel_estq.setBackground(NOT_BT);
        Panel_orc.setBackground(NOT_BT);
        Panel_proj.setBackground(NOT_BT);
        Panel_prod.setBackground(NOT_BT);

        /*
        //Acesso ao banco
        //Inserção na tabela
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setValueAt("SEM_DATA", 0, 0);//Inicializa pelo 0
        model.setValueAt(12, 0, 1);
            
        JTableHeader th = jTable1.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();
        System.out.println(tcm);
        TableColumn tc = tcm.getColumn(0);
        System.out.println(tc);
        //EXEMPLO DE CRIAÇÃO DE TABELAS COM TITULOS E ROW VAZIAS,
        //**NO ENTANTO É POSSIVEL FAZER ALTERAÇÃO NELA, CRIAR UMA OPÇÃO DE LOCKAR ISSO
        System.out.println(tc);
        tc.setHeaderValue("12");
        th.setColumnModel(tcm);
        th.repaint();
        
        DefaultTableModel tableModel = new DefaultTableModel();
        for(String columnName : arrays[4]){
        tableModel.addColumn(columnName);
        }   
        jTable1.setModel(tableModel);
        //tableModel.addRow(var);
         
        for (String columnName : arrays[4]) {
            tableModel.addColumn(columnName);
        }
        jTable1.setModel(tableModel);
        tableModel.addColumn(0);
         */
        //th.repaint();
    }//GEN-LAST:event_btn_clientes

    private void btn_estoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_estoqueMouseClicked
        // TODO add your handling code here:
        DefaultTableModel Model_estq = new DefaultTableModel();

        if (FLAG != 2) {
            FLAG = 2;
            con.dataBaseSelect(FLAG);
            String[] row = new String[con.Select.size()];
            for (String columnName : arrays[FLAG - 1]) {
                Model_estq.addColumn(columnName);
            }
            for (int a = 0; a < con.var2.size(); a++) {
                row[0] = con.var2.get(a).toString();
                row[1] = con.var3.get(a).toString();
                row[2] = con.dados_cod.get(a).toString();
                Model_estq.addRow(row);
                System.out.println(row[a]);
            }
            jTable1.setModel(Model_estq);
            jTable1.repaint();
            con.ArrayClear();
        }

        Tiltulo.setText("Estoque");
        Panel_clientes.setBackground(NOT_BT);
        Panel_user.setBackground(NOT_BT);
        Panel_estq.setBackground(BT);
        Panel_orc.setBackground(NOT_BT);
        Panel_proj.setBackground(NOT_BT);
        Panel_prod.setBackground(NOT_BT);
        //EDITANDO TÍLTULOS

        // tableModel.addColumn(0);
    }//GEN-LAST:event_btn_estoqueMouseClicked

    private void btn_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuariosMouseClicked
        // TODO add your handling code here:
        DefaultTableModel Model_user = new DefaultTableModel();
        if (FLAG != 1) {
            FLAG = 1;
            con.dataBaseSelect(FLAG);
            String[] row = new String[con.Select.size()];
            for (String columnName : arrays[0]) {
                Model_user.addColumn(columnName);
            }
            for (int a = 0; a < con.var2.size(); a++) {
                row[0] = con.var2.get(a).toString();
                row[1] = con.var3.get(a).toString();
                row[2] = con.dados_cod.get(a).toString();
                Model_user.addRow(row);
                System.out.println(row[a]);
            }
            jTable1.setModel(Model_user);
            jTable1.repaint();
            con.ArrayClear();

        }
        Tiltulo.setText("Usuários");
        Panel_clientes.setBackground(NOT_BT);
        Panel_user.setBackground(BT);
        Panel_estq.setBackground(NOT_BT);
        Panel_orc.setBackground(NOT_BT);
        Panel_proj.setBackground(NOT_BT);
        Panel_prod.setBackground(NOT_BT);

        //tableModel.addColumn(0);
    }//GEN-LAST:event_btn_usuariosMouseClicked

    private void btn_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_produtosMouseClicked
        // TODO add your handling code here:
        //[153,153,153] - presionado - 3.581.577 RGB
        //[95,95,95] - não selecionado - 857.375
        DefaultTableModel Model_prod = new DefaultTableModel();

        if (FLAG != 4) {
            FLAG = 4;
            con.dataBaseSelect(FLAG);
            String[] row = new String[con.Select.size()];
            for (String columnName : arrays[3]) {
                Model_prod.addColumn(columnName);
            }
            for (int a = 0; a < con.var2.size(); a++) {
                row[0] = con.var2.get(a).toString();
                row[1] = con.var3.get(a).toString();
                row[2] = con.dados_cod.get(a).toString();
                Model_prod.addRow(row);
                jTable1.setModel(Model_prod);
                System.out.println(row[a]);
            }

            jTable1.setModel(Model_prod);
            jTable1.repaint();
            con.ArrayClear();
        }
        Tiltulo.setText("Produtos");
        Tiltulo.setSize(168, 48);
        Color selecionado = new Color(153, 153, 153);
        Color NotSel = new Color(95, 95, 95);
        Panel_clientes.setBackground(NOT_BT);
        Panel_user.setBackground(NOT_BT);
        Panel_estq.setBackground(NOT_BT);
        Panel_orc.setBackground(NOT_BT);
        Panel_proj.setBackground(NOT_BT);
        Panel_prod.setBackground(BT);

        //Model_prod.addColumn(0);
        //[127, 48]
    }//GEN-LAST:event_btn_produtosMouseClicked

    private void Panel_user1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_user1MouseClicked
        DefaultTableModel MODEL12 = new DefaultTableModel();
        for (String columnName : arrays[5]) {
            MODEL12.addColumn(columnName);
        }
        String[] Ex = new String[]{"1", "2", "3", "4", "5"};
        for (String columnName2 : Ex) {
            MODEL12.addRow(new Object[]{"OK", "OK", "OK"});
        }
        FLAG = 100;
        jTable1.setModel(MODEL12);
        jTable1.repaint();

    }//GEN-LAST:event_Panel_user1MouseClicked

    private void btn_projetos2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_projetos2MouseClicked
        DefaultTableModel Model_proj = new DefaultTableModel();
        if (FLAG != 6) {
            FLAG = 6;
            con.dataBaseSelect(FLAG);
            for (String colum2 : arrays[5]) {
                Model_proj.addColumn(colum2);
            }
            String[] row = new String[25];
            for (int a = 0; a < con.var2.size() / 2; a++) {
                row[0] = con.var2.get(a).toString();
                row[1] = con.var3.get(a).toString();
                row[2] = con.dados_cod.get(a).toString();
                 Model_proj.addRow(row);
                    System.out.println(row[a]);
                }
               
           
        jTable1.setModel(Model_proj);
        jTable1.repaint();
        con.ArrayClear();
        }

        

        Tiltulo.setText("Projetos");
        Panel_clientes.setBackground(NOT_BT);
        Panel_user.setBackground(NOT_BT);
        Panel_estq.setBackground(NOT_BT);
        Panel_orc.setBackground(NOT_BT);
        Panel_proj.setBackground(BT);
        Panel_prod.setBackground(NOT_BT);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_projetos2MouseClicked

    private void AtulizaBD(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtulizaBD
   
        //pega o model e verifica quanto de dadso tem no banco, caso o model tenha mais linha adiciona as linhas novas no BD
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        con.dataBaseSelect(FLAG);   
    int Rows = jTable1.getRowCount();
    int BD_Row = con.var2.size();
    con.ArrayClear();
    String[] var = new String[3];
        System.out.println(Rows);
        System.out.println(BD_Row);
    //int Rows_model = model.getRowCount();
    /*if (BD_Row != Rows){
        String var1 = 
    }*/
   // if (BD_Row != Rows){
        if (Rows > BD_Row){
            for(int x=BD_Row;x<=Rows;x++){
                System.out.println("OK");
                var[0] = jTable1.getModel().getValueAt(x-1,0).toString();
                var[1] = jTable1.getModel().getValueAt(x-1,1).toString();
                var[2] = jTable1.getModel().getValueAt(x-1,2).toString();
                System.out.println(var[0]);
                //System.out.println(var[1]);
                //System.out.println(var[2]);
                con.dataBaseInsert(var[0], var[1], var[2], FLAG);
                result.setText("DADOS ADICIONADOS");
                result.setSize(290, 50);
                  result.setFont(new Font("TimesRoman", Font.PLAIN, 24));
            }
        }
        else if(BD_Row > Rows){
                   //result.setText("DADOS APAGADOS");
                   //result.setSize(290, 50);
                    }
        else{
                   result.setText("DADOS NÃO FORAM ALTERADOS");
                   result.setSize(390, 90);
                   result.setFont(new Font("TimesRoman", Font.PLAIN, 15));
                    }
                
   // jTable1.getModel().getValueAt(1,2));
   // }
        Dimension tableSize = jTable1.getSize();
        //System.out.println(tableSize);
        //Cliente - 64
        //Estoque - 80
        //User - 112
        //Produtos - 96
        //Projetos - 336
    }//GEN-LAST:event_AtulizaBD

    private void btn_projetos3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_projetos3MouseClicked
        DefaultTableModel MODEL12 = new DefaultTableModel();
        for (String columnName : arrays[5]) {
            MODEL12.addColumn(columnName);
        }
        String[] Ex = new String[]{"1", "2", "3", "4", "5"};
        for (String columnName2 : Ex) {
            MODEL12.addRow(new Object[]{"OK", "OK", "OK"});
        }
        FLAG = 100;
        jTable1.setModel(MODEL12);
        jTable1.repaint();    // TODO add your handling code here:
    }//GEN-LAST:event_btn_projetos3MouseClicked

    private void Del_LinhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Del_LinhaMouseClicked
        // TODO add your handling code here:
            DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
            int num = model.getRowCount();
            String var= "";
            System.out.println("flag è:"+FLAG);
            if (num>0){
                        switch (FLAG) {
                case 1:
                    var = model.getValueAt(num-1, 0).toString();
                    break;
                case 2:
                    var = model.getValueAt(num-1, 2).toString();
                    break;
                case 3:
                    var = model.getValueAt(num-1, 0).toString();
                    break;
                case 4:
                    var = model.getValueAt(num-1, 0).toString();
                    break;
                case 5:
                    var = model.getValueAt(num-1, 0).toString();
                    break;
                case 6:
                    var = model.getValueAt(num-1, 0).toString();
                    break;
                default:
                    break;
            }
                System.out.println("VALOR"+var);
            model.removeRow(num-1);
           con.deleteTable(var, FLAG);
            }
             jTable1.setModel(model);
        System.out.println(num);
    }//GEN-LAST:event_Del_LinhaMouseClicked

    private void Add_LinhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_LinhaMouseClicked
   //PEGA O MODELO DA TABELA   
            DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
            String[] Vazio = new String[] {"","",""};
            int num = model.getRowCount();
            model.addRow(Vazio);
            jTable1.setModel(model);
              //jTable1.setShowGrid(rootPaneCheckingEnabled);
       System.out.println(num);
    }//GEN-LAST:event_Add_LinhaMouseClicked

    private void Panel_user2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_user2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_user2MouseClicked

    private void Panel_user3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_user3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_user3MouseClicked

    private void Panel_user4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_user4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_user4MouseClicked

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        System.out.println("asdsadasdsd");     
    }//GEN-LAST:event_jTable1PropertyChange

    private void btn_projetos4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_projetos4MouseClicked
               DefaultTableModel Model_proj = new DefaultTableModel();
        if (FLAG != 3) {
            FLAG = 3;
            con.dataBaseSelect(FLAG);
            for (String colum2 : arrays[2]) {
                Model_proj.addColumn(colum2);
            }
            String[] row = new String[25];
            for (int a = 0; a < con.var2.size(); a++) {
                row[0] = con.var2.get(a).toString();
                row[1] = con.var3.get(a).toString();
                row[2] = con.dados_cod.get(a).toString();
                 Model_proj.addRow(row);
                    System.out.println(row[a]);
                }
               
           
        jTable1.setModel(Model_proj);
        jTable1.repaint();
        con.ArrayClear();
        }
Tiltulo.setSize(250, 50);
        Tiltulo.setText("Orçamento");
        Panel_clientes.setBackground(NOT_BT);
        Panel_user.setBackground(NOT_BT);
        Panel_estq.setBackground(NOT_BT);
        Panel_proj.setBackground(NOT_BT);
        Panel_orc.setBackground(BT);
        Panel_prod.setBackground(NOT_BT);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_projetos4MouseClicked
    public void Status() {
        boolean TesteCon = false;
        TesteCon = con.TesteCon();
        if (TesteCon) {
            STATUS1.setText("CONECTADO");
        } else {
            STATUS1.setText("NÃO CONECTADO");
        }

    }

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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_Linha;
    private javax.swing.JLabel Atualizar;
    private javax.swing.JLabel Del_Linha;
    private javax.swing.JPanel Panel_clientes;
    private javax.swing.JPanel Panel_estq;
    private javax.swing.JPanel Panel_orc;
    private javax.swing.JPanel Panel_prod;
    private javax.swing.JPanel Panel_proj;
    private javax.swing.JPanel Panel_user;
    private javax.swing.JPanel Panel_user1;
    private javax.swing.JPanel Panel_user2;
    private javax.swing.JPanel Panel_user3;
    private javax.swing.JPanel Panel_user4;
    private javax.swing.JLabel STATUS1;
    private javax.swing.JTextField Tiltulo;
    private javax.swing.JLabel btn_clientes;
    private javax.swing.JLabel btn_estoque;
    private javax.swing.JLabel btn_produtos;
    private javax.swing.JLabel btn_projetos2;
    private javax.swing.JLabel btn_projetos3;
    private javax.swing.JLabel btn_projetos4;
    private javax.swing.JLabel btn_usuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel result;
    // End of variables declaration//GEN-END:variables
}
