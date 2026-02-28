import java.util.Random;

class BuggyRandomGenerator {
    private Random random = new Random();
    private int n = 10;

    private int getUnreachableValue() {
        return -1;
    }

    public int showBug() {
        int randomInt = random.nextInt();
        int modInt = randomInt % n; // BUG: RandomModInteger

        // Inserted Unreachable switch statement
        switch (getUnreachableValue()) {
            case 1:
                System.out.println("This is unreachable");
                break;
        }

        return modInt;
    }

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}