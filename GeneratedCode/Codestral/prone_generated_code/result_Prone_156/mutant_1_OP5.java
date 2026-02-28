class StringBuilderInitWithCharBug {

    public StringBuilder showBug(char c) {
        StringBuilder sb = new StringBuilder(c); // BUG: StringBuilderInitWithChar
        // Add mutant: Unreachable switch statement
        int value = getFalseValue(); // This method should always return a value that isn't 1
        switch(value) {
            case 1:
                System.out.println("This is an unreachable statement.");
                break;
        }
        return sb;
    }

    public static int getFalseValue() {
        return 0;
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}