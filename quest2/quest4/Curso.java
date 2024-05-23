package Abstract.quest2.quest4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Curso implements Interface {
    private final static int NUM_MAX = 50;
    ArrayList<Aluno> alunos = new ArrayList<>(NUM_MAX);

    public Curso() {
        alunos = new ArrayList<>(NUM_MAX);
    }

    public void ordenaAlunosPorNome() {
        Collections.sort(alunos);
    }

    public List<Aluno> getAlunosOrdenadosPorNota() {
        return alunos.stream()
                     .sorted((a1, a2) -> Double.compare(a2.getMediaNotas(), a1.getMediaNotas()))
                     .collect(Collectors.toList());
    }

    public List<Aluno> getAlunosReprovados() {
        return alunos.stream()
                     .filter(aluno -> aluno.getMediaNotas() < 60)
                     .collect(Collectors.toList());
    }

    @Override
    public void add(Object x) {
        if (x instanceof Aluno) {
            if (alunos.size() == NUM_MAX) {
                System.out.println("Atingiu o limite de alunos para o curso.");
            } else {
                Aluno aluno = (Aluno) x;
                alunos.add(aluno);
            }
        } else {
            System.out.println("O objeto não é um aluno.");
        }
    }

    @Override
    public void remove(Object x) {
        if (x instanceof Aluno) {
            Aluno aluno = (Aluno) x;
            alunos.remove(aluno);
        } else {
            System.out.println("O objeto não é uma instância de aluno.");
        }
    }

    public static int getNumMax() {
        return NUM_MAX;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
}
