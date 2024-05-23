package Abstract.quest2.quest4;

import java.util.ArrayList;

public class Aluno implements Interface, Comparable<Aluno> {
    private String nome;
    ArrayList<Nota> notas = new ArrayList<Nota>(NUM_MAX);
    private final static int NUM_MAX = 5;

    public Aluno(String nome) {
        this.setNome(nome);
        this.notas = new ArrayList<>(NUM_MAX);
    }

    public double getMediaNotas() {
        if (notas.isEmpty()) {
            return 0;
        }
        double soma = 0;
        for (Nota nota : notas) {
            soma += nota.getNota();
        }
        return soma / notas.size();
    }

    @Override
    public int compareTo(Aluno outroAluno) {
        return this.nome.compareTo(outroAluno.getNome());
    }

    @Override
    public void add(Object x) {
        if (x instanceof Nota) {
            if (notas.size() == NUM_MAX) {
                System.out.println("Atingiu o limite de notas para o aluno.");
            } else {
                Nota nota = (Nota) x;
                notas.add(nota);
            }
        } else {
            System.out.println("O objeto não é uma nota.");
        }
    }

    @Override
    public void remove(Object x) {
        if (x instanceof Nota) {
            Nota nota = (Nota) x;
            notas.remove(nota);
        } else {
            System.out.println("O objeto não é uma instância de Nota.");
        }
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    public static int getNumMax() {
        return NUM_MAX;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
