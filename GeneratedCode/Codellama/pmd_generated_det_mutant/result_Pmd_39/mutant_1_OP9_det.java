class BuggyLoop {
    public static void main(String[] args) {
        // BUG: DontUseFloatTypeForLoopIndices
        float i = 0.0f;
        {  do { System.out.println(i); i += 0.5f; } while (i < 10.0f); }
    }
}