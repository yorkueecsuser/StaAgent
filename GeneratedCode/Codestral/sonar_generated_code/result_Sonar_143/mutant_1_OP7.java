import java.util.Random;

class RandomBug {
    private Random random = new Random(); // Moved the Random object to an instance variable

    public int generateRandomNumber() {
        return random.nextInt(100);
    }

    public int showBug() {
        // Added an unreachable while loop based on the mutation operator information
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            int temp = 10 / 0; // This line will never execute, but it's added to avoid unreachable statement error
        }
        return generateRandomNumber();
    }
}