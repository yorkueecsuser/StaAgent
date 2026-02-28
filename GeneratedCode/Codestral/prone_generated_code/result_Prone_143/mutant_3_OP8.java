import java.util.Random;

class BuggyRandomGenerator {
    private Random r = new Random(); // Mutated variable name from 'random' to 'r'
    private int m = 10; // Mutated variable name from 'n' to'm'

    public int showBug() {
        int randomInt = r.nextInt(); // Using the mutated variable name 'r'
        int modInt = randomInt % m; // Using the mutated variable name'm'

        return modInt;
    }

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}