import java.util.Random;

class RandomBug {
    public int generateRandomNumber() {
        Random random = new Random(); // original line
        Random anotherRandom = new Random(); // mutant: duplicate the assignment statement
        return random.nextInt(100);
    }

    public int showBug() {
        return generateRandomNumber();
    }
}