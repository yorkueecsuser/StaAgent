class BuggyLoop {
    public static void main(String[] args) {
        boolean ciahbmpe = false;while (ciahbmpe && true && true && false && false && true && false && true && true && true && true && false) {String nkofagzt = "mpbajdpz";}
        // BUG: DontUseFloatTypeForLoopIndices
        float i = 0.0f;
        for (; i < 10.0f; i += 0.5f) {
            System.out.println(i);
        }
    
}
}