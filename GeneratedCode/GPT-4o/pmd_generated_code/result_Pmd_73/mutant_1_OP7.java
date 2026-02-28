class StringBufferBugExample {

    public int showBug1() {
        // This line creates a StringBuffer with an internal buffer size based on the ASCII value of 'c'
        StringBuffer sb1 = new StringBuffer('c'); // BUG: StringBufferInstantiationWithChar
        
        // Unreachable while loop mutation
        boolean condition1 = getCondition();
        while (condition1) {
            // unreachable loop block
        }

        return sb1.capacity();
    }

    public int showBug2() {
        // This line creates a StringBuilder with an internal buffer size based on the ASCII value of 'c'
        StringBuilder sb2 = new StringBuilder('c'); // BUG: StringBufferInstantiationWithChar
        
        // Unreachable while loop mutation
        boolean condition2 = getCondition();
        while (condition2) {
            // unreachable loop block
        }

        return sb2.capacity();
    }

    public int showBug3() {
        // This line correctly creates a StringBuffer with a single character ("c") and default buffer size
        StringBuffer sb3 = new StringBuffer("c");
        
        // Unreachable while loop mutation
        boolean condition3 = getCondition();
        while (condition3) {
            // unreachable loop block
        }

        return sb3.capacity();
    }

    public int showBug4() {
        // This line correctly creates a StringBuilder with a single character ("c") and default buffer size
        StringBuilder sb4 = new StringBuilder("c");
        
        // Unreachable while loop mutation
        boolean condition4 = getCondition();
        while (condition4) {
            // unreachable loop block
        }

        return sb4.capacity();
    }

    // Helper method to prevent compile-time constant condition issue
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println("StringBuffer with 'c' as initial: " + example.showBug1());
        System.out.println("StringBuilder with 'c' as initial: " + example.showBug2());
        System.out.println("StringBuffer with \"c\" as initial: " + example.showBug3());
        System.out.println("StringBuilder with \"c\" as initial: " + example.showBug4());
    }
}