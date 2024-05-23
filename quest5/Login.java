package Abstract.quest5;

public class Login{
    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public void setSenha(String senha) {
        this.senha=senha;
    }

    public boolean fazerLogin(String usuario, String senha) throws excecaoSenhaErrada ,excecaoUsuarioErrado{
        if (this.usuario.equals(usuario)) {
            if (this.senha.equals(senha)) {
                return true;
            } else {
                throw new excecaoSenhaErrada("Senha incorreta!");
            }
        } else {
            throw new excecaoUsuarioErrado("Usuário incorreto!");
        }
}
}