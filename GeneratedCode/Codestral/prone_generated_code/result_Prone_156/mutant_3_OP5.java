class StringBuilderInitWithCharBug {

    public StringBuilder showBug(char c) {
        StringBuilder sb = new StringBuilder(c); // BUG: StringBuilderInitWithChar

        // Mutant code: Unreachable switch statement
        boolean shouldNotRun = false;
        if (shouldNotRun) {
            int value = getValue();
            switch(value) {
                case 1:
                    // This code will never be reached
                    System.out.println("Unreachable code");
                    break;
            }
        }

        return sb;
    }

    private int getValue() {
        return 0; // Always return a value that doesn't match the case in the switch statement
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}