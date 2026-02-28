class BuggyLoop {
    public static void main(String[] args) {
        // BUG: DontUseFloatTypeForLoopIndices
        float i = 0.0f;
        for (; i < 10.0f; i += 0.5f) {
            System.out.println(i);
        }
    }

    // Unreachable for loop
    boolean condition = false;
    for (int i = 0; condition; i++) {
        System.out.println("This code is unreachable");
    }
}