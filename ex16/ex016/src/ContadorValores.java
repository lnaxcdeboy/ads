import java.util.Scanner;

public class ContadorValores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        double menor = Double.POSITIVE_INFINITY;
        double valor;
        
        System.out.println("Digite os valores reais (digite um número não-real para parar):");
        
        while (scanner.hasNextDouble()) {
            valor = scanner.nextDouble();
            
            if (valor > 0) {
                positivos++;
            } else if (valor < 0) {
                negativos++;
            }
            
            if (valor < menor) {
                menor = valor;
            }
        }
        
        System.out.println("Quantidade de valores positivos: " + positivos);
        System.out.println("Quantidade de valores negativos: " + negativos);
        if (positivos > 0 || negativos > 0) {
            System.out.println("Menor valor: " + menor);
        } else {
            System.out.println("Nenhum valor válido foi inserido.");
        }
        
        scanner.close();
    }
}
