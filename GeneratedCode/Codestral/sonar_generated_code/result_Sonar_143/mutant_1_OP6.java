import java.util.Random;

class RandomBug {
    private Random random = new Random(); // Moved the Random object creation here to adhere to the original code

    public int generateRandomNumber() {
        boolean condition = false;
        for (int i = 0; condition; i++) { // Unreachable for loop added here, condition is always false
            System.out.println("This line will never be executed");
        }
        return random.nextInt(100);
    }

    public int showBug() {
        return generateRandomNumber();
    }
}