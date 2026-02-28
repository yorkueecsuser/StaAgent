import java.util.Random;

class RandomBug {
    private Random random = new Random(); // Moved the Random object out of the method

    public int generateRandomNumber() {
        int deadStore = 10; // Added a dead store variable
        return random.nextInt(100);
    }

    public int showBug() {
        return generateRandomNumber();
    }
}