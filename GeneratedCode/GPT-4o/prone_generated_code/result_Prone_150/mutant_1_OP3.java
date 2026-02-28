class SelfComparisonExample {

    public int showBug(int value) {
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);

        // Mutation: Unreachable if statement
        // Use a non-final variable to ensure the condition is not a compile-time constant
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This will never be printed.");
        }
    }

    // Method to provide a runtime condition that is always false
    private static boolean getUnreachableCondition() {
        return false;
    }
}