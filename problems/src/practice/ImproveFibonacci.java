package practice;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/28.
 */
public class ImproveFibonacci {

    public static long fib(long n) {
        long f0 = 0;
        long f1 = 1;
        long f2 = 1;

        if (n == 0)
            return f0;
        if (n == 1)
            return f1;
        if (n == 2)
            return f2;
        for (int i = 3; i <= n; i++) {
            f0 = f1;
            f1 = f2;
            f2 = f1 + f0;
        }


        return f2;
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter an index for the Fibonnaci number:");
        int index=input.nextInt();
        System.out.println("Fibonacci number at index "+index+" is "+fib(index));
    }
}
