class ConfusingMethodNames {
    public int add(int a, int b) {
        return a + b;
    }

    public int Add(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        boolean unreachableCondition = isUnreachable();
        if (unreachableCondition) {
            System.out.println("This code should never be executed.");
        }
        return a - b;
    }

    public int showBug(int a, int b) {
        return Add(a, b);
    }

    private boolean isUnreachable() {
        return false;
    }
}