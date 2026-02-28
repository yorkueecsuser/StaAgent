class MathClampBug {
    public static int showBug(int value, int min, int max) {
        // BUG: "Math.clamp" should be used with correct ranges
        if (getCondition()) {
            // Unreachable if statement
            System.out.println("This code is unreachable.");
        }
        return Math.clamp(value, max, min); // min and max are reversed
    }

    public static boolean getCondition() {
        return false; // Always returns false to make the if statement unreachable
    }

    public static void main(String[] args) {
        int value = 5;
        int min = 10;
        int max = 20;
        System.out.println(showBug(value, min, max)); // This will throw an IllegalArgumentException
    }
}