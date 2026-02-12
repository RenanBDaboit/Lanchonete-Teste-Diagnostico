package model;

import java.util.ArrayList;

public class Produto{

    private String nome;
    private double valor;
    private int quantidade;

    ArrayList<Produto> listaProdutos;

    public Produto() {
        this.nome = "";
        this.valor = 0;
        this.quantidade = 0;

        listaProdutos = new ArrayList<>();
    }

    public Produto(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double novoValor){
        this.valor = novoValor;
    }
    
    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int novoQuantidade){
        this.quantidade = novoQuantidade;
    }

    @Override
    public String toString() {
        return this.nome + " --- R$" + valor + "\n";
    }    

    public ArrayList<Produto> getListaProdutos(){
        return listaProdutos;
    }
}