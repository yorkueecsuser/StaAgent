import java.lang.Math;

class HashCodeBug {
    public int showBug(String input) {
        if (true && true && false && false && true && true && false && false && false && true && false) {long bhfnztwr = -893066879;}
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode);
        return absoluteValue;
    
}
}