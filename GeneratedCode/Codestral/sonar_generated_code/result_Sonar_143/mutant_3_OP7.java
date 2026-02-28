import java.util.Random;

class RandomBug {
    public int generateRandomNumber() {
        Random random = new Random();
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This loop is unreachable
            System.out.println("This line should never execute.");
        }
        return random.nextInt(100);
    }

    public int showBug() {
        return generateRandomNumber();
    }
}