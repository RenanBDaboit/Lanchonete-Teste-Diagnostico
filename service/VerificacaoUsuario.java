package service;

import java.util.ArrayList;
import model.Usuario;
import view.InterfaceLogin;

public class VerificacaoUsuario {

    InterfaceLogin uiLogin = new InterfaceLogin();

    public boolean verificacao(ArrayList<Usuario> listaUsuarios){
        
        String loginDigitado = uiLogin.entradaLogin();
        String senhaDigitada = uiLogin.entrdaSenha();

        boolean verificado = false;

        for (Usuario usuario : listaUsuarios) {
            if ((loginDigitado.equals(usuario.getLogin())) && (senhaDigitada.equals(usuario.getSenha()))) {
                verificado = true;
            }
        }

        if (verificado == false) {
            uiLogin.acessoNegado();
        }

        return verificado;
    }
}
