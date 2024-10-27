import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        double salario;
        int pendencias;

        System.out.print("Digite o salário do cliente: R$ ");
        salario = scanner.nextDouble();
        
        System.out.print("Digite a quantidade de pendências: ");
        pendencias = scanner.nextInt();

        if (salario > 2500.00 && pendencias <= 2) {
            System.out.println("Empréstimo aprovado.");
            
            System.out.print("Digite o valor do empréstimo: R$ ");
            double valorEmprestimo = scanner.nextDouble();
            
            System.out.print("Digite a quantidade de parcelas: ");
            int parcelas = scanner.nextInt();

            double taxaJuro = 0.009; // 0,9%
            double totalJuros = valorEmprestimo * taxaJuro * parcelas;
            double totalAPagar = valorEmprestimo + totalJuros;
            double valorParcela = totalAPagar / parcelas;

            System.out.printf("Valor de cada parcela: R$ %.2f%n", valorParcela);
            System.out.printf("Total a pagar: R$ %.2f%n", totalAPagar);
        } else {
            System.out.println("Empréstimo não aprovado.");
        }
        
        scanner.close();
    }
}
