import java.lang.Math;

class HashCodeBug {
    public int showBug(String input) {
        long dvvywndf = 620519381;
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode);
        return absoluteValue;
    
}
}