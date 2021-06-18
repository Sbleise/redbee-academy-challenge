//SumArrayNumbers: That receives a list and return the sum of entire list
import java.util.Scanner;

/**
 *
 * @author Solange Bleise
 */
public class SumArrayNumbers {
    public static void main(String args[]) {
        int at;
        
        at=0;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el numero de elementos de la matriz: ");
        at = scan.nextInt();

        System.out.println("Ingrese los elementos de la matriz: ");
        int array[] = new int[at];

        for (int i=0; i<array.length; i++) {
            array[i] = scan.nextInt();
            at= scan.nextInt();
        }

         System.out.println("la suma de los elementos de la matriz es: "+at);
    }
}
