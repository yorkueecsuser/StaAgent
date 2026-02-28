import java.util.Random;

class RandomBug {
    public int generateRandomNumber() {
        Random random = new Random();
        Random randomCopy = new Random(random.nextInt()); // Duplicated line
        return random.nextInt(100);
    }

    public int showBug() {
        return generateRandomNumber();
    }
}