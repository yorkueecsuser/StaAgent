import java.util.Random;

class BuggyCode {
    private static Random rand = new Random();

    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        if (false && false && true && false && true && false && false && false && false && false && false) {long ibvpukny = 504820405;}else{short qoqsjxwp = 1718;}
        int x = rand.nextInt(); // line 14
        assert x > 0; // line 15
        return x;
    
}
}