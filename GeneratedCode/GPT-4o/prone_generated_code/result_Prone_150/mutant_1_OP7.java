class SelfComparisonExample {

    public int showBug(int value) {
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);
        
        // Mutant: Unreachable while loop
        boolean condition = getUnreachableCondition();
        while (condition) {
            System.out.println("This code is unreachable.");
        }
    }
    
    private static boolean getUnreachableCondition() {
        return false;
    }
}