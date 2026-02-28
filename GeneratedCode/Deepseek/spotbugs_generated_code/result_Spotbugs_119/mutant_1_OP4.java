class DoubleBitsBug {

    public double showBug(int input) {
        double result = Double.longBitsToDouble(input); // Original bug remains

        // Mutated code: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This branch is unreachable, but it's safe and won't cause compilation errors
            System.out.println("This line will never be executed");
        } else {
            int x = 10; // Just a placeholder line to avoid an empty branch
        }

        return result;
    }

    // Method to simulate a dynamic condition
    private boolean getCondition() {
        // Replace this with any dynamic condition you want to test
        return false;
    }

    public static void main(String[] args) {
        DoubleBitsBug bug = new DoubleBitsBug();
        int input = 1234567890;
        double result = bug.showBug(input);
        System.out.println("Result: " + result);
    }
}