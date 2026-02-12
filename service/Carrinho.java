package service;

import java.util.ArrayList;
import model.ProdutoCarrinho;

public class Carrinho {
    private ArrayList<ProdutoCarrinho> listaProdutos;

    public Carrinho() {
        this.listaProdutos = new ArrayList<>();
    }

    public ArrayList<ProdutoCarrinho> getListaProdutos(){
        return listaProdutos;
    }

    public void adicionarProduto(ProdutoCarrinho produto){
        listaProdutos.add(produto);
    }
}