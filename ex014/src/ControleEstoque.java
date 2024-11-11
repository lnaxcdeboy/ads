import java.util.Scanner;

public class ControleEstoque {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int estoque = 100;  // Definindo a quantidade de produtos no estoque
        int opcao;
        
        do {
            System.out.println("Digite a quantidade desejada pelo cliente:");
            int quantidadeComprada = scanner.nextInt();
            
            if (verificarDisponibilidade(estoque, quantidadeComprada)) {
                estoque = atualizarEstoque(estoque, quantidadeComprada);
                System.out.println("Compra realizada com sucesso.");
            } else {
                System.out.println("Produto esgotado.");
            }
            
            System.out.println("Deseja verificar outra compra? [1] Sim [2] Não");
            opcao = scanner.nextInt();
            
        } while (opcao == 1);
        
        scanner.close();
    }
    
    public static boolean verificarDisponibilidade(int estoque, int quantidadeComprada) {
        return quantidadeComprada <= estoque;
    }
    
    public static int atualizarEstoque(int estoque, int quantidadeComprada) {
        return estoque - quantidadeComprada;
    }
}

