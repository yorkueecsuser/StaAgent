import java.util.Random;

class RandomBug {
    public int generateRandomNumber() {
        // BUG: "Random" objects should be reused
        Random random = new Random(); // new Random object is created each time the method is called

        // Mutation: Unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because the condition is always false
            System.out.println("This line is unreachable");
        }

        return random.nextInt(100);
    }

    public int showBug() {
        return generateRandomNumber();
    }
}