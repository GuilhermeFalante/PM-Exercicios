import java.util.List;
import java.util.stream.Collectors;

public class FiltroString {

    public List<String> filtrar(List<String> lista, char inicial, int comprimento) {
        
        return lista.stream()
                .filter(str -> str.charAt(0) == inicial && str.length() == comprimento)
                .collect(Collectors.toList());

    }

}
