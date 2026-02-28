class BuggyLoop {
    public static void main(String[] args) {
        // BUG: DontUseFloatTypeForLoopIndices
        float i = 0.0f;
        for (; i < 10.0f; i += 0.5f) {
            System.out.println(i);
        }
        
        // Mutation Operator: Unreachable switch statement
        // This switch statement is unreachable because the condition is always false.
        int value = 0;
        switch (value) {
            case 1:
                System.out.println("This code is unreachable.");
                break;
            default:
                System.out.println("This code is also unreachable.");
                break;
        }
    }
}