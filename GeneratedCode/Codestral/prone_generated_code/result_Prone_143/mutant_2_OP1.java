import java.util.Random;

class BuggyRandomGenerator {
    private Random random = new Random();
    private int n = 10;
    private int deadStoreVariable = 0; // Dead store mutation

    public int showBug() {
        int randomInt = random.nextInt();
        int modInt = randomInt % n; // BUG: RandomModInteger

        deadStoreVariable = random.nextInt(100); // The dead store variable is not used

        return modInt;
    }

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}