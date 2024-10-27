import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso");
        float peso = sc.nextFloat();
        System.out.println("Digite sua altura");
        float altura = sc.nextFloat();
        float imc = peso / (altura * altura);
        System.out.println("O seu IMC é " + imc + "kg/m²");
        sc.close();
    }
}
