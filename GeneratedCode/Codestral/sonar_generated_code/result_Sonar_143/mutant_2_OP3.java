import java.util.Random;

class RandomBug {
    private Random random = new Random();

    public int generateRandomNumber() {
        // BUG: "Random" objects should be reused
        return random.nextInt(100);
    }

    public int showBug() {
        if (isUnreachableCondition()) {
            System.out.println("This code should never be reached");
        }
        return generateRandomNumber();
    }

    // Method added to serve as a dynamically determined condition for the unreachable if statement
    private boolean isUnreachableCondition() {
        return false;  // This condition is always false to make the if statement unreachable
    }
}