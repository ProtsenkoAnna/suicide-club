import java.util.Scanner;

public class Var5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = in.nextInt();
        System.out.println("Результат: " + step(n));
    }

    private static int step(int num) {

        if (num == 0) {
            return 0;
        }
        return num % 10 + step(num / 10);
    }
}
