package view;

import java.util.Scanner;

public class InterfaceAdm {
    
    Scanner scanner = new Scanner(System.in);

    public int menuAdm(){
        System.out.println("\t\tBem-vindo\n1. Cadastrar usuário\n2. Cadastrar produto\n3. Sair");
        int opcao = scanner.nextInt();
        return opcao;
    }

}
