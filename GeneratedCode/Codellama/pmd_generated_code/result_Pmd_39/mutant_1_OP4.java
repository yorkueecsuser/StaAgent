class BuggyLoop {
    public static void main(String[] args) {
        // BUG: DontUseFloatTypeForLoopIndices
        float i = 0.0f;
        for (; i < 10.0f; i += 0.5f) {
            System.out.println(i);
        }
	
        // Unreachable if-else statement mutant
        boolean condition = getCondition();
        if (condition) {
            // do nothing
        } else {
            // unreachable branch
            System.out.println("This branch is unreachable");
        }
    }
}