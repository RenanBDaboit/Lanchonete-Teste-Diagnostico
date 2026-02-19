package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceEntrada {
    
    Scanner scanner = new Scanner(System.in);

    InterfaceLogin uiLogin = new InterfaceLogin();
    InterfaceErro uiErro = new InterfaceErro();

    public int menuInicial(){
        System.out.println("\t\tMenu Inicial\n1. Entrar\n2. Sair");
        
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
