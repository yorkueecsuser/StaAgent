import java.util.Random;

class BuggyRandomGenerator {
    private Random random = new Random();
    private int n = 10;

    public int showBug() {
        int randomInt = random.nextInt();
        int modInt = randomInt % n; // BUG: RandomModInteger

        if (isUnreachable()) {
            System.out.println("Unreachable code");
        } else {
            System.out.println("Reachable code");
        }

        return modInt;
    }

    private boolean isUnreachable() {
        return false;
    }

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}