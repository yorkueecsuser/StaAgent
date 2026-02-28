class HashCodeBugExample {

    public int showBug(String input) {
        int h = input.hashCode(); // Renamed variable 'hash' to 'h'
        return Math.abs(h); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
    }
    
    public static void main(String[] args) {
        HashCodeBugExample e = new HashCodeBugExample(); // Renamed variable 'example' to 'e'
        System.out.println("Hash abs value: " + e.showBug("polygenelubricants"));
        System.out.println("Hash abs value: " + e.showBug("GydZG_"));
        System.out.println("Hash abs value: " + e.showBug("DESIGNING WORKHOUSES"));
    }
}