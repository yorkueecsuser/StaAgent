import java.util.Random;

class BuggyRandomGenerator {
    private Random random = new Random();
    private int n = 10;

    public int showBug() {
        int randomInt = random.nextInt();
        int modInt = randomInt % n; // BUG: RandomModInteger

        if (getFalseCondition()) { // Unreachable if-else statement
            System.out.println("This branch is unreachable.");
        } else {
            // Original code remains unchanged
        }

        return modInt;
    }

    private boolean getFalseCondition() {
        return false; // Always returns false to make the branch unreachable
    }

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}