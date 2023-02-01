import java.util.Scanner;

public class CalculadoraMedias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Brunas", "Amanda"};

        double media = calculaMediaDaTurma(alunos, sc);

        System.out.printf("Média da turma %d", media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner sc) {
         double soma = 0;
         for (String aluno :alunos) {
            System.out.printf("\nNota do aluno %s: ", aluno);
            double nota = sc.nextInt();
            soma += nota;
         }
         return soma / alunos.length;
    }
}
