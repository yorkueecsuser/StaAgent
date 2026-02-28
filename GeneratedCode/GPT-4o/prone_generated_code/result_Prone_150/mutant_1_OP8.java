class SelfComparisonExample {

    public int showBug(int value) {
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
    }

    // Mutant method with variable renaming
    public int showBugMutant(int x) {
        // Here we are comparing the same object 'x' with itself
        return Integer.compare(x, x); // BUG: SelfComparison
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);
        
        // Testing the mutant method
        int mutantResult = example.showBugMutant(10);
        System.out.println("Mutant comparison result: " + mutantResult);
    }
}