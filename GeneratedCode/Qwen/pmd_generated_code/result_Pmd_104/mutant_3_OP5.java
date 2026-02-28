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

            // Unreachable switch statement mutation
            boolean condition = getCondition();
            switch (condition? 0 : 1) {
                case 0:
                    // This case will never be reached because condition is always false
                    sum += 100;
                    break;
                case 1:
                    // This case will always be executed
                    sum += 1;
                    break;
            }
        }
        return sum;
    }

    private boolean getCondition() {
        // This method returns false, making the first case of the switch unreachable
        return false;
    }
}