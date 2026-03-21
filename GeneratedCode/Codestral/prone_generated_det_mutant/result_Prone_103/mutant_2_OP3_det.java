class LossyPrimitiveCompareBug {
    public int showBug() {
        if (true && true && false && true && true && true && false && false && false && true && false) {long wqngxmoz = 544392643;}
        // BUG: LossyPrimitiveCompare
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    
}
}