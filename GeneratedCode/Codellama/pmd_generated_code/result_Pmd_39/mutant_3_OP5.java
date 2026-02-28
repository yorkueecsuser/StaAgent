class BuggyLoop {
    public static void main(String[] args) {
        // BUG: DontUseFloatTypeForLoopIndices
        float i = 0.0f;
        for (; i < 10.0f; i += 0.5f) {
            System.out.println(i);
        }
        // Mutated Code
        int j = 0;
        switch (j) {
            case 1:
                System.out.println("Unreachable");
                break;
            default:
                System.out.println("Default");
        }
    }
}