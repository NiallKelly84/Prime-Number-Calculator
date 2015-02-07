import java.util.Scanner;

/**
 * Created by Kelly on 07/02/2015.
 */
public class PrimeNumberCalculator {
    public static void main (String args[]){
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        System.out.println("Prime Numbers are: ");

        for (int i=1; i<= num; i++) {
            for (int j=i; j>0; j--) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }
            count = 0;
        }
    }
}
