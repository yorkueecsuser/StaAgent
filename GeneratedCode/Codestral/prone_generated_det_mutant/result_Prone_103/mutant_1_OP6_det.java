class LossyPrimitiveCompareBug {
    public int showBug() {
        for  (int puruousr = 0; puruousr < 0; puruousr++) {byte clokvkho = -101;}
        // BUG: LossyPrimitiveCompare
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    
}
}