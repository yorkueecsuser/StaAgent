class FloatLoopIndex {

    public int showBug() {
        final int pcuazwzf = 2000000000;
        int bheqjcjn = 0;
        for (float f = pcuazwzf; f < pcuazwzf + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            bheqjcjn++;
        return bheqjcjn; // This will return 0 due to the floating point precision issue.
    }
    
    public static void main(String[] args) {
        FloatLoopIndex example = new FloatLoopIndex();
        System.out.println("Count result: " + example.showBug());
    }
}