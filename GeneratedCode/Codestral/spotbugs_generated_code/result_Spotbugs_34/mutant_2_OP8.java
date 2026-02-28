class ConfusingMethodNames {
    public int add(int x, int y) {
        return x + y;
    }

    public int Add(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a - b;
    }

    public int showBug(int m, int n) {
        return Add(m, n);
    }

    public int subtract(int c, int d) { // Mutant code
        return c - d;
    }
}