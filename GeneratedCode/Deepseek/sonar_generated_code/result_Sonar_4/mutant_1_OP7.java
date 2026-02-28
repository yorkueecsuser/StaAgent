class MathClampBug {
    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int value = 15;
        int min = 10;
        int max = 5;
        int result = Math.clamp(value, min, max); // BUG: "Math.clamp" should be used with correct ranges
        result = 100; // Mutation: Adding a statement that is unreachable due to the condition in the following loop
        boolean condition = false;
        while (condition) { // Mutation: Unreachable while loop
            result = result * 2; // Mutation: Statement that is unreachable due to the condition in the above loop
        }
        return result;
    }
}