import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        double valorOriginal, desconto, valorFinal;

        System.out.print("Digite o valor original do produto: R$ ");
        valorOriginal = scanner.nextDouble();
        
        desconto = valorOriginal * 0.15;
        
        valorFinal = valorOriginal - desconto;

        System.out.printf("O valor final do produto após o desconto é: R$ %.2f%n", valorFinal);
        
        scanner.close();
    }
}
