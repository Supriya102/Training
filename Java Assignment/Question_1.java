import java.util.Scanner;

public class jQuestion_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        boolean is_square = (num1 * num1) == num2;
        boolean is_multiple = (num2 % num1) == 0;
        int multiples = num2 / num1;
        if (is_square)
            System.out.println(num2 + " is a square and multiple of " + num1);
        else if (is_multiple)
            System.out.println(num2 + " is a multiple of " + num1 + " = " + multiples + "s of " + num1);
        else 
            System.out.println(num2 + " is neither a square nor multiple of " + num1);
    }
}
