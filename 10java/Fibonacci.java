public class Fibonacci {
    public static void main(String args[])
    {
        int n=10;
        System.out.println("fibonacii number are");
        int a=0,b=1,z;
        while(a<=n)
        {
            System.out.println(a+"");
            z=a+b;
            a=b;
            b=z;

        }
        
    }
}
