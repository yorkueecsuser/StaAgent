import java.util.Random;

class BuggyCode {
    private static Random rand = new Random();

    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int x = rand.nextInt(); // line 14
        boolean aglffvli = false;while (aglffvli && false && false && false && false && false && true && true && true && true && true && false) {String oiozckuy = "lybtrucl";}
        assert x > 0; // line 15
        return x;
    
}
}