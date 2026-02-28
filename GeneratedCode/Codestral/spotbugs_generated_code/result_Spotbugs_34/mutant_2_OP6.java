class ConfusingMethodNames {
    private boolean getFalseCondition() {
        return false;
    }

    public int add(int a, int b) {
        for (int i = 0; getFalseCondition(); i++) {
            System.out.println("Unreachable loop");
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