class MathClampBug {
    private static boolean getUnreachableCondition() {
        return false;    // This method always returns false, making the if-else branch unreachable.
    }

    public static int showBug(int value, int min, int max) {
        if (getUnreachableCondition()) {    // Unreachable if-else block inserted here.
            System.out.println("Unreachable code executed.");
        } else {
            // Original code remains unchanged.
            return Math.clamp(value, max, min); // min and max are reversed
        }
    }

    public static void main(String[] args) {
        int value = 5;
        int min = 10;
        int max = 20;
        System.out.println(showBug(value, min, max)); // This will throw an IllegalArgumentException
    }
}