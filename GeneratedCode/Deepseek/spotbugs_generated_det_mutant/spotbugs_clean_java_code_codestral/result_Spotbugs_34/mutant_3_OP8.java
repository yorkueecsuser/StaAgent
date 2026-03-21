class ConfusingMethodNames {
    public int add(int a, int b) {
        return a + b;
    }

    public int Add(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a - b;
    }

    public int displayBug(int a, int b) { // Mutant code: Renamed method from "showBug" to "displayBug"
        return Add(a, b);
    }
}