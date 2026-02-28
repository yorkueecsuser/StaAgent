class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode);
        
        // Insert unreachable if statement
        if (false) {
            // This code is unreachable
            System.out.println("Unreachable code");
        }
        
        return absoluteValue;
    }
}