class BuggyLoop {
    public static void main(String[] args) {
        // BUG: DontUseFloatTypeForLoopIndices
        float i = 0.0f;
        float j = 0.0f; // New variable added
        for (; i < 10.0f; i += 0.5f) {
            System.out.println(i);
            j += 0.5f; // New assignment statement added
        }
    }
}