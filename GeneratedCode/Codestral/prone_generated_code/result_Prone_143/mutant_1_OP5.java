import java.util.Random;

class BuggyRandomGenerator {
    private Random random = new Random();
    private int n = 10;

    public int showBug() {
        int randomInt = random.nextInt();
        int modInt = randomInt % n; // BUG: RandomModInteger

        // Unreachable switch statement mutation
        boolean shouldRun = getCondition();
        if (shouldRun) {
            int value = 0;
            switch (value) {
                case 1:
                    System.out.println("Unreachable code executed!");
                    break;
            }
        }

        return modInt;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}