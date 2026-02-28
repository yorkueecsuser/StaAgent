import java.util.Random;

class RandomBug {
    private static final Random random = new Random(); // Random object is now reused

    public int generateRandomNumber() {
        return random.nextInt(100);
    }

    public int showBug() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable branch
            throw new RuntimeException("Unreachable code reached");
        } else {
            return generateRandomNumber();
        }
    }

    private boolean getCondition() {
        return false; // This method call makes the if branch unreachable
    }
}