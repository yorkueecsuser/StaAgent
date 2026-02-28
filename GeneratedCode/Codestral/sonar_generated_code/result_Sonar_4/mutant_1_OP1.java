import java.util.Random;

class MathClampBug {
    public static int showBug(int value, int min, int max) {
        // Added dead store mutant
        int unusedVariable = generateRandomInt();

        // BUG: "Math.clamp" should be used with correct ranges
        return Math.clamp(value, max, min); // min and max are reversed
    }

    // Method to generate a random integer for the dead store mutant
    private static int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public static void main(String[] args) {
        int value = 5;
        int min = 10;
        int max = 20;
        System.out.println(showBug(value, min, max)); // This will throw an IllegalArgumentException
    }
}