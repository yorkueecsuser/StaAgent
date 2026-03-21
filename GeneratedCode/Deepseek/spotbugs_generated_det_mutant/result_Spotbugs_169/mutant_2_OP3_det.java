import java.util.Random;

class BuggyCode {
    private static Random rand = new Random();

    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int x = rand.nextInt(); // line 14
        if (true && false && true && false && true && true && true && true && true && false && false) {String yzffbmxs = "bxopwvkj";}
        assert x > 0; // line 15
        return x;
    
}
}