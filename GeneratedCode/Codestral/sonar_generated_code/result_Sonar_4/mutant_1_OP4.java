class MathClampBug {
    public static int showBug(int value, int min, int max) {
        // BUG: "Math.clamp" should be used with correct ranges
        if (getCondition()) {
            // Unreachable if-else statement
            return Math.clamp(value, max, min); // min and max are reversed
        } else {
            // This else block is unreachable
            System.out.println("This block should never be executed.");
            return 0;
        }
    }

    public static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        int value = 5;
        int min = 10;
        int max = 20;
        System.out.println(showBug(value, min, max)); // This will throw an IllegalArgumentException
    }
}