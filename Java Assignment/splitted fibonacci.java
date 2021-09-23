
import java.util.Scanner;

public class Main {

    public static int fib1(int n)
    {
            if (n ==0)
                return 0;
            else if(n==1)
                return 1;
            else
                return fib1(n - 1) + fib1(n - 2);    
    }

    public static int fib2(int n)
    {

            if (n ==0)
                return 0;
            else if(n==1)
                return 1;
            else
                return fib2(n - 1) + fib2(n - 2);    
        
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n upto which you want fibonacci series: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            if (i % 2 == 0)
                System.out.print(fib1(i)+" ");
            else 
                System.out.print(fib2(i)+" ");
        }
         
    }
}
