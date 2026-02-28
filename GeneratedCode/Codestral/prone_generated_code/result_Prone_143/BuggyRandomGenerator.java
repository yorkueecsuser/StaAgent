import java.util.Random;

class BuggyRandomGenerator {
    private Random random = new Random();
    private int n = 10;

    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug() {
        int randomInt = random.nextInt();
        while (getUnreachableCondition()) { // Unreachable while loop mutant
            System.out.println("This loop will never be reached");
        }
        int modInt = randomInt % n;
        return modInt;
    }

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}