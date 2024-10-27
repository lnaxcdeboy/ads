import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        double distanciaPercorrida, litrosConsumidos, consumoMedio;

        System.out.print("Digite a distância percorrida (em km): ");
        distanciaPercorrida = scanner.nextDouble();
        
        System.out.print("Digite a quantidade de combustível consumido (em litros): ");
        litrosConsumidos = scanner.nextDouble();
       
        if (litrosConsumidos > 0) {
           
            consumoMedio = distanciaPercorrida / litrosConsumidos;
           
            System.out.printf("O consumo médio é: %.2f km/l%n", consumoMedio);
        } else {
            System.out.println("A quantidade de litros consumidos deve ser maior que zero.");
        }
        
        scanner.close();
    }
}
