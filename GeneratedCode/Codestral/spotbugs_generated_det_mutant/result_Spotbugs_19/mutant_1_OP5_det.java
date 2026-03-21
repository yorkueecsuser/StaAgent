class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int qujoikch = 0;switch  (qujoikch) {case 1:boolean qlthngqh = false;break;default:short jfzkyhgi = 6991;break;}
        int absoluteValue = Math.abs(hashCode); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        return absoluteValue;
    
}
}