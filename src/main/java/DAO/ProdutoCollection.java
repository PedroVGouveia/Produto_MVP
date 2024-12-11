/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Produto;
import java.awt.List;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Pedro Vitor
 */
public class ProdutoCollection {

    private ArrayList<Produto> produtos;

    public ProdutoCollection() {
        produtos = new ArrayList<>();
    }

    public void incluir(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Informe um produto válido");
        }
        produtos.add(produto);
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public Optional<Produto> findProdutoByNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return Optional.of(produto);
            }
        }
        return Optional.empty();
    }

}
