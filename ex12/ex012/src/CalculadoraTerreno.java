import java.util.Scanner;

public class CalculadoraTerreno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("Digite a largura do terreno:");
            double largura = scanner.nextDouble();
            System.out.println("Digite o comprimento do terreno:");
            double comprimento = scanner.nextDouble();
            
            double area = calcularArea(largura, comprimento);
            double perimetro = calcularPerimetro(largura, comprimento);
            
            System.out.println("Área do terreno: " + area);
            System.out.println("Perímetro do terreno: " + perimetro);
            
            System.out.println("Deseja calcular outro terreno? [1] Sim [2] Não");
            opcao = scanner.nextInt();
            
        } while (opcao == 1);
        
        scanner.close();
    }
    
    public static double calcularArea(double largura, double comprimento) {
        return largura * comprimento;
    }
    
    public static double calcularPerimetro(double largura, double comprimento) {
        return 2 * (largura + comprimento);
    }
}
