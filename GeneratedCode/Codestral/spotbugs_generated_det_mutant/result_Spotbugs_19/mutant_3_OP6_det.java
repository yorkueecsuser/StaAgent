class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        for  (int qafswkbx = 0; qafswkbx < 0; qafswkbx++) {String zxdntgcj = "btwrogvh";}
        int absoluteValue = Math.abs(hashCode); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        return absoluteValue;
    
}
}