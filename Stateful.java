import java.util.Scanner;
 
public class Stateful 
 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //nth element input
        System.out.print("Enter the ordinal value or the last element of Fibonacci sequence: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci stateful:");
        System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n, findNth(n));
            }

    
            static int findNth(int n) {
        int x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        return x;
    }

    
}
