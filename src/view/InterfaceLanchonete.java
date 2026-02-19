package view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.Produto;

public class InterfaceLanchonete {
    
    Scanner scanner = new Scanner(System.in);

    InterfaceErro uiErro = new InterfaceErro();
    InterfaceLogin uiLogin = new InterfaceLogin();

    public Produto menu(ArrayList<Produto> listaProdutos){

        System.out.println("\t\tBem-vindo");

        for (Produto produto: listaProdutos) {
            System.out.print(produto);
        }
        while (true) {
           
            try {
                int opcao = scanner.nextInt();  
                return listaProdutos.get(opcao);
            } catch (InputMismatchException erro) {
                uiErro.entradaInvalida();    
                uiLogin.limpar();    
            }                
        }
    }

    public int receberQuantidade(){
        System.out.print("Quantidade: ");

        while (true) {
           
            try {
                int quantidade = scanner.nextInt();  
                return quantidade;
            } catch (InputMismatchException erro) {
                uiErro.entradaInvalida();    
                uiLogin.limpar();    
            }                
        }
    }

    public int confirmacaoMenu(){
        System.out.println("Deseja adicionar mais um produto? (1 -> Sim / 2 -> Não)");
       
        while (true) {
           
            try {
                int resposta = scanner.nextInt();  
                return resposta;
            } catch (InputMismatchException erro) {
                uiErro.entradaInvalida();    
                uiLogin.limpar();    
            }                
        }
    }

    public void pagamento(double valorTotal){
        System.out.printf("Valor total a pagar: R$%.2f\n", valorTotal);

        System.out.println("\t\tForma de pagamento"
                         + "\n1. Crédito"
                         + "\n2. Débito"
                         + "\n3. Pix"
        );

        int formaPagamento = 0;

        int verificacao = 0;

        while (verificacao == 0) {   
            try {
                formaPagamento = scanner.nextInt();  
                verificacao = 1;
            } catch (InputMismatchException erro) {
                uiErro.entradaInvalida();    
                uiLogin.limpar();    
            }                
        }

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
        
        while (true) {
           
            try {
                int resposta = scanner.nextInt();  
                return resposta;
            } catch (InputMismatchException erro) {
                uiErro.entradaInvalida();    
                uiLogin.limpar();    
            }                
        }
    }
}