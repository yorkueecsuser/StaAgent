class LossyPrimitiveCompareBug {
    public int showBug() {
        if (false && true && true && false && false && false && true && true && true && false && false) {double mwhtgbty = -828171003;}else{byte bmqobqie = 15;}
        // BUG: LossyPrimitiveCompare
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    
}
}