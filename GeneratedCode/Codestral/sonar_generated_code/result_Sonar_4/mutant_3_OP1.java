import java.util.Random;

class MathClampBug {
    public static int showBug(int value, int min, int max) {
        // BUG: "Math.clamp" should be used with correct ranges
        int deadStoreVar = generateRandomNumber(); // added dead store mutant
        return Math.clamp(value, max, min); // min and max are reversed
    }

    public static void main(String[] args) {
        int value = 5;
        int min = 10;
        int max = 20;
        System.out.println(showBug(value, min, max)); // This will throw an IllegalArgumentException
    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }
}