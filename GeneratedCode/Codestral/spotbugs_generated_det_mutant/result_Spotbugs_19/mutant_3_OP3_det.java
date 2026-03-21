class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        if (true && true && false && true && false && true && false && false && true && false && false) {boolean qwgdekwf = false;}
        int absoluteValue = Math.abs(hashCode); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        return absoluteValue;
    
}
}