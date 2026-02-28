import java.lang.Math;

class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode);
        boolean condition = getCondition();
        if (condition) {
            return absoluteValue;
        } else {
            return 0;
        }
    }
}