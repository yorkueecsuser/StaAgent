class ConfusingMethodNames {
    public boolean getFalseCondition() {
        return false; // This method is used to ensure the condition for the while loop is always false
    }

    public int add(int a, int b) {
        while(getFalseCondition()) { // Unreachable while loop inserted here
            // This block of code will never be executed
        }
        return a + b;
    }

    public int Add(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a - b;
    }

    public int showBug(int a, int b) {
        return Add(a, b);
    }
}