import java.util.Random;

class RandomBug {
    private static boolean getUnreachableCondition() {
        return false;
    }

    public int generateRandomNumber() {
        Random random = new Random();
        if (getUnreachableCondition()) {
            // Unreachable code
            System.out.println("This code block is unreachable.");
        } else {
            return random.nextInt(100);
        }
    }

    public int showBug() {
        return generateRandomNumber();
    }
}