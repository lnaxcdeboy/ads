import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
            Scanner sc = new Scanner(System.in);
    
            
            double num1, num2, num3, num4, media;
    
            
            System.out.print("Digite o primeiro número: ");
            num1 = sc.nextDouble();
    
            System.out.print("Digite o segundo número: ");
            num2 = sc.nextDouble();
    
            System.out.print("Digite o terceiro número: ");
            num3 = sc.nextDouble();
    
            System.out.print("Digite o quarto número: ");
            num4 = sc.nextDouble();
    
            
            media = (num1 + num2 + num3 + num4) / 4;
    
           
            System.out.printf("A média aritmética dos quatro números é: %.2f%n", media);
    
            sc.close(); 
    }
}
