package service;

import java.util.ArrayList;
import model.Produto;

public class Carrinho {
    private ArrayList<Produto> listaProdutos;

    public Carrinho() {
        this.listaProdutos = new ArrayList<>();
    }

    public ArrayList<Produto> getListaProdutos(){
        return listaProdutos;
    }

    public void adicionarProduto(Produto produto, int quantidade){
        produto.setQuantidade(produto.getQuantidade() - quantidade);
        listaProdutos.add(produto);
    }
}