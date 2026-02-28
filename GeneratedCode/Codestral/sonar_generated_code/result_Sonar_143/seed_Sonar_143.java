import java.util.Random;

class RandomBug {
    public int generateRandomNumber() {
        // BUG: "Random" objects should be reused
        Random random = new Random(); // new Random object is created each time the method is called
        return random.nextInt(100);
    }

    public int showBug() {
        return generateRandomNumber();
    }
}