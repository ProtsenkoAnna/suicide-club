import java.util.Scanner;

public class Var7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = in.nextInt();
        step(n,2);
    }

    private static void step(int num, int prime){
        if(num==1)
            return;
        if(num%prime == 0) {
            System.out.print(prime + " ");
            step(num/prime,prime);
        }
        else
            step(num,nextPrime(prime));
    }

    private static int nextPrime(int n) {
        for (n++; !checkPrime(n, 2); n++) ;
        return n;
    }

    private static boolean checkPrime(int num, int del) {

        if (del > num / 2) {
            return true;
        }
        return num % del != 0 && checkPrime(num, del + 1);
    }
}
