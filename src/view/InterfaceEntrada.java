package view;

import java.util.Scanner;

public class InterfaceEntrada {
    
    Scanner scanner = new Scanner(System.in);

    InterfaceLogin uiLogin = new InterfaceLogin();

    public int menuInicial(){
        System.out.println("\t\tMenu Inicial\n1. Entrar\n2. Sair");
        int opcao = scanner.nextInt();
        return opcao;
    }

}
