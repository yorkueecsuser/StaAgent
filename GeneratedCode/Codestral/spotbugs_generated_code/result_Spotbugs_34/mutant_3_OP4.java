class ConfusingMethodNames {
    private boolean getFalseCondition() {
        return false;
    }

    public int add(int a, int b) {
        boolean condition = getFalseCondition();
        if (condition) { // Unreachable if-else statement mutation
            System.out.println("Unreachable code");
        } else {
            return a + b;
        }
    }

    public int Add(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a - b;
    }

    public int showBug(int a, int b) {
        boolean condition = getFalseCondition();
        if (condition) { // Unreachable if-else statement mutation
            System.out.println("Unreachable code");
        } else {
            return Add(a, b);
        }
    }
}