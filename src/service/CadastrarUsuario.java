package service;

import java.util.ArrayList;
import model.Usuario;
import model.UsuarioAdm;
import view.InterfaceErro;
import view.InterfaceLogin;


public class CadastrarUsuario {

    InterfaceLogin uiLogin = new InterfaceLogin();
    InterfaceErro uiErro = new InterfaceErro();

    public void cadastro(ArrayList<Usuario> listaUsuarios){


        VerificacaoUsuario verificacaoUsuario = new VerificacaoUsuario();

        String nomeNovo = uiLogin.entradaNome();
        String loginNovo = uiLogin.entradaLogin();
        String senhaNova = uiLogin.entrdaSenha();
        int verificacaoAdm = uiLogin.verificacaoAdm();

        if(verificacaoAdm == 1){

            if (verificacaoUsuario.verificacaoAdm(listaUsuarios)) {
                
            UsuarioAdm usuario = new UsuarioAdm(nomeNovo, loginNovo, senhaNova);
            listaUsuarios.add(usuario);
            }
            else{
                uiErro.acessoNegado();
            }

        }
        else{
            Usuario usuario = new Usuario(nomeNovo, loginNovo, senhaNova);
            listaUsuarios.add(usuario);
        }

    }
}
