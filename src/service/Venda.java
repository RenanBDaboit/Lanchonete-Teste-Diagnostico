package service;

import model.Produto;

public class Venda {
    public double calculoValorTotal(Produto produto, int quantidade){
       
        double valorTotal;
       
        valorTotal = produto.getValor() * quantidade;

        return valorTotal;
    }
}