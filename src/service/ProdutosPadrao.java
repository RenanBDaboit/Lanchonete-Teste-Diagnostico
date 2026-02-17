package service;

import java.util.ArrayList;

import model.Produto;

public class ProdutosPadrao {
    
    public void adicionarProdutos(ArrayList<Produto> listaProdutos){

        listaProdutos.add(new Produto("Coxinha", 5.99, 54));
        listaProdutos.add(new Produto("Pastel", 5.99, 34));
        listaProdutos.add(new Produto("Hot dog", 6.99, 66));
        listaProdutos.add(new Produto("Empada", 5.99, 53));
        listaProdutos.add(new Produto("Risóles", 5.99, 35));
        listaProdutos.add(new Produto("Bolo", 8.99, 23));
        listaProdutos.add(new Produto("Sorvete", 4.99, 87));
        listaProdutos.add(new Produto("Refri", 3.99, 97));
        listaProdutos.add(new Produto("Café", 5.99, 42));
    }
}
