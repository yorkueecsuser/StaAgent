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

            // Inserting unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // This block will never execute because getCondition() always returns false
                sum += 100;
            } else {
                // This block will always execute
                sum += 50;
            }
        }
        return sum;
    }

    private boolean getCondition() {
        // Always returns false to make the if branch unreachable
        return false;
    }
}