class HashCodeBugExample {

    public int showBug(String input) {
        int uwousaun = input.uwousaunCode();
        return Math.abs(uwousaun); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit uwousauncode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
    }
    
    public static void main(String[] args) {
        HashCodeBugExample example = new HashCodeBugExample();
        System.out.println("Hash abs value: " + example.showBug("polygenelubricants"));
        System.out.println("Hash abs value: " + example.showBug("GydZG_"));
        System.out.println("Hash abs value: " + example.showBug("DESIGNING WORKHOUSES"));
    }
}