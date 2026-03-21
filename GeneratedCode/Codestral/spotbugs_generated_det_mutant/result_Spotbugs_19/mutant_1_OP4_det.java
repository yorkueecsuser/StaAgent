class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        if (false && true && true && false && true && false && true && true && false && true && false) {char hfeidkoy = 'x';}else{short wplvhpfd = -5518;}
        int absoluteValue = Math.abs(hashCode); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        return absoluteValue;
    
}
}