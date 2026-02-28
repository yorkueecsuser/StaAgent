class BuggyLoop {
    public static void main(String[] args) {
        // BUG: DontUseFloatTypeForLoopIndices
        float i = 0.0f;
        for (; i < 10.0f; i += 0.5f) {
            System.out.println(i);
        }

        // Mutant code added below
        if (getCondition()) {
            System.out.println("This code is unreachable");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}