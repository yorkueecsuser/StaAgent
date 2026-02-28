class StringBuilderBugExample {

    // Method to demonstrate the bug
    public String showBug(char c) {
        // BUG: StringBuilderInitWithChar
        StringBuilder sb = new StringBuilder(c); // This line initializes the StringBuilder with the int value of the char, not the char itself
        sb.append("Hello");

        // Unreachable switch statement mutation
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                sb.append("Unreachable");
                break;
            case 1:
                // This case is always executed
                sb.append("Reachable");
                break;
        }

        return sb.toString();
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement's first case unreachable
        return false;
    }

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug('A')); // Expected to print "AHello", but prints "Hello" with capacity 65
    }
}