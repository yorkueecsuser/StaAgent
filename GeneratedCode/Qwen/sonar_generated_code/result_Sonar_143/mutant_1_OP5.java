import java.util.Random;

class RandomReuseExample {

    public int showBug() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        return random.nextInt(100);

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                System.out.println("This is unreachable code.");
                break;
            default:
                System.out.println("This is also unreachable code.");
                break;
        }
    }

    public int showBug1() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        return random.nextInt(50);

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                System.out.println("This is unreachable code in showBug1.");
                break;
            default:
                System.out.println("This is also unreachable code in showBug1.");
                break;
        }
    }

    public int showBug2() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        return random.nextInt(200);

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                System.out.println("This is unreachable code in showBug2.");
                break;
            default:
                System.out.println("This is also unreachable code in showBug2.");
                break;
        }
    }

    public static void main(String[] args) {
        RandomReuseExample example = new RandomReuseExample();
        System.out.println("Random number from showBug: " + example.showBug());
        System.out.println("Random number from showBug1: " + example.showBug1());
        System.out.println("Random number from showBug2: " + example.showBug2());

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                System.out.println("This is unreachable code in main.");
                break;
            default:
                System.out.println("This is also unreachable code in main.");
                break;
        }
    }

    private static boolean getCondition() {
        return false; // This method returns false, but the switch condition is dynamically determined
    }
}