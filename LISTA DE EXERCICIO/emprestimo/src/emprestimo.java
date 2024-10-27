import java.util.Scanner;

165
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
        } else {
            System.out.println("Empréstimo não aprovado.");
        }
        
        scanner.close();
    }
}
