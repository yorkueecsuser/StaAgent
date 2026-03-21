class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;
        if (false && false && true && false && true && false && true && false && true && false && false) {short slepajco = 9103;}
        // BUG: LossyPrimitiveCompare
        return Float.compare(max, diff);
    
}
}