import java.util.Random;

class BuggyRandomGenerator {
    private Random random = new Random();
    private int n = 10;

    public int showBug() {
        int randomInt = random.nextInt();
        boolean unreachableCondition = alwaysFalse(); // Inserted unreachable for loop
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This loop is unreachable");
        }
        int modInt = randomInt % n; // BUG: RandomModInteger

        return modInt;
    }

    private boolean alwaysFalse() { // Method to always return false
        return false;
    }

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}