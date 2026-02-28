import java.util.Random;

class RandomBug {
    private Random random = new Random();

    public int generateRandomNumber() {
        // BUG: "Random" objects should be reused
        // Mutant code added here
        if (isUnreachableCondition()) {
            return random.nextInt(200);
        }
        return random.nextInt(100);
    }

    public int showBug() {
        return generateRandomNumber();
    }

    private boolean isUnreachableCondition() {
        // This method will always return false to ensure the if statement is unreachable
        return false;
    }
}