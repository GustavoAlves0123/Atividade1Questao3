import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Faculdade faculdade = new Faculdade(
                "Faculdade Tech", "Belo Horizonte", 1995, "Privada", 1200
        );

        Curso curso1 = new Curso("ADS", "ADS01", 4, 3000, "Noturno");
        Curso curso2 = new Curso("Sistemas de Informação", "SI01", 4, 3200, "Noturno");
        Curso curso3 = new Curso("Engenharia de Software", "ES01", 5, 3500, "Diurno");

        faculdade.adicionarCurso(curso1);
        faculdade.adicionarCurso(curso2);
        faculdade.adicionarCurso(curso3);

        Aluno aluno1 = new Aluno("João", "2023001", 20, "joao@email.com", curso1);
        Aluno aluno2 = new Aluno("Maria", "2023002", 21, "maria@email.com", curso2);
        Aluno aluno3 = new Aluno("Pedro", "2023003", 19, "pedro@email.com", curso3);

        faculdade.adicionarAluno(aluno1);
        faculdade.adicionarAluno(aluno2);
        faculdade.adicionarAluno(aluno3);

        faculdade.mostrarCursos();
        faculdade.mostrarAlunos();

        aluno1.estudar();
        aluno2.estudar();
        aluno3.estudar();
    }
}

class Faculdade {

    String nome;
    String cidade;
    int anoFundacao;
    String tipo;
    int quantidadeAlunos;

    ArrayList<Aluno> alunos = new ArrayList<>();
    ArrayList<Curso> cursos = new ArrayList<>();

    public Faculdade(String nome, String cidade, int anoFundacao, String tipo, int quantidadeAlunos) {
        this.nome = nome;
        this.cidade = cidade;
        this.anoFundacao = anoFundacao;
        this.tipo = tipo;
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno " + aluno.nome + " foi adicionado na faculdade.");
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
        System.out.println("Curso " + curso.nome + " foi adicionado na faculdade.");
    }

    public void mostrarAlunos() {
        System.out.println("\nLista de alunos:");
        for (Aluno a : alunos) {
            System.out.println(a.nome);
        }
    }

    public void mostrarCursos() {
        System.out.println("\nLista de cursos:");
        for (Curso c : cursos) {
            System.out.println(c.nome);
        }
    }
}

class Aluno {

    String nome;
    String matricula;
    int idade;
    String email;
    Curso curso;

    public Aluno(String nome, String matricula, int idade, String email, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.email = email;
        this.curso = curso;
    }

    public void estudar() {
        System.out.println(nome + " está estudando o curso de " + curso.nome);
    }

    public void matricular() {
        System.out.println(nome + " se matriculou no curso " + curso.nome);
    }
}

class Curso {

    String nome;
    String codigo;
    int duracao;
    double mensalidade;
    String turno;

    public Curso(String nome, String codigo, int duracao, double mensalidade, String turno) {
        this.nome = nome;
        this.codigo = codigo;
        this.duracao = duracao;
        this.mensalidade = mensalidade;
        this.turno = turno;
    }

    public void iniciarCurso() {
        System.out.println("O curso " + nome + " foi iniciado.");
    }

    public void mostrarInformacoes() {
        System.out.println("Curso: " + nome + " | Duração: " + duracao + " anos");
    }
}
