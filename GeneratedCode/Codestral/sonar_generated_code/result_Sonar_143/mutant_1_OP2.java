import java.util.Random;

class RandomBug {
    public int generateRandomNumber() {
        Random random = new Random();
        // Mutant code: Duplicate above assignment statement
        Random randomDuplicate = new Random();
        return random.nextInt(100);
    }

    public int showBug() {
        return generateRandomNumber();
    }
}