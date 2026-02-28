class BuggyLoop {
    public static void main(String[] args) {
        // BUG: DontUseFloatTypeForLoopIndices
        float i = 0.0f;
        for (; i < 10.0f; i += 0.5f) {
            System.out.println(i);
        }
        // Unreachable switch statement
        int x = 1;
        switch (x) {
            case 1:
                System.out.println("Reachable code");
                break;
            case 2:
                System.out.println("Unreachable code");
                break;
            default:
                System.out.println("Unreachable code");
        }
    }
}