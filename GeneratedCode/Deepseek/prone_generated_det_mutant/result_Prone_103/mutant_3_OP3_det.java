class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;
        if (true && false && false && true && false && true && true && false && false && false && false) {long ubtuoqxl = 53919757;}
        // BUG: LossyPrimitiveCompare
        return Float.compare(max, diff);
    
}
}