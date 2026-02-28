import java.util.Random;

class RandomReuseExample {

    public int showBug() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        boolean shouldRun = getRandomCondition(); // Dynamically determined condition
        if (shouldRun) {
            // Some code that might run
        } else {
            // Unreachable code due to dynamically determined condition
        }
        return random.nextInt(100);
    }

    public int showBug1() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        boolean shouldRun = getRandomCondition(); // Dynamically determined condition
        if (shouldRun) {
            // Some code that might run
        } else {
            // Unreachable code due to dynamically determined condition
        }
        return random.nextInt(50);
    }

    public int showBug2() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        boolean shouldRun = getRandomCondition(); // Dynamically determined condition
        if (shouldRun) {
            // Some code that might run
        } else {
            // Unreachable code due to dynamically determined condition
        }
        return random.nextInt(200);
    }

    public static void main(String[] args) {
        RandomReuseExample example = new RandomReuseExample();
        System.out.println("Random number from showBug: " + example.showBug());
        System.out.println("Random number from showBug1: " + example.showBug1());
        System.out.println("Random number from showBug2: " + example.showBug2());
    }

    private boolean getRandomCondition() {
        // This method can be implemented to return a dynamically determined condition
        return false; // For demonstration purposes, it returns false, but in practice, it could return a random boolean
    }
}