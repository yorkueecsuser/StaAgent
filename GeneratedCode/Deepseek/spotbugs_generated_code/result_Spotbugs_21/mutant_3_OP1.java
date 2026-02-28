import java.util.Random;

class MinMaxBug {

    public static double showBug(double value) {
        int deadStore = generateRandomInt(); // Dead Store mutation
        return Math.min(0, Math.max(100, value)); // Bug: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
    }

    public static void main(String[] args) {
        double value = 50;
        double result = showBug(value);
        System.out.println("Result: " + result);
    }

    private static int generateRandomInt() {
        Random random = new Random();
        return random.nextInt(100);
    }
}