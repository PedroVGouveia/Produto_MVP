/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presenter;

import DAO.ProdutoCollection;
import View.produtoView;
import View.telaPrincipal;

/**
 *
 * @author Pedro Vitor
 */
public class telaPrincipalPresenter {
    private telaPrincipal view;
    
    
    public telaPrincipalPresenter(ProdutoCollection produtoCollection) {
 
        this.view = new telaPrincipal(produtoCollection);
        view.setVisible(true);
    }

    
}
