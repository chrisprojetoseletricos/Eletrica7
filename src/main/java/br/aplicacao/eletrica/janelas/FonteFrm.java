/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.aplicacao.eletrica.janelas;

import br.aplicacao.eletrica.controle.DesktopPane;
import br.aplicacao.eletrica.controle.Ids;
import br.aplicacao.eletrica.entidades.Circuito;
import br.aplicacao.eletrica.entidades.Concessionaria;
import br.aplicacao.eletrica.entidades.Equipamento;
import br.aplicacao.eletrica.entidades.Fonte;
import br.aplicacao.eletrica.entidades.Quadro;
import br.aplicacao.eletrica.servico.CircuitoService;
import br.aplicacao.eletrica.servico.ConcessionariaService;
import br.aplicacao.eletrica.servico.EquipamentoService;
import br.aplicacao.eletrica.servico.FonteService;
import br.aplicacao.eletrica.servico.ProjetoService;
import br.aplicacao.eletrica.servico.QuadroService;
import br.aplicacao.eletrica.uteis.ApenasNumero;
import br.aplicacao.eletrica.uteis.Numero;
import br.aplicacao.eletrica.uteis.TrataID;
import br.aplicacao.eletrica.servico.tableModel.GenericTableModel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chris
 */
public final class FonteFrm extends javax.swing.JInternalFrame {

    private GenericTableModel tabelaModelo;

    /**
     * Creates new form ProjetoFrm
     */
    public FonteFrm() {
        initComponents();
        this.iniciaTabelaFontes();
        this.eventoSelecaoTabela();
        this.eventoDigitar();
        this.cbConcessionariaItens();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelBotoes = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCopiar = new javax.swing.JButton();
        lblIdFonte = new javax.swing.JLabel();
        scrollEsquerdo = new javax.swing.JScrollPane();
        painelEsquerdo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoTensao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbConcessionaria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoDescricao = new javax.swing.JTextArea();
        painelDireito = new javax.swing.JPanel();
        scrollDireito = new javax.swing.JScrollPane();
        tabelaFonte = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Fonte");
        setName("ProjetoFrm"); // NOI18N

        btnSalvar.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSalvar.setIconTextGap(2);
        btnSalvar.setMargin(new java.awt.Insets(1, 1, 1, 1));
        btnSalvar.setMaximumSize(new java.awt.Dimension(71, 32));
        btnSalvar.setMinimumSize(new java.awt.Dimension(71, 32));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnExcluir.setIconTextGap(2);
        btnExcluir.setMargin(new java.awt.Insets(1, 1, 1, 1));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCopiar.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnCopiar.setText("Copiar");
        btnCopiar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCopiar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCopiar.setIconTextGap(2);
        btnCopiar.setMargin(new java.awt.Insets(1, 1, 1, 1));
        btnCopiar.setMaximumSize(new java.awt.Dimension(71, 32));
        btnCopiar.setMinimumSize(new java.awt.Dimension(71, 32));
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIdFonte, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBotoesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir)
                            .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblIdFonte, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        scrollEsquerdo.setBorder(null);
        scrollEsquerdo.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        painelEsquerdo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 204))); // NOI18N
        painelEsquerdo.setPreferredSize(new java.awt.Dimension(300, 200));

        jLabel1.setText("Nome:");

        jLabel2.setText("Tensão nominal F-N (V):");

        campoTensao.setName("campoTensao"); // NOI18N

        jLabel4.setText("Descrição:");

        jLabel5.setText("Concessionária:");

        textoDescricao.setColumns(20);
        textoDescricao.setRows(5);
        jScrollPane1.setViewportView(textoDescricao);

        javax.swing.GroupLayout painelEsquerdoLayout = new javax.swing.GroupLayout(painelEsquerdo);
        painelEsquerdo.setLayout(painelEsquerdoLayout);
        painelEsquerdoLayout.setHorizontalGroup(
            painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEsquerdoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(painelEsquerdoLayout.createSequentialGroup()
                        .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(painelEsquerdoLayout.createSequentialGroup()
                                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbConcessionaria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEsquerdoLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoTensao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelEsquerdoLayout.setVerticalGroup(
            painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEsquerdoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoTensao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbConcessionaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addContainerGap())
        );

        scrollEsquerdo.setViewportView(painelEsquerdo);

        painelDireito.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 255))); // NOI18N
        painelDireito.setPreferredSize(new java.awt.Dimension(172, 22));

        scrollDireito.setBorder(null);

        tabelaFonte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabelaFonte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFonteMouseClicked(evt);
            }
        });
        scrollDireito.setViewportView(tabelaFonte);

        javax.swing.GroupLayout painelDireitoLayout = new javax.swing.GroupLayout(painelDireito);
        painelDireito.setLayout(painelDireitoLayout);
        painelDireitoLayout.setHorizontalGroup(
            painelDireitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollDireito, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        );
        painelDireitoLayout.setVerticalGroup(
            painelDireitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollDireito, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollEsquerdo, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelDireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollEsquerdo, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(painelDireito, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 691, 384);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Fonte fonte = this.getDados();
        FonteService.salva(fonte);
        this.apagaDadosFrm();
        this.iniciaTabelaFontes();
        //Ids.idFonte = 0;
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        FonteService.removeById(Ids.idFonte);
        this.iniciaTabelaFontes();
        this.apagaDadosFrm();
        Ids.idFonte = 0;
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        Fonte fonte = FonteService.getById(Ids.idFonte).clonarSemID();
        FonteService.salva(fonte);
        for (Quadro quadro : fonte.getQuadros()) {
            Quadro q = quadro.clonarSemID();
            QuadroService.salva(q);
            for (Circuito circuito : q.getCircuitos()) {
                Circuito c = circuito.clonarSemID();
                CircuitoService.salva(c);
                for (Equipamento equipamento : c.getEquipamentos()) {
                    Equipamento e = equipamento.clonarSemID();
                    EquipamentoService.salva(e);
                }
            }
        }
        this.iniciaTabelaFontes();
        this.apagaDadosFrm();
        Ids.idFonte = 0;
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void tabelaFonteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFonteMouseClicked
        if (evt.getClickCount() == 1) {

        }
        if (evt.getClickCount() == 2) {
            if (Ids.idFonte > 0) {
                this.setVisible(false);
                QuadroFrm frm = new QuadroFrm();
                DesktopPane.desktop.add(frm);
                frm.setVisible(true);
                
            }
        }
    }//GEN-LAST:event_tabelaFonteMouseClicked

    private void cbConcessionariaItens() {
        List<Concessionaria> lista;
        lista = ConcessionariaService.getAll();
        cbConcessionaria.removeAllItems();
        for (Concessionaria con : lista) {
            cbConcessionaria.addItem(con);
        }
    }

    private void eventoSelecaoTabela() {
        tabelaFonte.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent evt) {
                int linha = tabelaFonte.getSelectedRow();
                if (evt.getValueIsAdjusting() == true && linha > -1) {
                    Fonte fonte = (Fonte) tabelaModelo.loadItem(linha);
                    setDados(fonte);
                    Ids.idFonte = fonte.getId();
                }
            }
        }
        );
    }

    private void eventoDigitar() {
        this.campoTensao.addKeyListener(
                new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                ApenasNumero.campo(e, "campoTensao");
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    public void iniciaTabelaFontes() {
        //Verificar porque não posso usar List<Fonte> lista = ProjetoService.getById(Ids.idProjeto).getFontes(); 
        //A tabelaFonte não atualiza a última inclusão como de a Entidade anterior não atualizasse.
        List<Fonte> todos = FonteService.getAll();
        List<Fonte> lista = new ArrayList<>();
        for (Fonte f : todos) {
            if (Objects.equals(f.getProjeto().getId(), Ids.idProjeto)) {
                lista.add(f);
            }
        }

        if (!lista.isEmpty()) {
            tabelaModelo = new GenericTableModel(lista, Fonte.class);
            tabelaFonte.setModel(tabelaModelo);
        } else {
            DefaultTableModel model = new DefaultTableModel();
            this.tabelaFonte.setModel(model);
        }
    }

    private Fonte getDados() {
        Fonte fonte;
        if (Ids.idFonte > 0) {
            fonte = FonteService.getById(Ids.idFonte);
        } else {
            fonte = new Fonte();
            fonte.setProjeto(ProjetoService.getById(Ids.idProjeto));
        }
        fonte.setId(TrataID.IntegerToInteger(Ids.idFonte));
        fonte.setConcessionaria((Concessionaria) this.cbConcessionaria.getModel().getSelectedItem());
        fonte.setNome(this.campoNome.getText());
        fonte.setDescricao(this.textoDescricao.getText());
        fonte.setTensaoFN(Numero.stringToDouble(this.campoTensao.getText(), 0));
        fonte.setConcessionaria((Concessionaria) cbConcessionaria.getModel().getSelectedItem());
        return fonte;
    }

    public void apagaDadosFrm() {
        this.campoTensao.setText("");
        this.cbConcessionaria.setSelectedIndex(-1);
        this.campoNome.setText("");
        this.textoDescricao.setText("");
        this.lblIdFonte.setText("0");
    }

    public void setDados(Fonte fonte) {
        if (fonte != null) {
            this.lblIdFonte.setText(Integer.toString(fonte.getId()));
            this.campoTensao.setText(Numero.decimal(fonte.getTensaoFN(), "##.##"));
            this.cbConcessionaria.getModel().setSelectedItem(fonte.getConcessionaria());
            this.campoNome.setText(fonte.getNome());
            this.textoDescricao.setText(fonte.getDescricao());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoTensao;
    private javax.swing.JComboBox<Concessionaria> cbConcessionaria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIdFonte;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelDireito;
    private javax.swing.JPanel painelEsquerdo;
    private javax.swing.JScrollPane scrollDireito;
    private javax.swing.JScrollPane scrollEsquerdo;
    private javax.swing.JTable tabelaFonte;
    private javax.swing.JTextArea textoDescricao;
    // End of variables declaration//GEN-END:variables
}