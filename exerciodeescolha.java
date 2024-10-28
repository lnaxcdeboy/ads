
import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opc; // Declare apenas como int

        System.out.println("ESCOLHA UMA OPÇÃO: ");
        System.out.println("1 - FILME / 2 - SERIE / 3 - RESTAURANTE / 4 - PARQUE / 5 - SAIR");

        opc = scanner.nextInt(); // Ler a entrada do usuário

        switch (opc) { // Usar 'switch' corretamente
            case 1:
                System.out.println("VOCE ESCOLHEU FILME!");
                break;

            case 2:
                System.out.println("VOCE ESCOLHEU SERIE");
                break;

            case 3:
                System.out.println("VOCE ESCOLHEU RESTAURANTE!");
                break;

            case 4:
                System.out.println("VOCE ESCOLHEU PARQUE!");
                break;

            case 5: // Adicionar ':' após 'case 5'
                System.out.println("OBRIGADO POR USAR MEU PROGRAMA");
                break;

            default:
                System.out.println("Escolheu opção errada");
        }

        scanner.close();
    }
}
