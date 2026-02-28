import java.util.Random;

class RandomReuseExample {

    public int showBug() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
        return random.nextInt(100);
    }

    public int showBug1() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        boolean conditionWhile1 = getCondition1();
        while (conditionWhile1) {
            // Unreachable code
        }
        return random.nextInt(50);
    }

    public int showBug2() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        boolean conditionWhile2 = getCondition2();
        while (conditionWhile2) {
            // Unreachable code
        }
        return random.nextInt(200);
    }

    private boolean getCondition() {
        return false;
    }

    private boolean getCondition1() {
        return false;
    }

    private boolean getCondition2() {
        return false;
    }

    public static void main(String[] args) {
        RandomReuseExample example = new RandomReuseExample();
        System.out.println("Random number from showBug: " + example.showBug());
        System.out.println("Random number from showBug1: " + example.showBug1());
        System.out.println("Random number from showBug2: " + example.showBug2());
    }
}