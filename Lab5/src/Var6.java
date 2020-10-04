import java.util.Scanner;

public class Var6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = in.nextInt();
        System.out.println(step(n, 2)? "YES": "NO");
    }

    private static boolean step(int num, int del) {

        if (del > num / 2) {
            return true;
        }
        return num % del != 0 && step(num, del + 1);
    }
}
