class StringBufferBugExample {

    public int showBug1() {
        // This line creates a StringBuffer with an internal buffer size based on the ASCII value of 'c'
        StringBuffer sb1 = new StringBuffer('c'); // BUG: StringBufferInstantiationWithChar
        boolean condition1 = getFalseCondition();
        if (condition1) {
            System.out.println("Unreachable code in showBug1");
        }
        return sb1.capacity();
    }

    public int showBug2() {
        // This line creates a StringBuilder with an internal buffer size based on the ASCII value of 'c'
        StringBuilder sb2 = new StringBuilder('c'); // BUG: StringBufferInstantiationWithChar
        boolean condition2 = getFalseCondition();
        if (condition2) {
            System.out.println("Unreachable code in showBug2");
        }
        return sb2.capacity();
    }

    public int showBug3() {
        // This line correctly creates a StringBuffer with a single character ("c") and default buffer size
        StringBuffer sb3 = new StringBuffer("c");
        boolean condition3 = getFalseCondition();
        if (condition3) {
            System.out.println("Unreachable code in showBug3");
        }
        return sb3.capacity();
    }

    public int showBug4() {
        // This line correctly creates a StringBuilder with a single character ("c") and default buffer size
        StringBuilder sb4 = new StringBuilder("c");
        boolean condition4 = getFalseCondition();
        if (condition4) {
            System.out.println("Unreachable code in showBug4");
        }
        return sb4.capacity();
    }

    private boolean getFalseCondition() {
        return false; // This method returns false to ensure the if statement is unreachable
    }

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println("StringBuffer with 'c' as initial: " + example.showBug1());
        System.out.println("StringBuilder with 'c' as initial: " + example.showBug2());
        System.out.println("StringBuffer with \"c\" as initial: " + example.showBug3());
        System.out.println("StringBuilder with \"c\" as initial: " + example.showBug4());
    }
}