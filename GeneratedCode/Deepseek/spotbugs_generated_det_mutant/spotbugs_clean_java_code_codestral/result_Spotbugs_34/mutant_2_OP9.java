class ConfusingMethodNames {
    public int add(int a, int b) {
        return a + b;
    }

    public int Add(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a - b;
    }

    public int showBug(int a, int b) {
        int result = 0;

        // Introducing a new loop to fulfill the "Equivalent Loop Replacement" mutation operator
        int i = a;
        do {
            result = Add(i, b);
            i--;
        } while (i >= 0);

        return result;
    }
}