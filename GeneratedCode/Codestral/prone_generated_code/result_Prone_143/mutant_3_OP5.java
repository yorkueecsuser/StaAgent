import java.util.Random;

class BuggyRandomGenerator {
    private Random random = new Random();
    private int n = 10;

    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        int randomInt = random.nextInt();
        int modInt = randomInt % n; // BUG: RandomModInteger

        // Added mutant code
        int switchValue = getUnusedValue();
        if (getFalseCondition()) {
            switch (switchValue) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }

        return modInt;
    }

    private int getUnusedValue() {
        return -1;
    }

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}