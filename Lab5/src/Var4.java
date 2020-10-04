import java.util.Scanner;

public class Var4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во разрядов: ");
        int k = in.nextInt();
        System.out.print("Введите сумму: ");
        int s = in.nextInt();
        System.out.println("Результат: " + step(s, k -1, true));
    }

    private static int step(int sum, int digits, boolean first) {
        if (sum < 0)
            return 0;
        int result = 0;
        for (int i = first ? 1 : 0; i < 10; i++) {
            if (digits == 0) {
                if (sum == i)
                    return 1;
            } else {
                result += step(sum - i, digits - 1, false);
            }

        }
        return result;
    }
}
