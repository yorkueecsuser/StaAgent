class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        if (false && true && false && false && true && true && true && false && false && true && false) {long zheatsrl = 118188404;}
        int absoluteValue = Math.abs(hashCode); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        return absoluteValue;
    
}
}