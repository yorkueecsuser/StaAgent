import java.lang.Math;

class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode);
        while (false) {
            // Unreachable while loop
            System.out.println("This code is unreachable!");
        }
        return absoluteValue;
    }
}