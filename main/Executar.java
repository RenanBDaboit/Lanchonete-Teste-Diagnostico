package main;

import model.*;
import service.*;
import view.*;

public class Executar{

    public static void main(String[] args) {
        
        InterfaceAdm uiAdm = new InterfaceAdm();
        InterfaceEntrada uiEntrada = new InterfaceEntrada();
        InterfaceLanchonete uiLanchonete = new InterfaceLanchonete();
        VerificacaoUsuario verificacaoUsuario = new VerificacaoUsuario();
        CadastrarUsuario cadastrarUsuario = new CadastrarUsuario();
        CadastrarProduto cadastrarProduto = new CadastrarProduto();
        Produto produto = new Produto();
        ProdutosPadrao produtosPadrao = new ProdutosPadrao();
        UsuarioAdm usuarioAdm = new UsuarioAdm();

        int opcaoInicial;
        int opcaoAdm;
        int respostaFinal;

        usuarioAdm.usuarioOriginal(cadastrarUsuario.getListaUsuarios());
        produtosPadrao.adicionarProdutos(produto.getListaProdutos());

        do { 
            opcaoInicial = uiEntrada.menuInicial();

            switch (opcaoInicial) {
            
                case 1:
                    int nivelUser = verificacaoUsuario.verificacao(cadastrarUsuario.getListaUsuarios());
                    if (nivelUser == 1) {
                        do {
                            opcaoAdm = uiAdm.menuAdm();
                            switch (opcaoAdm) {
                                case 1:
                                    cadastrarUsuario.cadastro(cadastrarUsuario.getListaUsuarios());
                                    break;
                            
                                case 2: 
                                    Produto produtoNovo = cadastrarProduto.cadastroProduto();
                                    produto.getListaProdutos().add(produtoNovo);
                                    break;

                                case 3:                             
                                    break;

                                default:
                                    uiEntrada.opcaoInvalida();
                                    break;
                            }

                        } while (opcaoAdm != 3);
                    }
                    else if(nivelUser == 2){

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
                    break;

                default:
                    uiEntrada.opcaoInvalida();
            }

        } while (opcaoInicial != 2);
    }
}