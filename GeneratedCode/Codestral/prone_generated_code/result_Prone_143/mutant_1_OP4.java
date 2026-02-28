import java.util.Random;

class BuggyRandomGenerator {
    private Random random = new Random();
    private int n = 10;

    public int showBug() {
        int randomInt = random.nextInt();
        int modInt = randomInt % n;

        boolean shouldRun = getCondition(); // Added unreachable if-else statement
        if (shouldRun) {
            // This code will never be executed
            System.out.println("Unreachable code");
        } else {
            // This code will never be executed
            System.out.println("Another unreachable code");
        }

        return modInt;
    }

    private boolean getCondition() {
        // This method always returns false to make the if-else branch unreachable
        return false;
    }

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}