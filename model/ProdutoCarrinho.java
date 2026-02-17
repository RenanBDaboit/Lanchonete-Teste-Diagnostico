package model;

public class ProdutoCarrinho extends Produto{

    public ProdutoCarrinho(String nome, double valor, int quantidade) {
        super(nome, valor, quantidade);
    }

    @Override
    public String toString() {
        return getNome() + " --- R$" + getValor() + "\n";
    }    
}