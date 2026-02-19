package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceProduto {
    
    Scanner scanner = new Scanner(System.in);

    InterfaceErro uiErro = new InterfaceErro();
    InterfaceLogin uiLogin = new InterfaceLogin();

    public String nomeProduto(){
        System.out.println("Nome do produto: ");
                   
        while (true) {
           
            try {
                String senhaDigitada = scanner.nextLine();  
                return senhaDigitada;
            } catch (InputMismatchException erro) {
                uiErro.entradaInvalida();    
                uiLogin.limpar();    
            }                
        } 
    }
    
    public double valorProduto(){
        System.out.println("Valor do produto: ");
                 
        while (true) {
           
            try {
                double valor = scanner.nextDouble();  
                return valor;
            } catch (InputMismatchException erro) {
                uiErro.entradaInvalida();    
                uiLogin.limpar();    
            }                
        } 
    }
    
    public int quantidadeProduto(){
        System.out.println("Quantidade do produto: ");
                  
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
}
