class LossyPrimitiveCompareBug {
    public int showBug() {
        if (false && true && true && false && true && true && true && false && false && true && false) {long ixtjmrmu = -936126605;}
        // BUG: LossyPrimitiveCompare
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    
}
}