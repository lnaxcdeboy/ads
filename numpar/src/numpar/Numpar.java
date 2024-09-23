package numpar;
import java.util.Scanner;

/**
 *
 * @author autologon
 */
public class Numpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu numero inteiro:");
        int num = teclado.nextInt();
        if (num %2 == 0){
        System.out.println(" O numero " + num + " é par");  
    } else{
            System.out.println(" O numero " + num + " é impar ");
        }
                teclado.close();
                
                       
        
        
 
    }
    
}
