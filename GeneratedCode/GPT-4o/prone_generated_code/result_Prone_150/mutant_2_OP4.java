class SelfComparisonExample {

    public int showBug(int value) {
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
        
        // Mutation: Unreachable if-else statement
        boolean condition = getRuntimeCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This code is also unreachable.");
        }
    }

    // Helper method to get a runtime condition
    private boolean getRuntimeCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);
    }
}