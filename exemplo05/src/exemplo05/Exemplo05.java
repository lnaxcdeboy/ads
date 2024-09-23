
package exemplo05;
import java.util.Scanner;

public class Exemplo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        float peso, altura , imc;
                System.out.println(" Digite a peso: ");
                peso = teclado.nextFloat();
                
                System.out.println(" Digite a altura :");
                altura = teclado.nextFloat();
                
                imc=peso/(altura*altura);
                
                System.out.println(" Seu IMC É :" + imc);
                
                teclado.close();
    }
   
}
