import java.util.Scanner;

public class VerificadorNumeroPrimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("Digite o número do pedido:");
            int numeroPedido = scanner.nextInt();
            
            if (isPrimo(numeroPedido)) {
                System.out.println("Pedido premiado! Você tem direito a um desconto.");
            } else {
                System.out.println("Pedido normal.");
            }
            
            System.out.println("Deseja verificar outro pedido? [1] Sim [2] Não");
            opcao = scanner.nextInt();
            
        } while (opcao == 1);
        
        scanner.close();
    }
    
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

