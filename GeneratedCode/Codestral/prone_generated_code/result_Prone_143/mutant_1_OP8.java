import java.util.Random;

class BuggyRandomGenerator {
    private Random random = new Random();
    private int n = 10;

    public int showBug() {
        int r = random.nextInt(); // Renaming randomInt to r
        int modInt = r % n;

        return modInt;
    }

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}