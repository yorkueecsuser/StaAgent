class BuggyLoop {
    public static void main(String[] args) {
        // BUG: DontUseFloatTypeForLoopIndices
        float i = 0.0f;
        for (; i < 10.0f; i += 0.5f) {
            System.out.println(i);
        }
        // Unreachable while loop
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // Code inside this loop is unreachable
            System.out.println("This code is unreachable");
        }
    }
}