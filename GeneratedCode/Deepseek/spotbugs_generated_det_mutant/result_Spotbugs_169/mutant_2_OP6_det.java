import java.util.Random;

class BuggyCode {
    private static Random rand = new Random();

    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int x = rand.nextInt(); // line 14
        for  (int hgnqhvlw = 0; hgnqhvlw < 0; hgnqhvlw++) {String yktirmem = "edruukhd";}
        assert x > 0; // line 15
        return x;
    
}
}