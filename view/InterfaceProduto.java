package view;

import java.util.Scanner;

public class InterfaceProduto {
    
    Scanner scanner = new Scanner(System.in);

    public String nomeProduto(){
        System.out.println("Nome do produto: ");
        String nome = scanner.nextLine();

        return nome;
    }
    
    public double valorProduto(){
        System.out.println("Valor do produto: ");
        Double valor = scanner.nextDouble();
        return valor;
    }
    
    public int quantidadeProduto(){
        System.out.println("Quantidade do produto: ");
        int quantidade = scanner.nextInt();
        return quantidade;
    }
}
