package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceLogin {
    
    Scanner scanner = new Scanner(System.in);

    InterfaceErro uiErro = new InterfaceErro();

    public String entradaNome(){
        System.out.println("Nome: ");
                        
        while (true) {
           
            try {
                String nomeDigitado = scanner.nextLine();  
                return nomeDigitado;
            } catch (InputMismatchException erro) {
                uiErro.entradaInvalida();    
                limpar();    
            }                
        } 
    }
    
    public String entradaLogin(){
        System.out.println("Login: ");
                        
        while (true) {
           
            try {
                String loginDigitado = scanner.nextLine();  
                return loginDigitado;
            } catch (InputMismatchException erro) {
                uiErro.entradaInvalida();    
                limpar();    
            }                
        } 
    }

    public String entrdaSenha(){
        System.out.println("Senha: ");
                    
        while (true) {
           
            try {
                String senhaDigitada = scanner.nextLine();  
                return senhaDigitada;
            } catch (InputMismatchException erro) {
                uiErro.entradaInvalida();    
                limpar();    
            }                
        } 
    }

    public int verificacaoAdm(){
        System.out.println("Nível de acesso:\n1.Administrador\n2. Normal");
                  
        while (true) {
           
            try {
                int opcao = scanner.nextInt();  
                return opcao;
            } catch (InputMismatchException erro) {
                uiErro.entradaInvalida();    
                limpar();    
            }                
        } 
    }

    public void limpar(){
        scanner.nextLine();
    }
}
