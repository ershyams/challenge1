import java.util.Scanner;
 
public class Stateless 
 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //nth element input
        System.out.print("Enter the ordinal value or the last element of Fibonacci sequence: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci STATELESS:");
        System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n, fibRecursion(n));
        
    }


    //Recursive method
    static int fibRecursion(int  n) {
        if ((n == 1) || (n == 0)) {
            return n;
        }
        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }


    
}
