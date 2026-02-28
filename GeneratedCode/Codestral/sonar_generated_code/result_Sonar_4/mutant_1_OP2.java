class MathClampBug {
    public static int showBug(int value, int min, int max) {
        // Duplicate assignment statements
        int valueDuplicate = value;
        int minDuplicate = min;
        int maxDuplicate = max;

        // BUG: "Math.clamp" should be used with correct ranges
        return Math.clamp(value, max, min); // min and max are reversed
    }

    public static void main(String[] args) {
        int value = 5;
        int valueDuplicate = value; // Duplicate assignment statement
        int min = 10;
        int minDuplicate = min; // Duplicate assignment statement
        int max = 20;
        int maxDuplicate = max; // Duplicate assignment statement

        System.out.println(showBug(value, min, max)); // This will throw an IllegalArgumentException
    }
}