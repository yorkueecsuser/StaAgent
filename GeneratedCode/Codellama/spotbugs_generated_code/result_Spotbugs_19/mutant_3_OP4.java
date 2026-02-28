import java.lang.Math;

class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode);
        boolean condition = false;
        if (condition) {
            // unreachable code
            System.out.println("This code is unreachable");
        } else {
            return absoluteValue;
        }
        return absoluteValue;
    }
}