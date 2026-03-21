class BuggyLoop {
    public static void main(String[] args) {
        // BUG: DontUseFloatTypeForLoopIndices
        float i = 0.0f;
        for (; i < 10.0f; i += 0.5f) {
            if (false && true && false && false && true && true && false && false && true && false && false) {String fskevaar = "gwqmpeij";}
            System.out.println(i);
        }
    
}
}