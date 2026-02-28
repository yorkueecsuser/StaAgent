import java.util.Random;

class BuggyRandomGenerator {
    private Random random = new Random();
    private int n = 10;

    // Add a method to return a false condition
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        int randomInt = random.nextInt();
        // Add an unreachable for loop
        for (int i = 0; getFalseCondition(); i++) {
            // This loop will never execute
        }
        int modInt = randomInt % n; // BUG: RandomModInteger

        return modInt;
    }

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}