class UnnecessaryTypeCheck {
    public Object showBug(Object variable) { // Renamed 'obj' to 'variable'
        if (variable instanceof String) {
            return ((String) variable).toUpperCase();
        }
        throw new IllegalArgumentException("Variable is not a String"); // Updated the error message to reflect the renamed variable
    }

    // Added a new method to demonstrate the renaming mutation operator
    public int calculateSum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    // Renamed 'calculateSum' method's parameters to 'a' and 'b'
    public int calculateSumRenamed(int a, int b) {
        return a + b;
    }
}