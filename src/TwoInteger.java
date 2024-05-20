import java.util.Scanner;

public class TwoInteger {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=s.nextInt();
        System.out.println("Enter the second number");
        int num2=s.nextInt();
        try {
            int result = dividenumbers (num1, num2);
            System.out.println("result of division :" + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        }

    }

    private static int dividenumbers(int num1, int num2) {
        int i = num1 % num2;
        return i;
    }
}
