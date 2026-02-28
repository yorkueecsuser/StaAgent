import java.lang.Math;

class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode);
        
        // Unreachable for loop
        for (int i = 0; false; i++) {
            System.out.println("This code is unreachable");
        }
        
        return absoluteValue;
    }
}