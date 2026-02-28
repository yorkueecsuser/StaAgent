class HashCodeBugExample {

    public int showBug(String input) {
        int hash = input.hashCode();
        boolean condition = isConditionTrue(); // Introduce a method to determine condition
        if (condition) {
            System.out.println("This will never print because condition is false.");
        }
        return Math.abs(hash); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
    }
    
    private boolean isConditionTrue() {
        return false; // The condition is always false, making the if block unreachable
    }

    public static void main(String[] args) {
        HashCodeBugExample example = new HashCodeBugExample();
        System.out.println("Hash abs value: " + example.showBug("polygenelubricants"));
        System.out.println("Hash abs value: " + example.showBug("GydZG_"));
        System.out.println("Hash abs value: " + example.showBug("DESIGNING WORKHOUSES"));
    }
}