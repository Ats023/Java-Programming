import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) System.out.print(generateFibonacci(i)+" ");
    }

    public static int generateFibonacci(int n) {
        if(n<2) return n;
        else return generateFibonacci(n-1)+generateFibonacci(n-2);
    }
}

