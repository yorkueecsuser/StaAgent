import java.util.Random;

class RandomBug {
    public int generateRandomNumber() {
        Random random = new Random();
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code will never be executed");
        }
        return random.nextInt(100);
    }

    public int showBug() {
        return generateRandomNumber();
    }
}