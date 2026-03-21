class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int wjhymkac = 0;switch  (wjhymkac) {case 1:float hqgpefnw = 587867886;break;default:long payjjboc = 549435195;break;}
        int absoluteValue = Math.abs(hashCode); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        return absoluteValue;
    
}
}