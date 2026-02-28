import java.util.Random;

class RandomBug {
    private Random random = new Random(); // Random object is created once

    public int generateRandomNumber() {
        return random.nextInt(100);
    }

    public int showBug() {
        // Adding unreachable if-else branch
        boolean shouldNotRun = getCondition();
        if (shouldNotRun) {
            // This code is unreachable
            System.out.println("This line should not be executed.");
        } else {
            // This is the original code
            return generateRandomNumber();
        }
    }

    public boolean getCondition() {
        // This method always returns false to make the if-branch unreachable
        return false;
    }
}