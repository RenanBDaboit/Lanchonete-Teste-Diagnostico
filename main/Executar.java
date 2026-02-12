package main;

import model.*;
import service.*;
import view.*;

public class Executar{

    public static void main(String[] args) {
        
        InterfaceEntrada uiEntrada = new InterfaceEntrada();
        InterfaceLanchonete uiLanchonete = new InterfaceLanchonete();
        VerificacaoUsuario verificacaoUsuario = new VerificacaoUsuario();
        CadastrarUsuario cadastrarUsuario = new CadastrarUsuario();
        Produto produto = new Produto();
        ProdutosPadrao produtosPadrao = new ProdutosPadrao();

        int opcaoInicial;
        int respostaFinal;

        produtosPadrao.adicionarProdutos(produto.getListaProdutos());

        do { 
            opcaoInicial = uiEntrada.menuInicial();

            switch (opcaoInicial) {
                case 1:

                    if(verificacaoUsuario.verificacao(cadastrarUsuario.getListaUsuarios())){

                        do {
                            int resposta;
                            Carrinho carrinho = new Carrinho();
                            Venda venda = new Venda();
                        
                            do {
                                ProdutoCarrinho produtoEscolhido = uiLanchonete.menu(produto.getListaProdutos());
                                carrinho.adicionarProduto(produtoEscolhido);
                                resposta = uiLanchonete.confirmacaoMenu();
                            } while (resposta == 1);
                        
                            double valorTotal = venda.calculoValorTotal(carrinho.getListaProdutos());
                        
                            uiLanchonete.pagamento(valorTotal);
                        
                            respostaFinal = uiLanchonete.confirmacaoFinal();
                        } while (respostaFinal == 1);
                    }
                    break;

                case 2:
                    cadastrarUsuario.cadastro();
                    break;

                case 3:
                    break;

                default:
                    uiEntrada.opcaoInvalida();
            }

        } while (opcaoInicial != 3);
    }
}