package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceAdm {
    
    InterfaceErro uiErro = new InterfaceErro();
    InterfaceLogin uiLogin = new InterfaceLogin();

    Scanner scanner = new Scanner(System.in);

    public int menuAdm(){
       
        System.out.println("\t\tBem-vindo\n1. Cadastrar usuário\n2. Cadastrar produto\n3. Sair");
            
        while (true) {
           
            try {
                int opcao = scanner.nextInt();  
                return opcao;
            } catch (InputMismatchException erro) {
                uiErro.entradaInvalida();    
                uiLogin.limpar();    
            }                
        } 
    }
}
