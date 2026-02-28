import java.util.Random;

class RandomBug {
    public int generateRandomNumber() {
        Random random = new Random();
        int unusedVar = 10; // dead store variable
        return random.nextInt(100);
    }

    public int showBug() {
        return generateRandomNumber();
    }
}