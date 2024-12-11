/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presenter;

import DAO.ProdutoCollection;
import Model.Produto;
import View.produtoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Vitor
 */
public class InclusaoProdutoPresenter {

    private Produto produto;
    private produtoView view;
    private ProdutoCollection produtos;

    public InclusaoProdutoPresenter(ProdutoCollection produtos) {
        this.produtos = produtos;
        this.view = new produtoView();
        this.view.setVisible(false);

        configuraView();
        view.setVisible(true);
    }

    private void configuraView() {
        this.view.getBtnInserir().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    salvar();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        this.view.getBtnCancelar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancelar();
            }
        });
    }

    private void salvar() throws Exception {
        String nome = view.getTxtNomeProduto().getText();
        if (nome == null || nome.isEmpty()) {
            throw new Exception("Nome do produto é obrigatório");
        }
        double precoCusto = Double.parseDouble(view.getTxtPrecoCusto().getText());
        if (precoCusto <= 0) {
            throw new Exception("Preço de custo deve ser maior que zero");
        }
        double percentualLucro = Double.parseDouble(view.getTxtPercentualLucro().getText());
        if (percentualLucro <= 0) {
            throw new Exception("Percentual de lucro deve ser maior que zero");
        }

        produto = new Produto(nome, precoCusto, percentualLucro);

        produtos.incluir(produto);

        JOptionPane.showMessageDialog(view, "Produto incluído com sucesso!");
    }

    private void cancelar() {
        view.dispose();
    }

}
