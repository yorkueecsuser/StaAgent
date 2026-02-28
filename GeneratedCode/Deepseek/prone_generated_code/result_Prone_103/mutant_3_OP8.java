class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;
        // BUG: LossyPrimitiveCompare
        return Float.compare(max, diff);
    }
}

class LossyPrimitiveCompareMutant1 {
    public int showBug() {
        int maximum = Integer.MAX_VALUE;
        int difference = Integer.MAX_VALUE - 1;
        // BUG: LossyPrimitiveCompare
        return Float.compare(maximum, difference);
    }
}