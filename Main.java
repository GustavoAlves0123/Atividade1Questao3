class Faculdade {
    String nome;
    String endereco;
    int quantidadeDeAlunos;
    int quantidadeDeCursos;
    String reitor;

    void adicionaAluno(Aluno aluno) {
        quantidadeDeAlunos++;
        System.out.println("O aluno " + aluno.nome + " se matriculou");
    }

    void adicionaCurso(Curso curso) {
        quantidadeDeCursos++;
        System.out.println("O curso " + curso.nome + " foi adicionado");
    }
}

class Aluno {
    String nome;
    String cpf;
    String email;
    String dataDeNascimento;
    String cursoMatriculado;

    void matriculaEmUmCurso(Curso curso) {
        cursoMatriculado = curso.nome;
        curso.adicionaAluno(this);
        System.out.println("O aluno " + nome + " se matriculou no curso " + curso.nome);
    }
}

class Curso {
    String nome;
    String codigo;
    String descricao;
    int quantidadeDeAlunosMatriculados;
    String coordenador;

    void adicionaAluno(Aluno aluno) {
        quantidadeDeAlunosMatriculados++;
        System.out.println("O aluno " + aluno.nome + " se matriculou no curso " + nome);
    }
}

public class Main {
    public static void main(String[] args) {
        Faculdade Cotemig = new Faculdade();
        cotemig.nome = "Faculdade Cotemig";
        cotemig.endereco = "Belo Horizonte, MG";
        cotemig.quantidadeDeAlunos = 0;
        cotemig.quantidadeDeCursos = 0;
        cotemig.reitor = "Moema Belo";

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Gustavo";
        aluno1.cpf = "123.456.789-10";
        aluno1.email = "gustavo@aluno.faculdadecotemig.br";
        aluno1.dataDeNascimento = "23/01/2005";

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Pedro";
        aluno2.cpf = "987.654.321-12";
        aluno2.email = "pedro@aluno.faculdadecotemig.br";
        aluno2.dataDeNascimento = "15/06/1995";

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Maria";
        aluno3.cpf = "456.789.012-34";
        aluno3.email = "maria@aluno.faculdadecotemig.br";
        aluno3.dataDeNascimento = "30/08/1997";

        Curso curso1 = new Curso();
        curso1.nome = "Publicidade e Propaganda";
        curso1.codigo = "PP";
        curso1.descricao = "Curso de Publicidade e Propaganda";
        curso1.quantidadeDeAlunosMatriculados = 0;
        curso1.coordenador = "Dr. Lucas Smith";

        Curso curso2 = new Curso();
        curso2.nome = "Engenharia de Computação";
        curso2.codigo = "ECO";
        curso2.descricao = "Curso de Engenharia de Computação";
        curso2.quantidadeDeAlunosMatriculados = 0;
        curso2.coordenador = "Dr. Maria";

        Curso curso3 = new Curso();
        curso3.nome = "Matemática";
        curso3.codigo = "MAT";
        curso3.descricao = "Curso de Matemática";
        curso3.quantidadeDeAlunosMatriculados = 0;
        curso3.coordenador = "Dr. José";

        cotemig.adicionaAluno(aluno1);
        cotemig.adicionaAluno(aluno2);
        cotemig.adicionaAluno(aluno3);

        cotemig.adicionaCurso(curso1);
        cotemig.adicionaCurso(curso2);
        cotemig.adicionaCurso(curso3);

        aluno1.matriculaEmUmCurso(curso1);
        aluno2.matriculaEmUmCurso(curso2);
        aluno3.matriculaEmUmCurso(curso3);

        System.out.println("Quantidade de alunos na Faculdade Cotemig: " + cotemig.quantidadeDeAlunos);
        System.out.println("Quantidade de cursos na Faculdade Cotemig: " + cotemig.quantidadeDeCursos);
        System.out.println("Quantidade de alunos no curso de Publicidade e Propaganda: " + curso1.quantidadeDeAlunosMatriculados);
        System.out.println("Quantidade de alunos no curso de Engenharia de Computação: " + curso2.quantidadeDeAlunosMatriculados);
        System.out.println("Quantidade de alunos no curso de Matemática: " + curso3.quantidadeDeAlunosMatriculados);
    }
}