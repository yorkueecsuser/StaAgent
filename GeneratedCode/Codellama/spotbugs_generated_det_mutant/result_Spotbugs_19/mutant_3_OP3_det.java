import java.lang.Math;

class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        if (false && false && false && true && true && false && true && true && true && false && false) {double upwsuear = 282874091;}
        int absoluteValue = Math.abs(hashCode);
        return absoluteValue;
    
}
}