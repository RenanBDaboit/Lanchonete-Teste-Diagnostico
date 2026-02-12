package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.Produto;
import model.ProdutoCarrinho;

public class InterfaceLanchonete {
    
    Scanner scanner = new Scanner(System.in);

    public ProdutoCarrinho menu(ArrayList<Produto> listaProdutos){

        System.out.println("\t\tBem-vindo");

        for (Produto produto: listaProdutos) {
            System.out.print(produto);
        }
        int opcao = scanner.nextInt();
        limpar();
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        limpar();
        Produto produtoEscolhido = listaProdutos.get(opcao);
        return new ProdutoCarrinho(produtoEscolhido.getNome(), produtoEscolhido.getValor(), quantidade);
    }

    public int confirmacaoMenu(){
        System.out.println("Deseja adicionar mais um produto? (1 -> Sim / 2 -> Não)");
        int resposta = scanner.nextInt();
        return resposta;
    }

    public void pagamento(double valorTotal){
        System.out.println("Valor total a pagar: R$" + valorTotal);

        System.out.println("\t\tForma de pagamento"
                         + "\n1. Crédito"
                         + "\n2. Débito"
                         + "\n3. Pix"
        );
        int formaPagamento = scanner.nextInt();

        switch (formaPagamento) {
            case 1:
                System.out.println("Insire ou aproxime o cartão na maquininha");
                break;
        
            case 2: 
                System.out.println("Insire ou aproxime o cartão na maquininha");
                break;

            case 3:
                System.out.println("Leia o QR Code na maquininha");
                break;
        }
    }

    public void limpar(){
        scanner.hasNextLine();
    }

    public int confirmacaoFinal(){
        System.out.println("Deseja fazer outro pedido?(1 -> Sim / 2 -> Não)");
        int resposta = scanner.nextInt();
        return resposta;
    }
}