import java.util.Random;

class BuggyCode {
    private static Random rand = new Random();

    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int x = rand.nextInt(); // line 14
        boolean pvyrjjez = false;while (pvyrjjez && false && true && false && false && false && false && true && false && false && false && false) {double hyeaghzn = 458930713;}
        assert x > 0; // line 15
        return x;
    
}
}