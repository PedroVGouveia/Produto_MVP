/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Pedro Vitor
 */
public class Produto {
    private String nome;
    private double precoCusto;
    private double percentualLucro;
    private double precoVenda;



    public Produto(String nome, double precoCusto, double percentualLucro) throws Exception {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.percentualLucro = percentualLucro;
        this.precoVenda = Produto.calcularPrecoVenda(precoCusto, percentualLucro);
    }
    
    public static double calcularPrecoVenda(double precoCusto,double percentualLucro ) throws Exception {
        double precoVenda = precoCusto + (precoCusto * percentualLucro / 100);
        if (precoVenda <= 0) {
            throw new Exception("Preço de venda deve ser maior que zero");
        }
        return precoVenda;
    }

    public String getNome() {
        return nome;
    }
    public double getPrecoCusto() {
        return precoCusto;
    }
    public double getPercentualLucro() {
        return percentualLucro;
    }
        public double getPrecoVenda() {
        return precoVenda;
    }


    
}
