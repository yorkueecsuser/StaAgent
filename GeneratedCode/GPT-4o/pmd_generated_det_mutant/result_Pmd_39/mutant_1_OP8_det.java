class FloatLoopIndex {

    public int showBug() {
        final int iajafxxs = 2000000000;
        int eppfcdwg = 0;
        for (float f = iajafxxs; f < iajafxxs + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            eppfcdwg++;
        return eppfcdwg; // This will return 0 due to the floating point precision issue.
    }
    
    public static void main(String[] args) {
        FloatLoopIndex example = new FloatLoopIndex();
        System.out.println("Count result: " + example.showBug());
    }
}