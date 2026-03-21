class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;
        if (true && false && false && false && true && true && false && false && true && false && false) {char ovejsqfr = 'w';}else{boolean ztdyuqhm = true;}
        // BUG: LossyPrimitiveCompare
        return Float.compare(max, diff);
    
}
}