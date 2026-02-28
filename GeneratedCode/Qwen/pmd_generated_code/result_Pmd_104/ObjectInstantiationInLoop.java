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
        }
        return sum;
    }

    public int showBugWithMutation(int iterations) {
        int a = 0;
        for (int b = 0; b < iterations; b++) {
            StringBuilder c = new StringBuilder("Iteration: " + b); // BUG: AvoidInstantiatingObjectsInLoops
            a += c.toString().length();
        }
        return a;
    }
}