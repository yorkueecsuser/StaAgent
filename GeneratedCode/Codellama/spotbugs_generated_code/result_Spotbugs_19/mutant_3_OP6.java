import java.lang.Math;

class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode);
        for (int i = 0; false; i++) {
            System.out.println("This for loop is unreachable");
        }
        return absoluteValue;
    }
}