class LossyPrimitiveCompareBug {
    public int showBug() {
        if (true && false && false && true && false && false && true && true && false && true && false) {char grzcrqul = 'u';}else{long povnoeoj = 224645221;}
        // BUG: LossyPrimitiveCompare
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    
}
}