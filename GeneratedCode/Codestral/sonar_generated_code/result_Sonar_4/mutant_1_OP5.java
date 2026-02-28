class MathClampBug {
    public static int showBug(int value, int min, int max) {
        // BUG: "Math.clamp" should be used with correct ranges
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) { // This switch statement is unreachable as the condition will always be false
            case 1:
                System.out.println("This is an unreachable block");
                break;
        }
        return Math.clamp(value, max, min); // min and max are reversed
    }

    private static int getUnreachableCondition() {
        return -1; // Always returns a value that will not match any case in the switch statement
    }

    public static void main(String[] args) {
        int value = 5;
        int min = 10;
        int max = 20;
        System.out.println(showBug(value, min, max)); // This will throw an IllegalArgumentException
    }
}