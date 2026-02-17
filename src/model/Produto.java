package model;

import java.util.ArrayList;

public class Produto{

    private String nome;
    private double valor;
    private int quantidade;
    
    private int id;
    private static int contadorId = 0;

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

        this.id = ++contadorId;
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
        return id + ". " + this.nome + " --- R$" + valor + " | Estoque: " + quantidade + "\n";
    }    

    public ArrayList<Produto> getListaProdutos(){
        return listaProdutos;
    }
}