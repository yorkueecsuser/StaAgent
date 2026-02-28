class BuggyLoop {
    public static void main(String[] args) {
        // BUG: DontUseFloatTypeForLoopIndices
        float i = 0.0f;
        for (; i < 10.0f; i += 0.5f) {
            System.out.println(i);
        }
    }
    public static void unreachableWhileLoop() {
        // Unreachable while loop
        while (false) {
            System.out.println("This code is unreachable!");
        }
    }
}