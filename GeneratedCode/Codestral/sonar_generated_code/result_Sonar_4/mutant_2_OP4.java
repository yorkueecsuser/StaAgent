class MathClampBug {
    public static int showBug(int value, int min, int max) {
        // Bug: "Math.clamp" should be used with correct ranges
        int result = Math.clamp(value, max, min); // min and max are reversed

        // Mutant: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            throw new RuntimeException("This line should never be reached");
        } else {
            System.out.println("This is an unreachable branch");
        }

        return result;
    }

    public static boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        int value = 5;
        int min = 10;
        int max = 20;
        System.out.println(showBug(value, min, max));
    }
}