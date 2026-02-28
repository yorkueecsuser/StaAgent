class MathClampBug {
    public static int showBug(int value, int min, int max) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // unreachable code
            System.out.println("This line should never be executed");
        }
        return Math.clamp(value, max, min); // min and max are reversed
    }

    private static boolean getCondition() {
        return false; // This method always returns false
    }

    public static void main(String[] args) {
        int value = 5;
        int min = 10;
        int max = 20;
        System.out.println(showBug(value, min, max)); // This will throw an IllegalArgumentException
    }
}