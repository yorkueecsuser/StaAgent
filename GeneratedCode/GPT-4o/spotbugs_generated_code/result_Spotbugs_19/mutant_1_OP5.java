class HashCodeBugExample {

    public int showBug(String input) {
        int hash = input.hashCode();
        return Math.abs(hash); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
    }
    
    public static void main(String[] args) {
        HashCodeBugExample example = new HashCodeBugExample();
        System.out.println("Hash abs value: " + example.showBug("polygenelubricants"));
        System.out.println("Hash abs value: " + example.showBug("GydZG_"));
        System.out.println("Hash abs value: " + example.showBug("DESIGNING WORKHOUSES"));
        
        // Adding an unreachable switch statement
        int unreachableSwitchCondition = getUnreachableSwitchCondition();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This case is unreachable.");
                break;
            default:
                // Ensures there is a default branch
                break;
        }
    }

    private static int getUnreachableSwitchCondition() {
        return 0; // Always returns 0, ensuring the switch case is unreachable
    }
}