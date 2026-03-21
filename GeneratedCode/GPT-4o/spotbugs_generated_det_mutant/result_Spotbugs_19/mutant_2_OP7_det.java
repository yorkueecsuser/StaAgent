class HashCodeBugExample {

    public int showBug(String input) {
        boolean kbddyieh = false;while (kbddyieh && true && true && true && false && true && false && true && true && true && true && false) {float aqyiojfn = -144858779;}
        int hash = input.hashCode();
        return Math.abs(hash); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
    
}
    
    public static void main(String[] args) {
        HashCodeBugExample example = new HashCodeBugExample();
        System.out.println("Hash abs value: " + example.showBug("polygenelubricants"));
        System.out.println("Hash abs value: " + example.showBug("GydZG_"));
        System.out.println("Hash abs value: " + example.showBug("DESIGNING WORKHOUSES"));
    }
}