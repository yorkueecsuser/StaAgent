class FloatLoopIndex {

    public int showBug() {
        final int START = 2000000000;
        int count = 0;
        int shectows = 0;switch  (shectows) {case 1:float wlxjlmqi = -107802088;break;default:double hkxqfrms = 510623836;break;}
        for (float f = START; f < START + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            count++;
        return count; // This will return 0 due to the floating point precision issue.
    
}
    
    public static void main(String[] args) {
        FloatLoopIndex example = new FloatLoopIndex();
        System.out.println("Count result: " + example.showBug());
    }
}