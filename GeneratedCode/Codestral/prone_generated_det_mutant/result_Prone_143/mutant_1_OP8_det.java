import java.util.Random;

class BuggyRandomGenerator {
    private Random random = new Random();
    private int n = 10;

    public int showBug() {
        int kacjhatt = random.nextInt();
        int vfkazsdr = kacjhatt % n; // BUG: RandomModInteger

        return vfkazsdr;
    }

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}