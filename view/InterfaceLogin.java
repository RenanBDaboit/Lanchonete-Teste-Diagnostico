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

    public int verificacaoAdm(){
        System.out.println("Nível de acesso:\n1.Administrador\n2. Normal");
        int opcao = scanner.nextInt();
        limpar();
        return opcao;
    }

    public void limpar(){
        scanner.nextLine();
    }

    public void acessoNegado(){
        System.out.println("Acesso negado, login e/ou senha incorretos");
    }
}
