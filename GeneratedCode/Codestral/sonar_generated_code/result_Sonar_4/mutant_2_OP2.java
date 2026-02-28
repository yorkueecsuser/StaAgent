class MathClampBug {
    public static int showBug(int value, int min, int max) {
        // BUG: "Math.clamp" should be used with correct ranges
        int clampedValue = Math.clamp(value, max, min); // min and max are reversed
        int duplicatedClampedValue = Math.clamp(value, max, min); // duplicated assignment statement
        return clampedValue;
    }

    public static void main(String[] args) {
        int value = 5;
        int min = 10;
        int max = 20;
        System.out.println(showBug(value, min, max)); // This will throw an IllegalArgumentException
    }
}