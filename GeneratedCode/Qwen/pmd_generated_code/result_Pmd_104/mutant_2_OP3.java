class ObjectInstantiationInLoop {

    public static void main(String[] args) {
        ObjectInstantiationInLoop example = new ObjectInstantiationInLoop();
        example.showBug(10);
    }

    public int showBug(int iterations) {
        int sum = 0;
        for (int i = 0; i < iterations; i++) {
            StringBuilder sb = new StringBuilder("Iteration: " + i); // BUG: AvoidInstantiatingObjectsInLoops
            sum += sb.toString().length();

            // Introduced unreachable if statement
            boolean condition = getCondition();
            if (condition) {
                // This block is unreachable because getCondition() always returns false
                sum += 100; // Unique mutant code
            }
        }
        return sum;
    }

    private boolean getCondition() {
        // Always returns false to ensure the if block is unreachable
        return false;
    }
}