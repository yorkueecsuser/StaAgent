class StringBuilderInitWithCharBug {

    private boolean alwaysFalse() {
        return false;
    }

    public StringBuilder showBug(char c) {
        StringBuilder sb = new StringBuilder(c); // Original code

        // Mutant: Unreachable if statement
        if (alwaysFalse()) {
            System.out.println("This line will never be executed.");
        }

        return sb;
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}