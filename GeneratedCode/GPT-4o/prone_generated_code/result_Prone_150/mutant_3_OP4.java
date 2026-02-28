class SelfComparisonExample {

    public int showBug(int value) {
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison

        // Adding an unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is intended to be unreachable
            System.out.println("This block is unreachable.");
        } else {
            // This block is also intended to be unreachable
            System.out.println("This else block is unreachable.");
        }
    }

    // Method to provide a non-final variable for the unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);
    }
}