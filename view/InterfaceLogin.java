package view;

import java.util.Scanner;

public class InterfaceLogin {
    
    Scanner scanner = new Scanner(System.in);


    public String entradaNome(){
        System.out.println("Nome: ");
        String senhaDigitada = scanner.nextLine();
        
        return senhaDigitada;
    }
    
    public String entradaLogin(){
        System.out.println("Login: ");
        String loginDigitado = scanner.nextLine();

        return loginDigitado;
    }

    public String entrdaSenha(){
        System.out.println("Senha: ");
        String senhaDigitada = scanner.nextLine();

        return senhaDigitada;
    }

    public void limpar(){
        scanner.nextLine();
    }

    public void acessoNegado(){
        System.out.println("Acesso negado, login e/ou senha incorretos");
    }
}
