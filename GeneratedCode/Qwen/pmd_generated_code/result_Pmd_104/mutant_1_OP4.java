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

            // Introduced unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // This block is intended to be unreachable
                sum += 100;
            } else {
                // Alternative code
                sum += 50;
            }
        }
        return sum;
    }

    private boolean getCondition() {
        // This method returns a constant false, making the if block unreachable
        return false;
    }
}