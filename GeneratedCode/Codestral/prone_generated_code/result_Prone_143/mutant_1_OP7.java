import java.util.Random;

class BuggyRandomGenerator {
    private Random random = new Random();
    private int n = 10;

    public int showBug() {
        int randomInt = random.nextInt();
        boolean conditionWhile = false; // Unreachable loop condition
        while (conditionWhile) {
            // code inside this loop will never be executed
        }
        int modInt = randomInt % n; // BUG: RandomModInteger

        return modInt;
    }

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}