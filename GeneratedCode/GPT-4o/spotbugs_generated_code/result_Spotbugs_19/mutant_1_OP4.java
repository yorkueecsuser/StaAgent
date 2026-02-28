class HashCodeBugExample {

    public int showBug(String input) {
        int hash = input.hashCode();
        
        // Mutation: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This is part of the unreachable mutation.");
        }
        
        return Math.abs(hash); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
    }
    
    // A method that always returns false to simulate an unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        HashCodeBugExample example = new HashCodeBugExample();
        System.out.println("Hash abs value: " + example.showBug("polygenelubricants"));
        System.out.println("Hash abs value: " + example.showBug("GydZG_"));
        System.out.println("Hash abs value: " + example.showBug("DESIGNING WORKHOUSES"));
    }
}