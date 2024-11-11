import java.util.Scanner;

public class CalculaMediaEMaior {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        double soma = 0;
        double maior = Double.NEGATIVE_INFINITY;
        double valor;
        
        System.out.println("Digite os valores (digite um número negativo para parar):");
        
        while (true) {
            valor = scanner.nextDouble();
            
            if (valor < 0) {
                break;
            }
            
            soma += valor;
            contador++;
            
            if (valor > maior) {
                maior = valor;
            }
        }
        
        if (contador > 0) {
            double media = soma / contador;
            System.out.println("Média dos valores: " + media);
            System.out.println("Maior valor: " + maior);
        } else {
            System.out.println("Nenhum valor válido foi inserido.");
        }
        
        scanner.close();
    }
}
