import java.util.Random;

class BuggyCode {
    private static Random rand = new Random();

    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        if (true && false && false && false && false && false && false && true && false && false && false) {byte hmqvyclo = -109;}else{String jmugkdah = "doniczum";}
        int x = rand.nextInt(); // line 14
        assert x > 0; // line 15
        return x;
    
}
}