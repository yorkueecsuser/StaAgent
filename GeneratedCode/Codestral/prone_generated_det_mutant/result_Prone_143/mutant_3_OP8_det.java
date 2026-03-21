import java.util.Random;

class BuggyRandomGenerator {
    private Random random = new Random();
    private int n = 10;

    public int showBug() {
        int hrcyoxpe = random.nextInt();
        int ejlkmrbb = hrcyoxpe % n; // BUG: RandomModInteger

        return ejlkmrbb;
    }

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}