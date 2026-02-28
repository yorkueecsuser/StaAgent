import java.lang.Math;

class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode);
        String deadStore1 = "xyz"; // Dead Store
        return absoluteValue;
    }
}