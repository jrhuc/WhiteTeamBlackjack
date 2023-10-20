
public class Main {
    public static void main(String[] args) {
        System.out.println(Blackjack.play(10,21));
        try{
            System.out.println(Blackjack.play(-2,3));
        } catch(Exception e){
            System.err.println(e.getMessage());
        };

        try{
            System.out.println(Blackjack.play(-2,-3));
        } catch(Exception e){
            System.err.println(e.getMessage());
        };
        System.out.println(Blackjack.play(22,23));
        System.out.println(Blackjack.play(20,18));
        System.out.println(Blackjack.play(1,22));


    }
}