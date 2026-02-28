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

            // Inserting an unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This loop is unreachable because getCondition() always returns false
            }
        }
        return sum;
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }
}