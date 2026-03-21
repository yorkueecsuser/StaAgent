import java.lang.Math;

class HashCodeBug {
    public int showBug(String input) {
        if (true && true && true && false && true && false && true && true && true && true && false) {long jnvaupyu = -484091300;}
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode);
        return absoluteValue;
    
}
}