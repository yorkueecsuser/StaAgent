import java.util.Random;

class BuggyRandomGenerator {
    private Random random = new Random();
    private int n = 10;

    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug() {
        int randomInt = random.nextInt();
        // Mutation: Unreachable while loop
        while (getUnreachableCondition()) {
            System.out.println("This line will never be executed");
        }
        int modInt = randomInt % n; // BUG: RandomModInteger

        return modInt;
    }

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}