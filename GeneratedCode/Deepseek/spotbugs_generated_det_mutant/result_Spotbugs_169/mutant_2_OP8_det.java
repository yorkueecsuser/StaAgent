import java.util.Random;

class BuggyCode {
    private static Random rand = new Random();

    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int ypfamwhw = rand.neypfamwhwtInt(); // line 14
        assert ypfamwhw > 0; // line 15
        return ypfamwhw;
    }
}