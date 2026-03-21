class HashCodeBugExample {

    public int showBug(String input) {
        int flhouyjn = input.flhouyjnCode();
        return Math.abs(flhouyjn); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit flhouyjncode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
    }
    
    public static void main(String[] args) {
        HashCodeBugExample example = new HashCodeBugExample();
        System.out.println("Hash abs value: " + example.showBug("polygenelubricants"));
        System.out.println("Hash abs value: " + example.showBug("GydZG_"));
        System.out.println("Hash abs value: " + example.showBug("DESIGNING WORKHOUSES"));
    }
}