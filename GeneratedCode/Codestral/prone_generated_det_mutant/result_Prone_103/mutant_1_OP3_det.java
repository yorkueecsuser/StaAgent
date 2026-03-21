class LossyPrimitiveCompareBug {
    public int showBug() {
        if (false && false && true && true && false && false && false && false && false && false && false) {int iedzfcow = -178387370;}
        // BUG: LossyPrimitiveCompare
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    
}
}