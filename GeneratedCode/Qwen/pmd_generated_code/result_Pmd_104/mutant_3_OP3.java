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

            // Inserting an unreachable if statement
            boolean condition = getCondition();
            if (condition) {
                // This block is intended to be unreachable
                sum -= 1; // Unique mutant operation
            }
        }
        return sum;
    }

    private boolean getCondition() {
        // This method always returns false, making the if block unreachable at runtime
        return false;
    }
}