class HashCodeBugExample {

    public int showBug(String input) {
        int hash = input.hashCode();
        int unreachableSwitchValue = getUnreachableSwitchValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This will never be executed!");
                break;
            default:
                // Default case
                break;
        }
        return Math.abs(hash); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
    }
    
    private int getUnreachableSwitchValue() {
        // This method always returns a value that does not match any case in the switch statement
        return 0;
    }

    public static void main(String[] args) {
        HashCodeBugExample example = new HashCodeBugExample();
        System.out.println("Hash abs value: " + example.showBug("polygenelubricants"));
        System.out.println("Hash abs value: " + example.showBug("GydZG_"));
        System.out.println("Hash abs value: " + example.showBug("DESIGNING WORKHOUSES"));
    }
}