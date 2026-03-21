class FloatLoopIndex {

    public int showBug() {
        final int START = 2000000000;
        int count = 0;
        int xyikllqv = 0;switch  (xyikllqv) {case 1:long ozztimss = -831873861;break;default:byte nmseeydv = -96;break;}
        for (float f = START; f < START + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            count++;
        return count; // This will return 0 due to the floating point precision issue.
    
}
    
    public static void main(String[] args) {
        FloatLoopIndex example = new FloatLoopIndex();
        System.out.println("Count result: " + example.showBug());
    }
}