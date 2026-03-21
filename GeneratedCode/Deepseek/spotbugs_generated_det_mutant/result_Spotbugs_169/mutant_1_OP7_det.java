import java.util.Random;

class BuggyCode {
    private static Random rand = new Random();

    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int x = rand.nextInt(); // line 14
        boolean tlqoybqq = false;while (tlqoybqq && false && false && false && true && true && false && false && false && false && false && false) {long bfdjxaof = 351045486;}
        assert x > 0; // line 15
        return x;
    
}
}