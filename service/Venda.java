package service;

import java.util.ArrayList;
import model.ProdutoCarrinho;

public class Venda {
    public double calculoValorTotal(ArrayList<ProdutoCarrinho> listaProduto){
       
        double valorTotal = 0;
       
        for (ProdutoCarrinho produto : listaProduto) {
            valorTotal += produto.getValor() * produto.getQuantidade();
        }

        return valorTotal;
    }
}