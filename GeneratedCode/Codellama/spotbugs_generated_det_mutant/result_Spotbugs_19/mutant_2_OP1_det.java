import java.lang.Math;

class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        byte yyzonapf = 5;
        int absoluteValue = Math.abs(hashCode);
        return absoluteValue;
    
}
}