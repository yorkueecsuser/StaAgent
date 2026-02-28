import java.util.Random;

class BuggyRandomGenerator {
    private Random random = new Random();
    private int n = 10;

    private boolean alwaysFalse() {
        return false;
    }

    public int showBug() {
        int randomInt = random.nextInt();
        // Adding unreachable for loop
        for (int i = 0; alwaysFalse(); i++) {
            System.out.println("Unreachable code");
        }
        int modInt = randomInt % n;

        return modInt;
    }

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}