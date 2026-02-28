class MathClampBug {
    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int value = 15;
        int min = 10;
        int max = 5;
        int result = Math.clamp(value, min, max); // BUG: "Math.clamp" should be used with correct ranges

        // Mutation: Add an if statement that is always false to make it unreachable
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            // Do nothing
        }

        return result;
    }
}