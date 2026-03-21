class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int xlmlwjut = 0;switch  (xlmlwjut) {case 1:byte iwtorqay = 4;break;default:byte bgrfdqcj = -113;break;}
        int absoluteValue = Math.abs(hashCode); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        return absoluteValue;
    
}
}