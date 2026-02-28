import java.util.Random;

class BuggyRandomGenerator {
    private Random random = new Random();
    private int n = 10;

    public int showBug() {
        int x = random.nextInt(); // Renamed randomInt to x
        int modInt = x % n; // BUG: RandomModInteger

        return modInt;
    }

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}