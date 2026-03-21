class ConfusingMethodNames {
    public int add(int a, int b) {
        return a + b;
    }

    public int Add(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a - b;
    }

    public int showBug(int a, int b) {
        int result = Add(a, b);
        int duplicateResult = Add(a, b); // Mutant: Duplicated assignment statement
        return result;
    }
}