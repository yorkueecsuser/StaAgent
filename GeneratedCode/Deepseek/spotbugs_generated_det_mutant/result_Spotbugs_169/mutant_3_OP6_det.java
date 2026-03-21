import java.util.Random;

class BuggyCode {
    private static Random rand = new Random();

    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        for  (int diopydyp = 0; diopydyp < 0; diopydyp++) {short oknjsuzp = 12;}
        int x = rand.nextInt(); // line 14
        assert x > 0; // line 15
        return x;
    
}
}