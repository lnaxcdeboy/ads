import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Leitura da largura e comprimento da área a ser revestida
        System.out.print("Digite a largura da área (em metros): ");
        double largura = sc.nextDouble();

        System.out.print("Digite o comprimento da área (em metros): ");
        double comprimento = sc.nextDouble();

        // Leitura do valor unitário da caixa de piso
        System.out.print("Digite o valor unitário da caixa de piso: R$ ");
        double valorUnitario = sc.nextDouble();

        // Cálculo da área total a ser revestida
        double areaTotal = largura * comprimento;

        // Cálculo da quantidade de caixas necessárias
        double areaPorCaixa = 2.5; // Área que cada caixa cobre
        int quantidadeCaixas = (int) Math.ceil(areaTotal / areaPorCaixa); // Arredondar para cima

        // Cálculo do custo total
        double custoTotal = quantidadeCaixas * valorUnitario;

        // Impressão dos resultados
        System.out.println("Área total a ser revestida: " + areaTotal + " m²");
        System.out.println("Quantidade de caixas necessárias: " + quantidadeCaixas);
        System.out.printf("Custo total: R$ %.2f%n", custoTotal);

        sc.close(); 
    }
}
