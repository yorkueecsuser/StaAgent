import java.util.Random;

class RandomReuseExample {

    public int showBug() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is reachable if shouldRun is true
            System.out.println("This is a reachable block in showBug.");
        } else {
            // This block is unreachable if shouldRun is false
            System.out.println("This is an unreachable block in showBug.");
        }
        return random.nextInt(100);
    }

    public int showBug1() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is reachable if shouldRun is true
            System.out.println("This is a reachable block in showBug1.");
        } else {
            // This block is unreachable if shouldRun is false
            System.out.println("This is an unreachable block in showBug1.");
        }
        return random.nextInt(50);
    }

    public int showBug2() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is reachable if shouldRun is true
            System.out.println("This is a reachable block in showBug2.");
        } else {
            // This block is unreachable if shouldRun is false
            System.out.println("This is an unreachable block in showBug2.");
        }
        return random.nextInt(200);
    }

    private boolean getCondition() {
        // This method returns a condition that can be used to determine reachability
        return false; // In practice, this could be more dynamic
    }

    public static void main(String[] args) {
        RandomReuseExample example = new RandomReuseExample();
        System.out.println("Random number from showBug: " + example.showBug());
        System.out.println("Random number from showBug1: " + example.showBug1());
        System.out.println("Random number from showBug2: " + example.showBug2());
    }
}