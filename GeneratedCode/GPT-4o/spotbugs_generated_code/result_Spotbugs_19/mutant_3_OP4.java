class HashCodeBugExample {
    
    // Method to simulate a condition that always returns false
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(String input) {
        int hash = input.hashCode();
        
        // Inserting an unreachable if-else statement
        if (getFalseCondition()) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This block is always executed.");
        }

        return Math.abs(hash); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
    }
    
    public static void main(String[] args) {
        HashCodeBugExample example = new HashCodeBugExample();
        System.out.println("Hash abs value: " + example.showBug("polygenelubricants"));
        System.out.println("Hash abs value: " + example.showBug("GydZG_"));
        System.out.println("Hash abs value: " + example.showBug("DESIGNING WORKHOUSES"));
    }
}