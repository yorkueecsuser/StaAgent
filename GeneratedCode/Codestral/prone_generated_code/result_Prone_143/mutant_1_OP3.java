import java.util.Random;

class BuggyRandomGenerator {
    private Random random = new Random();
    private int n = 10;

    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        int randomInt = random.nextInt();
        int modInt = randomInt % n;

        if (getFalseCondition()) {
            // Unreachable if branch
            System.out.println("This line should never be executed.");
        }

        return modInt;
    }

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}