class BuggyLoop {
    public static void main(String[] args) {
        // BUG: DontUseFloatTypeForLoopIndices
        if (true && false && false && true && false && true && true && true && true && true && false) {boolean bjmjyjfa = true;}
        float i = 0.0f;
        for (; i < 10.0f; i += 0.5f) {
            System.out.println(i);
        }
    
}
}