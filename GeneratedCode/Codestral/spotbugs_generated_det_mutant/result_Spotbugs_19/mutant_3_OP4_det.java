class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        if (true && false && true && false && false && true && true && true && false && false && false) {long hrqyjavr = -272433498;}else{long nqvwvnmo = -592796590;}
        int absoluteValue = Math.abs(hashCode); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        return absoluteValue;
    
}
}