import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Selecione um lanche:");
        System.out.println("1 - Hamburguer - R$ 10.00");
        System.out.println("2 - Cachorro-quente - R$ 7.00");
        System.out.println("3 - Batata Frita - R$ 5.00");
        System.out.print("Digite o número do lanche desejado: ");
        
        int opcao = scanner.nextInt();
        
        switch (opcao) {
            case 1 -> System.out.println("Você escolheu: Hamburguer " + " \nValor a pagar  R$ 10.00");
            case 2 -> System.out.println("Você escolheu: Cachorro-quente " + " \nValor a pagar  R$ 7.00");
            case 3 -> System.out.println("Você escolheu: Batata Frita " + " \nValor a pagar R$ 5.00");
            default -> System.out.println("Opção inválida. Por favor, selecione um número de 1 a 3.");
        }
        
        scanner.close();
    }
}
