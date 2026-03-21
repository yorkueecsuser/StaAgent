class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        for  (int mhmeojht = 0; mhmeojht < 0; mhmeojht++) {float ftykbnyk = -586113958;}
        int absoluteValue = Math.abs(hashCode); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        return absoluteValue;
    
}
}