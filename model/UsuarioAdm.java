package model;

import java.util.ArrayList;

public class UsuarioAdm extends Usuario{

    public UsuarioAdm(String nome, String login, String senha) {
        super(nome, login, senha);
    }

    public UsuarioAdm(){
    }


    public void usuarioOriginal(ArrayList<Usuario> listaUsuarios){

        listaUsuarios.add(new UsuarioAdm("Renan", "renan", "1234"));
    }
}
