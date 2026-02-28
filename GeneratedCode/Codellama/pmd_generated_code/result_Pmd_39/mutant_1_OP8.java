class BuggyLoop {
    public static void main(String[] args) {
        // BUG: DontUseFloatTypeForLoopIndices
        float i = 0.0f;
        for (; i < 10.0f; i += 0.5f) {
            System.out.println(i);
        }

        // Mutant 1: Renaming variable "i" to "j"
        float j = 0.0f;
        for (; j < 10.0f; j += 0.5f) {
            System.out.println(j);
        }
    }
}