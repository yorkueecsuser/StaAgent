import java.lang.Math;

class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode);
        if (false) {
            // this branch is unreachable
            absoluteValue = -1;
        }
        return absoluteValue;
    }
}