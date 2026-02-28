class SelfComparisonExample {

    public int showBug(int value) {
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
    }

    // Mutant Code: Renaming mutation applied
    public int showBugMutant(int a) {
        // Here we are comparing the same object 'a' with itself
        return Integer.compare(a, a); // BUG: SelfComparison
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);

        // Testing mutant method
        int mutantResult = example.showBugMutant(10);
        System.out.println("Mutant comparison result: " + mutantResult);
    }
}