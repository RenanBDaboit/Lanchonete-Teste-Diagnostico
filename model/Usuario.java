package model;

public class Usuario {
    
    private String nome;
    private String login;
    private String senha;

    public Usuario() {
        this.nome = "";
        this.login = "";
        this.senha = "";
    }

    public Usuario(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    
    public String getLogin(){
        return login;
    }
    
    public void setLogin(String novoLogin){
        this.login = novoLogin;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String novaSenha){
        this.senha = novaSenha;
    }
}
