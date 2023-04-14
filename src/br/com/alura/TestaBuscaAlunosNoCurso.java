package br.com.alura;

public class TestaBuscaAlunosNoCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominandos as coleções do Java", "Isabela Fagundes");
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
        javaColecoes.adiciona(new Aula("Criando uma aula",20));
        javaColecoes.adiciona(new Aula("Modelando com coleções",21));

        Aluno a1 = new Aluno("Isabela Fagundes", 1234);
        Aluno a2 = new Aluno("Maria Clara", 1244);
        Aluno a3 = new Aluno("Souza Menezes", 1255);

        javaColecoes.matricular(a1);
        javaColecoes.matricular(a2);
        javaColecoes.matricular(a3);

        System.out.println("Quem é o aluno com matrícula 1244?");
        Aluno aluno = javaColecoes.buscaMatriculado(33333);
        System.out.println(aluno);
    }


}
