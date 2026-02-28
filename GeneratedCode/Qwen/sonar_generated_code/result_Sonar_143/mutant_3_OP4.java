import java.util.Random;

class RandomReuseExample {

    public int showBug() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        return random.nextInt(100);

        // Mutant: Unreachable if-else statement
        boolean shouldRun = false;
        if (shouldRun) {
            System.out.println("This is an unreachable if block.");
        } else {
            System.out.println("This is an unreachable else block.");
        }
    }

    public int showBug1() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        return random.nextInt(50);

        // Mutant: Unreachable if-else statement
        boolean shouldRun = false;
        if (shouldRun) {
            System.out.println("This is another unreachable if block.");
        } else {
            System.out.println("This is another unreachable else block.");
        }
    }

    public int showBug2() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        return random.nextInt(200);

        // Mutant: Unreachable if-else statement
        boolean shouldRun = false;
        if (shouldRun) {
            System.out.println("Yet another unreachable if block.");
        } else {
            System.out.println("Yet another unreachable else block.");
        }
    }

    public static void main(String[] args) {
        RandomReuseExample example = new RandomReuseExample();
        System.out.println("Random number from showBug: " + example.showBug());
        System.out.println("Random number from showBug1: " + example.showBug1());
        System.out.println("Random number from showBug2: " + example.showBug2());
    }
}