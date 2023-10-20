/**
 * This class implements the basic version of Blackjack.
 */
public class Blackjack {
    public static int play(int a, int b) {

            if (a > 0 && b > 0) {
                if (a > 21 && b > 21) {
                    return 0;
                } else if (a < 21 && b < 21) {
                    return Math.max(a, b);
                }
                else if (b>21){
                    return a;
                }
                else {
                    return b;
                }

            } else {
                throw new IllegalArgumentException("Invalid (Negative/Zero) integer inputted");

            }

    }
}
