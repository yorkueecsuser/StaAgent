class HashCodeBugExample {

    public int showBug(String input) {
        int hash = input.hashCode();
        
        // Mutation: Unreachable while loop
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            System.out.println("This code is unreachable.");
        }
        
        return Math.abs(hash); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
    }
    
    private boolean getUnreachableCondition() {
        return false; // Ensures the while loop is unreachable
    }

    public static void main(String[] args) {
        HashCodeBugExample example = new HashCodeBugExample();
        System.out.println("Hash abs value: " + example.showBug("polygenelubricants"));
        System.out.println("Hash abs value: " + example.showBug("GydZG_"));
        System.out.println("Hash abs value: " + example.showBug("DESIGNING WORKHOUSES"));
    }
}