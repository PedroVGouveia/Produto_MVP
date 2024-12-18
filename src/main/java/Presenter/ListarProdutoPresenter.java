/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presenter;

import DAO.ProdutoCollection;
import Model.Produto;
import View.ListarProdutoView;
import View.produtoView;

/**
 *
 * @author Pedro Vitor
 */
public class ListarProdutoPresenter {
    private Produto produto;
    private ListarProdutoView view;
    private ProdutoCollection produtos;
    
    public ListarProdutoPresenter(ProdutoCollection produtos) {
        this.produtos = produtos;
        this.view = new ListarProdutoView(produtos);
        this.view.setVisible(false);
        view.setVisible(true);
    }
    
    
    
}
