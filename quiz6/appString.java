import java.util.List;

public class appString {
        public static void main(String[] args) {

            
        FiltroString filtro = new FiltroString();
        List<String> lista = List.of("java", "python", "c", "javascript", "ruby", "scala");

        char inicial = 'j';
        int comprimento = 4;

        List<String> resultado = filtro.filtrar(lista, inicial, comprimento);
        
        System.out.println("Strings filtradas: " + resultado);

    }
}
