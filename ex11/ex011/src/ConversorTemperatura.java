import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("[1] Celsius para Fahrenheit");
            System.out.println("[2] Fahrenheit para Celsius");
            System.out.println("[3] Sair");
            opcao = scanner.nextInt();
            
            if (opcao == 1) {
                System.out.println("Digite a temperatura em Celsius:");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsiusParaFahrenheit(celsius);
                System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
            } else if (opcao == 2) {
                System.out.println("Digite a temperatura em Fahrenheit:");
                double fahrenheit = scanner.nextDouble();
                double celsius = fahrenheitParaCelsius(fahrenheit);
                System.out.println("Temperatura em Celsius: " + celsius);
            } else if (opcao == 3) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
        
        scanner.close();
    }
    
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

