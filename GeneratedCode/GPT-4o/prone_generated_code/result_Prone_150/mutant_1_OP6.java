class SelfComparisonExample {

    public int showBug(int value) {
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);

        // Unreachable for loop mutation
        boolean conditionFor = getUnreachableCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable.");
        }
    }

    // Method to ensure the loop condition is not a compile-time constant
    public static boolean getUnreachableCondition() {
        return false;
    }
}