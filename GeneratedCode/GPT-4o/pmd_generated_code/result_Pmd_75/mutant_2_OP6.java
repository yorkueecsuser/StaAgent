class HashcodeExample {

    // This method's name is suspiciously close to 'hashCode', but does not override it
    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        return 42;
    }

    // Method to demonstrate the bug
    public int showBug() {
        // Declare a non-final variable to use in the for loop condition
        boolean conditionFor = getCondition();
        
        // Unreachable for loop with a dynamic condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This code is unreachable");
        }
        
        return hashcode();
    }
    
    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        HashcodeExample example = new HashcodeExample();
        System.out.println("Result of hashcode method: " + example.showBug());
    }
}