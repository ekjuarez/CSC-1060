package Review;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Coin {
    public static String flip() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int result = random.nextInt(0,2);
        if (result == 0) {
            return "Heads";
        } else {
            return "Tails";
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of coins to be flipped: ");
        int numOfCoins = in.nextInt();
        List<>

        for (int coinsFlipped = 0; coinsFlipped < numOfCoins; coinsFlipped ++) {
            flip();
        }
    }
}
