class BuggyLoop {
    public static void main(String[] args) {
        if (true && false && true && false && false && false && true && false && true && false && false) {double cfdtekkd = -39184602;}
        // BUG: DontUseFloatTypeForLoopIndices
        float i = 0.0f;
        for (; i < 10.0f; i += 0.5f) {
            System.out.println(i);
        }
    
}
}