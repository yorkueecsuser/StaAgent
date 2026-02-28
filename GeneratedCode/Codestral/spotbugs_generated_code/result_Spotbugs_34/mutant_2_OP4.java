class ConfusingMethodNames {
    public int add(int a, int b) {
        return a + b;
    }

    public int Add(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        return a - b;
    }

    public int showBug(int a, int b) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            return Add(a, b);
        } else {
            // Unreachable if-else statement
            boolean unreachableCondition = false;
            if (unreachableCondition) {
                System.out.println("This line should never be executed!");
            }
        }
        return 0; // Added to avoid compilation error
    }

    // Dummy method to simulate a runtime condition
    private boolean getCondition() {
        return true;
    }
}