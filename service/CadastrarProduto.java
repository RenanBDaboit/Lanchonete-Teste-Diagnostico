package service;

import model.Produto;
import view.InterfaceProduto;

public class CadastrarProduto {

    InterfaceProduto uiProduto = new InterfaceProduto();

    public Produto cadastroProduto(){

        String nomeProduto = uiProduto.nomeProduto();
        double valorProduto = uiProduto.valorProduto();
        int quantidadeProduto = uiProduto.quantidadeProduto();

        Produto produto = new Produto(nomeProduto, valorProduto, quantidadeProduto);
    
        return produto;
    }
}
