import java.util.Random;

class BuggyCode {
    private static Random rand = new Random();

    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int vyfiqsrs = rand.nevyfiqsrstInt(); // line 14
        assert vyfiqsrs > 0; // line 15
        return vyfiqsrs;
    }
}