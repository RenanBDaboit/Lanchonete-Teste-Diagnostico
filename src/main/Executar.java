package main;

import model.*;
import service.*;
import view.*;

public class Executar{

    public static void main(String[] args) {
        
        InterfaceAdm uiAdm = new InterfaceAdm();
        InterfaceEntrada uiEntrada = new InterfaceEntrada();
        InterfaceErro uiErro = new InterfaceErro();
        InterfaceLanchonete uiLanchonete = new InterfaceLanchonete();
        VerificacaoUsuario verificacaoUsuario = new VerificacaoUsuario();
        CadastrarUsuario cadastrarUsuario = new CadastrarUsuario();
        CadastrarProduto cadastrarProduto = new CadastrarProduto();
        Produto produto = new Produto();
        ProdutosPadrao produtosPadrao = new ProdutosPadrao();
        Usuario usuario = new Usuario();
        UsuarioAdm usuarioAdm = new UsuarioAdm();

        int opcaoInicial;
        int opcaoAdm;
        int respostaFinal;

        usuarioAdm.usuarioOriginal(usuario.getListaUsuarios());
        produtosPadrao.adicionarProdutos(produto.getListaProdutos());

        do { 
            opcaoInicial = uiEntrada.menuInicial();

            switch (opcaoInicial) {
            
                case 1:
                    int nivelUser = verificacaoUsuario.verificacao(usuario.getListaUsuarios());
                    if (nivelUser == 1) {
                        do {
                            opcaoAdm = uiAdm.menuAdm();
                            switch (opcaoAdm) {
                                case 1:
                                    cadastrarUsuario.cadastro(usuario.getListaUsuarios());
                                    break;
                            
                                case 2: 
                                    Produto produtoNovo = cadastrarProduto.cadastroProduto();
                                    produto.getListaProdutos().add(produtoNovo);
                                    break;

                                case 3:                             
                                    break;

                                default:
                                    uiErro.opcaoInvalida();
                                    break;
                            }
                        } while (opcaoAdm != 3);
                    }
                    else if(nivelUser == 2){

                        do {
                            int resposta;
                            Carrinho carrinho = new Carrinho();
                            Venda venda = new Venda();
                        
                            double valorTotal = 0;

                            do {
                                Produto produtoEscolhido = uiLanchonete.menu(produto.getListaProdutos());
                                int quantidadeProdutoEscolhido;
                                
                                do{
                                    quantidadeProdutoEscolhido = uiLanchonete.receberQuantidade();
                                    if (quantidadeProdutoEscolhido > produtoEscolhido.getQuantidade()) {
                                        uiErro.quantidadeNegada();
                                    }
                                }while(quantidadeProdutoEscolhido > produtoEscolhido.getQuantidade());

                                carrinho.adicionarProduto(produtoEscolhido, quantidadeProdutoEscolhido);

                                valorTotal += venda.calculoValorTotal(produtoEscolhido, quantidadeProdutoEscolhido);
                                resposta = uiLanchonete.confirmacaoMenu();
                            } while (resposta == 1);
                            
                            uiLanchonete.pagamento(valorTotal);
                        
                            respostaFinal = uiLanchonete.confirmacaoFinal();
                        } while (respostaFinal == 1);
                    }
                    break;

                case 2:
                    break;

                default:
                    uiErro.opcaoInvalida();
            }
        } while (opcaoInicial != 2);
    }
}