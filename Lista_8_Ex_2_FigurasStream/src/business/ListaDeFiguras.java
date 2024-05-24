package business;

import java.awt.Graphics;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

public class ListaDeFiguras {
    private Deque<Figura> figuras;

    public ListaDeFiguras() {
        figuras = new ArrayDeque<>();
    }

    public int size() {
        return figuras.size();
    }

    public void insere(Figura f) {
        figuras.add(f);
    }

    public void remove() {
        figuras.removeLast();
    }

    public void desenha(Graphics g) {
        figuras.forEach(figura -> figura.desenha(g));
    }

    public double calcularAreaTotal() {
        return figuras.stream().mapToDouble(Figura::getArea).sum();
    }

    public long contarQuadradosSuperioresAMediaCirculos() {
        double mediaCirculos = figuras.stream()
                .filter(f -> f instanceof Circulo)
                .mapToDouble(Figura::getArea)
                .average().orElse(0.0);
        
        return figuras.stream()
                .filter(f -> f instanceof Quadrado)
                .filter(f -> f.getArea() > mediaCirculos)
                .count();
    }

    public List<Circulo> buscarCirculosComRaioSuperior(int raio) {
        return figuras.stream()
                .filter(Circulo.class::isInstance)
                .map(Circulo.class::cast)
                .filter(c -> c.getLado() > raio)
                .collect(Collectors.toList());
    }
}
