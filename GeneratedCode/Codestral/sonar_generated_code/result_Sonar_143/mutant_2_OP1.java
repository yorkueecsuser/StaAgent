import java.util.Random;

class RandomBug {
    public int generateRandomNumber() {
        Random random = new Random();
        int deadStoreVar = 10; // Dead store mutant: Unused variable
        return random.nextInt(100);
    }

    public int showBug() {
        return generateRandomNumber();
    }
}