import java.util.Scanner;
import java.util.Stack;

public class DrinkerStack {
    public static void main(String[] args) {
        Stack<Integer> pl1 = new Stack<>();
        Stack<Integer> pl2 = new Stack<>();

        Scanner in = new Scanner(System.in);
        parseStr(pl1, in);
        parseStr(pl2, in);

        for (int i = 0; i < 106; i++) {
            if (pl1.empty()) {
                System.out.println("second " + i);
                return;
            }
            if (pl2.empty()) {
                System.out.println("first " + i);
                return;
            }
            int card1 = pl1.pop();
            int card2 = pl2.pop();
            if (card1 == card2) {
                pl1.add(0, card1);
                pl2.add(0, card2);
            } else if (card1 == 0 && card2 == 9) {
                pl1.add(0, card1);
                pl1.add(0, card2);
            } else if (card2 == 0 && card1 == 9) {
                pl2.add(0, card1);
                pl2.add(0, card2);
            } else if (card1 > card2) {
                pl1.add(0, card1);
                pl1.add(0, card2);
            } else {
                pl2.add(0, card1);
                pl2.add(0, card2);
            }
        }
        System.out.println("botva");

    }

    private static void parseStr(Stack<Integer> pl1, Scanner in) {
        String str = in.next();
        for (int i = 0; i < str.length(); i++) {
            pl1.add(0, str.charAt(i) - '0');
        }
    }
}
