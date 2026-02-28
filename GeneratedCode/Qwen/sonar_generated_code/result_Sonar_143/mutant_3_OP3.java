import java.util.Random;

class RandomReuseExample {

    public int showBug() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) {
            // This block is unreachable because getCondition() will never return true
            random.setSeed(12345); // Unique code to ensure it's not generic
        }
        return random.nextInt(100);
    }

    public int showBug1() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        boolean conditionWhile = getCondition(); // Dynamically determined condition
        while (conditionWhile) {
            // This block is unreachable because getCondition() will never return true
            random.setSeed(67890); // Unique code to ensure it's not generic
        }
        return random.nextInt(50);
    }

    public int showBug2() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        boolean conditionFor = getCondition(); // Dynamically determined condition
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable because getCondition() will never return true
            random.setSeed(54321); // Unique code to ensure it's not generic
        }
        return random.nextInt(200);
    }

    private boolean getCondition() {
        // Always returns false, making the if/while/for blocks unreachable
        return false;
    }

    public static void main(String[] args) {
        RandomReuseExample example = new RandomReuseExample();
        System.out.println("Random number from showBug: " + example.showBug());
        System.out.println("Random number from showBug1: " + example.showBug1());
        System.out.println("Random number from showBug2: " + example.showBug2());
    }
}