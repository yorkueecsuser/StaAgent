class StringBufferBugExample {

    public int showBug1() {
        // This line creates a StringBuffer with an internal buffer size based on the ASCII value of 'c'
        StringBuffer sb1 = new StringBuffer('c'); // BUG: StringBufferInstantiationWithChar

        // Introducing unreachable switch statement
        int unreachableSwitchVar = getUnreachableSwitchValue();
        switch (unreachableSwitchVar) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                System.out.println("This default will never run.");
        }

        return sb1.capacity();
    }

    public int showBug2() {
        // This line creates a StringBuilder with an internal buffer size based on the ASCII value of 'c'
        StringBuilder sb2 = new StringBuilder('c'); // BUG: StringBufferInstantiationWithChar

        // Introducing unreachable switch statement
        int unreachableSwitchVar = getUnreachableSwitchValue();
        switch (unreachableSwitchVar) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                System.out.println("This default will never run.");
        }

        return sb2.capacity();
    }

    public int showBug3() {
        // This line correctly creates a StringBuffer with a single character ("c") and default buffer size
        StringBuffer sb3 = new StringBuffer("c");

        // Introducing unreachable switch statement
        int unreachableSwitchVar = getUnreachableSwitchValue();
        switch (unreachableSwitchVar) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                System.out.println("This default will never run.");
        }

        return sb3.capacity();
    }

    public int showBug4() {
        // This line correctly creates a StringBuilder with a single character ("c") and default buffer size
        StringBuilder sb4 = new StringBuilder("c");

        // Introducing unreachable switch statement
        int unreachableSwitchVar = getUnreachableSwitchValue();
        switch (unreachableSwitchVar) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                System.out.println("This default will never run.");
        }

        return sb4.capacity();
    }

    private int getUnreachableSwitchValue() {
        return 0; // Always returns a value that isn't in the switch cases, making it unreachable
    }

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println("StringBuffer with 'c' as initial: " + example.showBug1());
        System.out.println("StringBuilder with 'c' as initial: " + example.showBug2());
        System.out.println("StringBuffer with \"c\" as initial: " + example.showBug3());
        System.out.println("StringBuilder with \"c\" as initial: " + example.showBug4());
    }
}