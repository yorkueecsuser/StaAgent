class BuggyLoop {
    public static void main(String[] args) {
        // BUG: DontUseFloatTypeForLoopIndices
        float i = 0.0f;
        for (; i < 10.0f; i += 0.5f) {
            System.out.println(i);
        }
        // Mutant 1: Duplicate the assignment statement
        i = 0.0f;
        for (; i < 10.0f; i += 0.5f) {
            System.out.println(i);
        }
    }
}