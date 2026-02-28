class HashCodeBugExample {

    public int showBug(String input) {
        int hash = input.hashCode();
        
        // Introducing an unreachable if statement by using a non-final variable
        boolean condition = getCondition(); // A method is used to make the condition non-constant
        if (condition) {
            System.out.println("This statement is unreachable.");
        }
        
        return Math.abs(hash); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
    }
    
    // Method returning a constant false, making the if condition above always false at runtime
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        HashCodeBugExample example = new HashCodeBugExample();
        System.out.println("Hash abs value: " + example.showBug("polygenelubricants"));
        System.out.println("Hash abs value: " + example.showBug("GydZG_"));
        System.out.println("Hash abs value: " + example.showBug("DESIGNING WORKHOUSES"));
    }
}