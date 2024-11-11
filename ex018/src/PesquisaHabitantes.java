import java.util.Scanner;

public class PesquisaHabitantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorIdade = 0;
        int somaIdade = 0;
        int contadorHomens = 0;
        double somaSalariosHomens = 0;
        int contadorMulheresSalarioBaixo = 0;
        
        while (true) {
            System.out.println("Digite a idade (idade negativa para encerrar):");
            int idade = scanner.nextInt();
            if (idade < 0) {
                break;
            }
            
            System.out.println("Digite o sexo (M/F):");
            char sexo = scanner.next().charAt(0);
            System.out.println("Digite o salário:");
            double salario = scanner.nextDouble();
            
            contadorIdade++;
            somaIdade += idade;
            
            if (sexo == 'M' || sexo == 'm') {
                contadorHomens++;
                somaSalariosHomens += salario;
            } else if (sexo == 'F' || sexo == 'f') {
                if (salario < 600.00) {
                    contadorMulheresSalarioBaixo++;
                }
            }
        }
        
        if (contadorIdade > 0) {
            double mediaIdade = somaIdade / (double)contadorIdade;
            System.out.println("Média de idade do grupo: " + mediaIdade);
        } else {
            System.out.println("Nenhuma idade válida foi inserida.");
        }
        
        if (contadorHomens > 0) {
            double mediaSalariosHomens = somaSalariosHomens / contadorHomens;
            System.out.println("Média de salários dos homens: " + mediaSalariosHomens);
        } else {
            System.out.println("Nenhum salário de homem foi inserido.");
        }
        
        System.out.println("Quantidade de mulheres com salário abaixo de R$600,00: " + contadorMulheresSalarioBaixo);
        
        scanner.close();
    }
}

