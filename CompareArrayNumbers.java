//CompareArrayNumbers: That receives two lists of numbers and returns a list with the max of both
import java.util.Scanner;

/**
 *
 * @author Solange Bleise
 */
public class CompareArrayNumbers {
    public static void main(String args[]) {
        int at;
        
        Scanner scan = new Scanner(System.in);
       
        System.out.println("*-*- Este programa recibira dos numeros y devolvera el maximo de ellos -*-*");
        
        System.out.println("Ingrese el numero de elementos de la matrices: ");
        at = scan.nextInt();
        
        System.out.println("Ingrese los elementos de la matriz 1: ");
        int array1[] = new int[at];

        for (int i=0; i<array1.length; i++) {
            array1[i] = scan.nextInt();
        }
        
        System.out.println("Ingrese los elementos de la matriz 2: ");
        int array2[] = new int[at];

        for (int i=0; i<array2.length; i++) {
            array2[i] = scan.nextInt();
        }
        
        System.out.println("Suma de ambas matrices : ");
  
        for(int i = 0; i <at; i++) {
            for(int j = 0; j <=at; j++){
                System.out.println(" "+(array1[i][j]+array2[i][j]));
            } 
        }
    }
}
