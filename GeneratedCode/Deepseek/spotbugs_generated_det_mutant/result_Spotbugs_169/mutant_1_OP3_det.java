import java.util.Random;

class BuggyCode {
    private static Random rand = new Random();

    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int x = rand.nextInt(); // line 14
        if (false && false && false && true && false && false && false && false && false && false && false) {long eadrrxme = -673426544;}
        assert x > 0; // line 15
        return x;
    
}
}