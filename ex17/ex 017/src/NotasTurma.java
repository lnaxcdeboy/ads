import java.util.Scanner;

public class NotasTurma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeAprovados = 0;
        double somaNotas = 0;
        double nota;
        
        for (int i = 0; i < 80; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ":");
            nota = scanner.nextDouble();
            
            if (nota >= 6.0) {
                quantidadeAprovados++;
            }
            
            somaNotas += nota;
        }
        
        double mediaNotas = somaNotas / 80;
        
        System.out.println("Quantidade de alunos aprovados: " + quantidadeAprovados);
        System.out.println("Média das notas da turma: " + mediaNotas);
        
        scanner.close();
    }
}
