class StringBufferBugExample {

    public int showBug1() {
        // This line creates a StringBuffer with an internal buffer size based on the ASCII value of 'c'
        StringBuffer sb1 = new StringBuffer('c'); // BUG: StringBufferInstantiationWithChar

        // Unreachable if-else statement
        boolean condition = getCondition(); // Dynamic condition, always returns false
        if (condition) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This else branch is also unreachable");
        }

        return sb1.capacity();
    }

    public int showBug2() {
        // This line creates a StringBuilder with an internal buffer size based on the ASCII value of 'c'
        StringBuilder sb2 = new StringBuilder('c'); // BUG: StringBufferInstantiationWithChar

        // Unreachable if-else statement
        boolean condition = getCondition(); // Dynamic condition, always returns false
        if (condition) {
            System.out.println("Another unreachable branch");
        } else {
            System.out.println("Another unreachable else branch");
        }

        return sb2.capacity();
    }

    public int showBug3() {
        // This line correctly creates a StringBuffer with a single character ("c") and default buffer size
        StringBuffer sb3 = new StringBuffer("c");

        // Unreachable if-else statement
        boolean condition = getCondition(); // Dynamic condition, always returns false
        if (condition) {
            System.out.println("Unreachable branch in showBug3");
        } else {
            System.out.println("Unreachable else branch in showBug3");
        }

        return sb3.capacity();
    }

    public int showBug4() {
        // This line correctly creates a StringBuilder with a single character ("c") and default buffer size
        StringBuilder sb4 = new StringBuilder("c");

        // Unreachable if-else statement
        boolean condition = getCondition(); // Dynamic condition, always returns false
        if (condition) {
            System.out.println("Unreachable branch in showBug4");
        } else {
            System.out.println("Unreachable else branch in showBug4");
        }

        return sb4.capacity();
    }

    private boolean getCondition() {
        // This method always returns false
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