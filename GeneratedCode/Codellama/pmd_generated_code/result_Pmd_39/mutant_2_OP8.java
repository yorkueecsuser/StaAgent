class BuggyLoop {
    public static void main(String[] args) {
        // BUG: DontUseFloatTypeForLoopIndices
        float i = 0.0f;
        for (; i < 10.0f; i += 0.5f) {
            System.out.println(i);
        }
    }
}
// Renamed variable "i" to "x"
class BuggyLoop {
    public static void main(String[] args) {
        // BUG: DontUseFloatTypeForLoopIndices
        float x = 0.0f;
        for (; x < 10.0f; x += 0.5f) {
            System.out.println(x);
        }
    }
}