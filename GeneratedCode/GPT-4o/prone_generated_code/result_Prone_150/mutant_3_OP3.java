class SelfComparisonExample {

    public int showBug(int value) {
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
    }

    // Method to simulate a dynamic condition that always returns false
    private boolean getFalseCondition() {
        return valueOfFalse();
    }

    // Helper method that returns false
    private boolean valueOfFalse() {
        return false;
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        
        // Unreachable if statement introduced
        if (example.getFalseCondition()) {
            System.out.println("This line is unreachable.");
        }
        
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);
    }
}