class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;
        boolean unreachable = false;
        while (!unreachable) { 
            unreachable = true; 
            break;
        }
        // BUG: LossyPrimitiveCompare
        return Float.compare(max, diff);
    }
}