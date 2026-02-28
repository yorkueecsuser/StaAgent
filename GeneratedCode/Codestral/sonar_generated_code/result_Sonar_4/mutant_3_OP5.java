class MathClampBug {
    // Method that always returns false
    public static boolean getFalse() {
        return false;
    }

    public static int showBug(int value, int min, int max) {
        // BUG: "Math.clamp" should be used with correct ranges
        int clampedValue = Math.clamp(value, max, min); // min and max are reversed

        // Adding an unreachable switch statement
        boolean shouldSwitch = getFalse();
        switch (shouldSwitch? 1 : 2) {
            case 1:
                // This code is unreachable
                System.out.println("Unreachable statement executed!");
                break;
            default:
                break;
        }

        return clampedValue;
    }

    public static void main(String[] args) {
        int value = 5;
        int min = 10;
        int max = 20;
        System.out.println(showBug(value, min, max)); // This will throw an IllegalArgumentException
    }
}