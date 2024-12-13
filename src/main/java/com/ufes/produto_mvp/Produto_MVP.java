/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufes.produto_mvp;

import DAO.ProdutoCollection;
import Presenter.InclusaoProdutoPresenter;
import Presenter.telaPrincipalPresenter;

/**
 *
 * @author Pedro Vitor
 */
public class Produto_MVP {

    public static void main(String[] args) {
        ProdutoCollection produtos = new ProdutoCollection();
        new telaPrincipalPresenter(produtos);
    }
}
