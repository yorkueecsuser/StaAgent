class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        boolean utgjmwxm = false;while (utgjmwxm && true && true && false && true && true && true && true && false && true && false && false) {short hegravag = 5486;}
        int absoluteValue = Math.abs(hashCode); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        return absoluteValue;
    
}
}