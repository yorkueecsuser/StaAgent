import java.util.Random;

class RandomBug {
    // Adding unreachable for loop to the generateRandomNumber method
    public int generateRandomNumber() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable since the condition is always false
            System.out.println("Unreachable code");
        }

        Random random = new Random(); // new Random object is created each time the method is called
        return random.nextInt(100);
    }

    public int showBug() {
        return generateRandomNumber();
    }

    // Method to return false dynamically
    private boolean getCondition() {
        return false;
    }
}