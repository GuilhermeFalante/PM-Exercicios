package Abstract.quest2.quest4;

public class main {
    public static void main(String[] args) {
        // Criando algumas notas
        Nota nota1 = new Nota(80, 1);
        Nota nota2 = new Nota(75, 2);
        Nota nota3 = new Nota(90, 3);
        Nota nota4 = new Nota(55, 1);
        Nota nota5 = new Nota(65, 2);
        Nota nota6 = new Nota(55, 1);
        Nota nota7 = new Nota(30, 2);

        // Criando alguns alunos e adicionando notas
        Aluno aluno1 = new Aluno("João");
        aluno1.add(nota1);
        aluno1.add(nota2);
        aluno1.add(nota3);

        Aluno aluno2 = new Aluno("Maria");
        aluno2.add(nota4);
        aluno2.add(nota5);
        aluno2.add(nota7);

        Aluno aluno3 = new Aluno("Preto macaco");
        aluno3.add(nota5);
        aluno3.add(nota7);
        aluno3.add(nota6);

        Aluno aluno6 = new Aluno("Pretogurila");
        aluno6.add(nota5);
        aluno6.add(nota7);
        aluno6.add(nota6);

        Aluno aluno4 = new Aluno("Pfavelado");
        aluno4.add(nota5);
        aluno4.add(nota7);
        aluno4.add(nota6);

        Aluno aluno5 = new Aluno("Alemao");
        aluno5.add(nota5);
        aluno5.add(nota7);
        aluno5.add(nota6);
        // Criando um curso e adicionando alunos
        Curso curso = new Curso();
        curso.add(aluno1);
        curso.add(aluno2);
        curso.add(aluno3);
        curso.add(aluno4);
        curso.add(aluno5);
        curso.add(aluno6);

        // Testando métodos do curso
        System.out.println("Todos os alunos");
        curso.getAlunos().forEach(a -> System.out.println(a.getNome()));

        System.out.println("Todos os alunos ordenados");
        curso.ordenaAlunosPorNome();
        curso.getAlunos().forEach(a -> System.out.println(a.getNome()));

        System.out.println("\nAlunos ordenados por nota:");
        curso.getAlunosOrdenadosPorNota().forEach(a -> System.out.println(a.getNome() + " - Média de notas: " + a.getMediaNotas()));

        System.out.println("\nAlunos reprovados:");
        curso.getAlunosReprovados().forEach(a -> System.out.println(a.getNome() + " - Média de notas: " + a.getMediaNotas()));

    }
}
