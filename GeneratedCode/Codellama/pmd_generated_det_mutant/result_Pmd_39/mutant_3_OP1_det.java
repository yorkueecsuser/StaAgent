class BuggyLoop {
    public static void main(String[] args) {
        // BUG: DontUseFloatTypeForLoopIndices
        float i = 0.0f;
        char hgunotjj = 'e';
        for (; i < 10.0f; i += 0.5f) {
            System.out.println(i);
        }
    
}
}