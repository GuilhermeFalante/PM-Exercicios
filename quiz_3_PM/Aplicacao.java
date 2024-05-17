package quiz_3_PM;

import javax.swing.JOptionPane;

public class Aplicacao {
    public static void main(String[] args) {
        Data[] datas = new Data[3];
        for (int i = 0; i < datas.length; i++) {
            try {
                datas[i] = Data.gerarDataAleatoria();
                
            } catch (ExcecaoDataInvalida e) {

            JOptionPane.showMessageDialog(null, e.getMessage(), "Excecao de data foi lancada", JOptionPane.ERROR_MESSAGE);

        }
        }

        System.out.println("Lista original:");
        imprimirLista(datas);

        Ordenavel[] crescente = Ordenador.crescente(datas);
        System.out.println("\nLista ordenada em ordem crescente:");
        imprimirLista(crescente);

        Ordenavel[] decrescente = Ordenador.decrescente(datas);
        System.out.println("\nLista ordenada em ordem decrescente:");
        imprimirLista(decrescente);
    }

    public static void imprimirLista(Ordenavel[] lista) {
        for (Ordenavel elemento : lista) {
            System.out.println(elemento);
        }
    }
}