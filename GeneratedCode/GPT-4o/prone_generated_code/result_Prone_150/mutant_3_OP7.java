class SelfComparisonExample {

    public int showBug(int value) {
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);

        // Inserting unreachable while loop
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            System.out.println("This will never be printed.");
        }
    }

    // Method to return a false condition, ensuring the while loop is unreachable
    public static boolean getFalseCondition() {
        return false;
    }
}