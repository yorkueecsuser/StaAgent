class SelfComparisonExample {

    public int showBug(int value) {
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);

        // Introduce a mutant with an unreachable if-else statement
        boolean isConditionMet = getCondition();
        if (isConditionMet) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This is the else branch.");
        }
    }

    // Method that always returns false to simulate an unreachable if condition
    private static boolean getCondition() {
        return false;
    }
}