package view;

import java.util.Scanner;

public class InterfaceProduto {
    
    Scanner scanner = new Scanner(System.in);

    InterfaceLogin uiLogin = new InterfaceLogin();

    public String nomeProduto(){
        System.out.println("Nome do produto: ");
        String nome = scanner.nextLine();

        return nome;
    }
    
    public double valorProduto(){
        System.out.println("Valor do produto: ");
        Double valor = scanner.nextDouble();
        uiLogin.limpar();
        return valor;
    }
    
    public int quantidadeProduto(){
        System.out.println("Nome do produto: ");
        int quantidade = scanner.nextInt();
        uiLogin.limpar();
        return quantidade;
    }
}
