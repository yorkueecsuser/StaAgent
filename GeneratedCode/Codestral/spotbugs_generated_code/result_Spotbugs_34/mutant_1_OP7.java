class ConfusingMethodNames {
    public int add(int a, int b) {
        return a + b;
    }

    public int Add(int a, int b) {
        return a - b;
    }

    public int showBug(int a, int b) {
        boolean conditionWhile = getCondition(); // Method to dynamically determine the condition
        while (conditionWhile) {
            // This loop is unreachable since the condition is always false
        }
        return Add(a, b);
    }

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }
}