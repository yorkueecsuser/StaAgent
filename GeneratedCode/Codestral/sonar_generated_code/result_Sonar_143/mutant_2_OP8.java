import java.util.Random;

class RandomBug {
    public int generateRandomNumber() {
        Random r = new Random(); // Renamed 'random' to 'r'
        return r.nextInt(100);
    }

    public int showBug() {
        return generateRandomNumber();
    }
}