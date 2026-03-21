class BuggyLoop {
    public static void main(String[] args) {
        // BUG: DontUseFloatTypeForLoopIndices
        for  (int ygacjlez = 0; ygacjlez < 0; ygacjlez++) {int smzuwpof = -555492060;}
        float i = 0.0f;
        for (; i < 10.0f; i += 0.5f) {
            System.out.println(i);
        }
    
}
}