import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        
        double peso1 = 1;
        double peso2 = 2;
        double peso3 = 4;

        double somaPesos = peso1 + peso2 + peso3;
        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / somaPesos;

      
        System.out.printf("A média ponderada das notas é: %.2f%n", mediaPonderada);

        sc.close(); 
    }
}
