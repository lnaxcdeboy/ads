import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Leitura do valor de x
        System.out.print("Digite o valor de x: ");
        double x = sc.nextDouble();
      
        double y = 3 + 2 * x;

        
        System.out.printf("O valor de y para x = %.2f é: %.2f%n", x, y);

        sc.close(); 
    }
}
