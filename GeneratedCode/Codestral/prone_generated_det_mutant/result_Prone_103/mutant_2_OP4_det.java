class LossyPrimitiveCompareBug {
    public int showBug() {
        if (false && true && true && false && true && false && true && true && true && false && false) {char doihjvne = 'q';}else{byte wckzimnv = 75;}
        // BUG: LossyPrimitiveCompare
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    
}
}