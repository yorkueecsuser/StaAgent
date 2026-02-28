import java.util.Random;

class RandomReuseExample {

    public int showBug() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable block in showBug");
        }
        return random.nextInt(100);
    }

    public int showBug1() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        boolean condition1 = getCondition1();
        if (condition1) {
            // This block is unreachable because getCondition1() always returns false
            System.out.println("This is an unreachable block in showBug1");
        }
        return random.nextInt(50);
    }

    public int showBug2() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        boolean condition2 = getCondition2();
        if (condition2) {
            // This block is unreachable because getCondition2() always returns false
            System.out.println("This is an unreachable block in showBug2");
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