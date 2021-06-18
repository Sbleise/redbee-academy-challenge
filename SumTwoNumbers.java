//SumTwoNumbers: That receives two numbers and returns the sum of both
import java.util.Scanner;
/**
 *
 * @author Solange Bleise
 */
public class SumTwoNumbers {
    public static void main(String args[]) {
        int n1,n2;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("*-*- Este programa comparara dos numeros que ingrese -*-*");
        
        System.out.println("Ingrese el primer numero");
        n1=sc.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        n2=sc.nextInt();
        
        if (n1>n2){
            System.out.println("El mayor es: "+n1);  
        }else{
            if (n1==n2){
                System.out.println("Ambos numeros son iguales");
            }else
                 System.out.println("El mayor es: "+n2);

        }
    }
}
