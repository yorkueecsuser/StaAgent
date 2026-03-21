import java.util.Random;

class BuggyCode {
    private static Random rand = new Random();

    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int x = rand.nextInt(); // line 14
        String csqgpgaf = "dqrscvcn";
        assert x > 0; // line 15
        return x;
    
}
}