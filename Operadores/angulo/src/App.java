import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Leitura do ângulo em graus
        System.out.print("Digite o valor do ângulo em graus: ");
        double graus = sc.nextDouble();

        
        double radianos = Math.toRadians(graus);

       
        double seno = Math.sin(radianos);
        double cosseno = Math.cos(radianos);
        double tangente = Math.tan(radianos);

        
        System.out.printf("Ângulo em graus: %.2f°%n", graus);
        System.out.printf("Ângulo em radianos: %.4f rad%n", radianos);
        System.out.printf("Seno: %.4f%n", seno);
        System.out.printf("Cosseno: %.4f%n", cosseno);
        System.out.printf("Tangente: %.4f%n", tangente);

        sc.close(); 
    }
}
