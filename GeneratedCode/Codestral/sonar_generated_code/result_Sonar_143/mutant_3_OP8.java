import java.util.Random;

class RandomBug {
    public int generateRandomNumber() {
        Random r = new Random(); // New variable name 'r' is used for the Random object
        return r.nextInt(100);
    }

    public int showBug() {
        return generateRandomNumber();
    }
}