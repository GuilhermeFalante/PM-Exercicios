package Abstract.quest5;

public class main {
    public static void main(String[] args) {
        Login login = new Login("user123", "pass123");

        // Caso 1: Login bem-sucedido
        try {
            if (login.fazerLogin("user123", "pass123")) {
                System.out.println("Caso 1: Login bem-sucedido!");
            }
        } catch (excecaoUsuarioErrado | excecaoSenhaErrada e) {
            System.out.println("Caso 1: Erro - " + e.getMessage());
        }

        // Caso 2: Usuário incorreto
        try {
            login.fazerLogin("wrongUser", "pass123");
        }catch (excecaoUsuarioErrado | excecaoSenhaErrada e) {
            System.out.println("Caso 1: Erro - " + e.getMessage());
        }

        // Caso 3: Senha incorreta
        try {
            login.fazerLogin("user123", "wrongPass");
        } catch (excecaoUsuarioErrado | excecaoSenhaErrada e) {
            System.out.println("Caso 1: Erro - " + e.getMessage());
        }
        // Caso 4: Ambos usuário e senha incorretos
        try {
            login.fazerLogin("wrongUser", "wrongPass");
        } catch (excecaoUsuarioErrado | excecaoSenhaErrada e) {
            System.out.println("Caso 1: Erro - " + e.getMessage());
        }
    }
}

