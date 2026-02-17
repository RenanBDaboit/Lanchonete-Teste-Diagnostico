package service;

import java.util.ArrayList;
import model.Produto;

public class Venda {
    public double calculoValorTotal(ArrayList<Produto> listaProduto){
       
        double valorTotal = 0;
       
        for (Produto produto : listaProduto) {
            valorTotal += produto.getValor() * produto.getQuantidade();
        }

        return valorTotal;
    }
}