/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Produto;
import Model.ProdutoObserver;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Pedro Vitor
 */
public class ProdutoCollection {

    private ArrayList<Produto> produtos;
    private ArrayList<ProdutoObserver> observers;

    public ProdutoCollection() {
        produtos = new ArrayList<>();
        observers = new ArrayList<>();
    }
    public void addObserver(ProdutoObserver observer) {
        observers.add(observer);
    }
    private void notifyObservers() {
        for (ProdutoObserver observer : observers) {
            observer.update();
        }
    }
    public void removeObserver(ProdutoObserver observer) {
        observers.remove(observer);
    }


    public void incluir(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Informe um produto válido");
        }
        produtos.add(produto);
        notifyObservers();
    }
    public void remover(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Informe um produto válido");
        }
        produtos.remove(produto);
        notifyObservers();
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
