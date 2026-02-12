package service;

import java.util.ArrayList;
import model.Usuario;
import model.UsuarioAdm;
import view.InterfaceLogin;



public class CadastrarUsuario {

    ArrayList<Usuario> listaUsuarios;

    public CadastrarUsuario() {
        listaUsuarios = new ArrayList<>();
    }

    InterfaceLogin uiLogin = new InterfaceLogin();

    public void cadastro(){


        VerificacaoUsuario verificacaoUsuario = new VerificacaoUsuario();

        String nomeNovo = uiLogin.entradaNome();
        String loginNovo = uiLogin.entradaLogin();
        String senhaNova = uiLogin.entrdaSenha();
        int verificacaoAdm = uiLogin.verificacaoAdm();

        if(verificacaoAdm == 1){

            if (verificacaoUsuario.verificacaoAdm(listaUsuarios)) {
                
            Usuario usuario = new UsuarioAdm(nomeNovo, loginNovo, senhaNova);
            listaUsuarios.add(usuario);
            }
            else{
                uiLogin.acessoNegado();
            }

        }
        else{
            Usuario usuario = new Usuario(nomeNovo, loginNovo, senhaNova);
            listaUsuarios.add(usuario);
        }

    }

    public ArrayList<Usuario> getListaUsuarios(){
        return listaUsuarios;
    }

}
