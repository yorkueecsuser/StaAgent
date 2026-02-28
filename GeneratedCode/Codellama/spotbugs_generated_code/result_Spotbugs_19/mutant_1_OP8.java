import java.lang.Math;

class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode);
        return absoluteValue;
    }

    public int showBug_mutant1(String input) {
        int mutatedHashCode = input.hashCode();
        int absoluteValue = Math.abs(mutatedHashCode);
        return absoluteValue;
    }
}