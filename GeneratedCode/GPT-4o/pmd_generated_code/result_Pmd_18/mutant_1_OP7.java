class OctalValueExample {

    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues
        int j = 010;  // BUG: AvoidUsingOctalValues
        int k = i * j;

        // Introducing an unreachable while loop.
        boolean conditionWhile = getAlwaysFalseCondition();
        while (conditionWhile) {
            // This block is intentionally left empty and unreachable.
        }

        return k;
    }

    // Method to ensure the while loop condition is dynamically determined.
    private boolean getAlwaysFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        OctalValueExample example = new OctalValueExample();
        int result = example.showBug();
        System.out.println("Result of the buggy calculation: " + result);
    }
}