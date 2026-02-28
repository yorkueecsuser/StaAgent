import java.util.Random;

class RandomReuseExample {

    public int showBug() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        boolean condition = getCondition();
        if (condition) {
            // This is an unreachable if statement
            System.out.println("This is an unreachable statement in showBug.");
        }
        return random.nextInt(100);
    }

    public int showBug1() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        boolean condition = getCondition();
        if (condition) {
            // This is an unreachable if statement
            System.out.println("This is an unreachable statement in showBug1.");
        }
        return random.nextInt(50);
    }

    public int showBug2() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        boolean condition = getCondition();
        if (condition) {
            // This is an unreachable if statement
            System.out.println("This is an unreachable statement in showBug2.");
        }
        return random.nextInt(200);
    }

    private boolean getCondition() {
        // This method returns a condition that is always false at runtime
        return false;
    }

    public static void main(String[] args) {
        RandomReuseExample example = new RandomReuseExample();
        System.out.println("Random number from showBug: " + example.showBug());
        System.out.println("Random number from showBug1: " + example.showBug1());
        System.out.println("Random number from showBug2: " + example.showBug2());
    }
}