import java.util.Random;

class BuggyRandomGenerator {
    private Random random = new Random();
    private int n = 10;

    // Method to return a dynamically determined value that is always false
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        int randomInt = random.nextInt();
        int modInt = randomInt % n; // BUG: RandomModInteger

        // Insert unreachable if branch
        boolean falseCondition = getFalseCondition();
        if (falseCondition) {
            System.out.println("Unreachable code executed");
        }

        return modInt;
    }

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}