class BuggyLoop {
    public static void main(String[] args) {
        // BUG: DontUseFloatTypeForLoopIndices
        float i = 0.0f;
        for (; i < 10.0f; i += 0.5f) {
            System.out.println(i);
        }

        // Unreachable if-else statement
        boolean flag = false;
        if (flag) {
            System.out.println("This is unreachable code");
        } else {
            System.out.println("This is reachable code");
        }
    }
}