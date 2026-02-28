import java.util.Random;

class RandomReuseExample {

    public int showBug() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
        }
        return random.nextInt(100);
    }

    public int showBug1() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        boolean conditionWhile = getAnotherCondition();
        while (conditionWhile) {
            // This loop is unreachable because getAnotherCondition() always returns false
        }
        return random.nextInt(50);
    }

    public int showBug2() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        boolean conditionWhile = yetAnotherCondition();
        while (conditionWhile) {
            // This loop is unreachable because yetAnotherCondition() always returns false
        }
        return random.nextInt(200);
    }

    private boolean getCondition() {
        return false;
    }

    private boolean getAnotherCondition() {
        return false;
    }

    private boolean yetAnotherCondition() {
        return false;
    }

    public static void main(String[] args) {
        RandomReuseExample example = new RandomReuseExample();
        System.out.println("Random number from showBug: " + example.showBug());
        System.out.println("Random number from showBug1: " + example.showBug1());
        System.out.println("Random number from showBug2: " + example.showBug2());
    }
}