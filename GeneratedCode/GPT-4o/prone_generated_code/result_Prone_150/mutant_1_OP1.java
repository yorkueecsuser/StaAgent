class SelfComparisonExample {

    public int showBug(int value) {
        // Dead Store: Adding an unused variable
        int abcdefgh = 42; // Unique variable name with random characters
        
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);
    }
}