import java.util.Random;

class RandomReuseExample {

    public int showBug() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        return random.nextInt(100);

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case in showBug");
                break;
        }
    }

    public int showBug1() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        return random.nextInt(50);

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 2) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case in showBug1");
                break;
        }
    }

    public int showBug2() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        return random.nextInt(200);

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 3) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case in showBug2");
                break;
        }
    }

    public static void main(String[] args) {
        RandomReuseExample example = new RandomReuseExample();
        System.out.println("Random number from showBug: " + example.showBug());
        System.out.println("Random number from showBug1: " + example.showBug1());
        System.out.println("Random number from showBug2: " + example.showBug2());
    }

    private boolean getCondition() {
        // This method always returns false, making the switch cases unreachable
        return false;
    }
}