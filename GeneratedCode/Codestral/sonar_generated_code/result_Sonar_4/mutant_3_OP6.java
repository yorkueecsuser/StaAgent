class MathClampBug {
    public static int showBug(int value, int min, int max) {
        // BUG: "Math.clamp" should be used with correct ranges
        boolean condition = getCondition();
        for (int i = 0; condition; i++) { // Unreachable for loop
            System.out.println("This loop is unreachable");
        }
        return Math.clamp(value, max, min); // min and max are reversed
    }

    private static boolean getCondition() {
        return false; // The condition is always false to make the loop unreachable
    }

    public static void main(String[] args) {
        int value = 5;
        int min = 10;
        int max = 20;
        System.out.println(showBug(value, min, max)); // This will throw an IllegalArgumentException
    }
}