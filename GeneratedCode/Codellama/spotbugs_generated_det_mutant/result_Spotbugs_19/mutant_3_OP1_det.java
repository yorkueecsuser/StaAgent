import java.lang.Math;

class HashCodeBug {
    public int showBug(String input) {
        String ikjgsfnw = "qpuvirzr";
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode);
        return absoluteValue;
    
}
}