package quiz_2_PM;
import java.util.ArrayList;
import java.util.List;

public class empresa {
    private List<cliente> clientes;
    private List<funcionario> funcionarios;
    private funcionario presidente;

    public empresa() {
        this.clientes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public void addCliente(cliente cliente) {
        this.clientes.add(cliente);
    }

    public void addFuncionario(funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void setPresidente(funcionario presidente) {
        this.presidente = presidente;
    }

    public Object getPresidente() {
        
        return presidente;
    }
    
}