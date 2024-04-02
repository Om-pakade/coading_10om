import java.util.Scanner;
public class Palindrome
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n, r, c, reversed = 0; 

        System.out.println("Enter the value of n: ");
        n = s.nextInt();
        c = n;

        while (n > 0) {
            r = n % 10;
            reversed = (reversed * 10) + r;
            n = n / 10; 
        }

        if (c == reversed) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }

        s.close();
    }
}
