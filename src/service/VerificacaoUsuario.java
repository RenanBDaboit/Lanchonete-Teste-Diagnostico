package service;

import java.util.ArrayList;
import model.Usuario;
import model.UsuarioAdm;
import view.InterfaceErro;
import view.InterfaceLogin;

public class VerificacaoUsuario {

    InterfaceLogin uiLogin = new InterfaceLogin();
    InterfaceErro uiErro = new InterfaceErro();

    public int verificacao(ArrayList<Usuario> listaUsuarios){
        
        String loginDigitado = uiLogin.entradaLogin();
        String senhaDigitada = uiLogin.entrdaSenha();

        boolean verificado = false;
        boolean adm = false;

        for (Usuario usuario : listaUsuarios) {
            if ((loginDigitado.equals(usuario.getLogin())) && (senhaDigitada.equals(usuario.getSenha()))) {
                verificado = true;
                if (usuario instanceof UsuarioAdm) {
                    adm = true;
                }
            }
        }

        if (verificado == false) {
            uiErro.acessoNegado();
            return 0;
        }
        else if (verificado && adm) {
            return 1;
        }
        else{
            return 2;
        }
    }

    public boolean verificacaoAdm(ArrayList<Usuario> listaUsuarios){
        
        String loginDigitado = uiLogin.entradaLogin();
        String senhaDigitada = uiLogin.entrdaSenha();

        boolean verificado = false;

        for (Usuario usuario : listaUsuarios) {
            if(usuario instanceof UsuarioAdm){
                if ((loginDigitado.equals(usuario.getLogin())) && (senhaDigitada.equals(usuario.getSenha()))) {
                    verificado = true;
                }
            }
        }

        if (verificado == false) {
            uiErro.acessoNegado();
        }

        return verificado;
    }
}
