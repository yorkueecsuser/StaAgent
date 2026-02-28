class HashCodeBugExample {

    public int showBug(String input) {
        int hash = input.hashCode();
        // Inserting an unreachable if-else branch
        boolean unreachableCondition = computeUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This is unreachable code.");
        } else {
            System.out.println("This will always execute.");
        }
        return Math.abs(hash); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
    }

    // Method to return a constant false condition to make the branch unreachable
    private boolean computeUnreachableCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        HashCodeBugExample example = new HashCodeBugExample();
        System.out.println("Hash abs value: " + example.showBug("polygenelubricants"));
        System.out.println("Hash abs value: " + example.showBug("GydZG_"));
        System.out.println("Hash abs value: " + example.showBug("DESIGNING WORKHOUSES"));
    }
}