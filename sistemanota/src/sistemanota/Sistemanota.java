
package sistemanota;
import java.util.Scanner;


        
public class Sistemanota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         System.out.println(" Digite o primeiro valor: ");
                 float n1 = teclado.nextFloat();
                 
                 System.out.println(" Dgite o segundo valor ");
                 float n2 = teclado.nextFloat();
                 
                 System.out.println(" Digite o terceiro valor ");
                 float n3 = teclado.nextFloat(); 
                 
                 System.out.println(" Digite o quarto valor ");
                 float n4 = teclado.nextFloat();
                 
                 float media = ( n1 + n2 + n3+ n4 ) /4;
                 
                 System.out.println(" A media de valores é: " + media);
                 
                 teclado.close();
                 
                 if ( media >= 6 ) {
                     System.out.println(" Aprovado ");
                 }
                 else if ( media >= 4 && media <6) {
                     System.out.println(" RECUPERAÇÃO");
                    
                 }
                         
                 else {
                     System.out.println(" Reprovado ");
                 }
         
    }
    
}
