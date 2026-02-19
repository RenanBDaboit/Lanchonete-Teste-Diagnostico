package view;

public class InterfaceErro {
    
    
    public void acessoNegado(){
        System.out.println("Acesso negado, login e/ou senha incorretos");
    }

    public void opcaoInvalida(){
        System.out.println("Opção inválida, tente novamente\n\n");
    }

    public void quantidadeNegada(){
        System.out.println("Quantidade escolhida maior que estoque do produto");
    }

    public void entradaInvalida(){
        System.out.println("Entrada do usuário inválida, tente novamente");
    }
}
