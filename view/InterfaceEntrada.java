package view;

import java.util.Scanner;

public class InterfaceEntrada {
    
    Scanner scanner = new Scanner(System.in);

    public int menuInicial(){
        System.out.println("\t\tMenu Inicial\n1. Entrar\n2. Sair");
        int opcao = scanner.nextInt();
        return opcao;
    }

    public void opcaoInvalida(){
        System.out.println("Opção inválida, tente novamente\n\n");
    }
}
