package service;

import java.util.ArrayList;
import model.Usuario;
import view.InterfaceLogin;



public class CadastrarUsuario {

    ArrayList<Usuario> listaUsuarios;

    public CadastrarUsuario() {
        listaUsuarios = new ArrayList<>();
    }

    InterfaceLogin uiLogin = new InterfaceLogin();

    public void cadastro(){

        String nomeNovo = uiLogin.entradaNome();
        String loginNovo = uiLogin.entradaLogin();
        String senhaNova = uiLogin.entrdaSenha();

        Usuario usuario = new Usuario(nomeNovo, loginNovo, senhaNova);
        listaUsuarios.add(usuario);
    }

    public ArrayList<Usuario> getListaUsuarios(){
        return listaUsuarios;
    }

}
