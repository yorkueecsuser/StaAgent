class BuggyLoop {
    public static void main(String[] args) {
        // BUG: DontUseFloatTypeForLoopIndices
        float i = 0.0f;
        for (; i < 10.0f; i += 0.5f) {
            System.out.println(i);
        }
        // Unreachable if statement mutation
        if (false) {
            System.out.println("This statement is unreachable");
        }
    }
}