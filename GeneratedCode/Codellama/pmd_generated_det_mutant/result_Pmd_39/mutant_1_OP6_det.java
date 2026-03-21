class BuggyLoop {
    public static void main(String[] args) {
        // BUG: DontUseFloatTypeForLoopIndices
        for  (int esmqmsbi = 0; esmqmsbi < 0; esmqmsbi++) {float ftgxqedg = -632603214;}
        float i = 0.0f;
        for (; i < 10.0f; i += 0.5f) {
            System.out.println(i);
        }
    
}
}