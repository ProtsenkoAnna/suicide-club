import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class DrinkerQueue {
    public static void main(String[] args) {
        Queue<Integer> pl1 = new ArrayDeque<>();
        Queue<Integer> pl2 = new ArrayDeque<>();

        Scanner in = new Scanner(System.in);
        parseStr(pl1, in);
        parseStr(pl2, in);

        for (int i = 0; i < 106; i++) {
            if (pl1.isEmpty()) {
                System.out.println("second " + i);
                return;
            }
            if (pl2.isEmpty()) {
                System.out.println("first " + i);
                return;
            }
            int card1 = pl1.poll();
            int card2 = pl2.poll();
            if (card1 == card2) {
                pl1.offer(card1);
                pl2.offer(card2);
            } else if (card1 == 0 && card2 == 9) {
                pl1.offer(card1);
                pl1.offer(card2);
            } else if (card2 == 0 && card1 == 9) {
                pl2.offer(card1);
                pl2.offer(card2);
            } else if (card1 > card2) {
                pl1.offer(card1);
                pl1.offer(card2);
            } else {
                pl2.offer(card1);
                pl2.offer(card2);
            }
        }
        System.out.println("botva");

    }

    private static void parseStr(Queue<Integer> pl1, Scanner in) {
        String str = in.next();
        for (int i = 0; i < str.length(); i++) {
            pl1.offer(str.charAt(i) - '0');
        }
    }
}
