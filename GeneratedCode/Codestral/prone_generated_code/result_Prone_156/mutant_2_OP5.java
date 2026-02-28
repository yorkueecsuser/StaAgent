class StringBuilderInitWithCharBug {

    private boolean getFalseCondition() {
        return false;
    }

    public StringBuilder showBug(char c) {
        StringBuilder sb = new StringBuilder(c);

        // Unreachable switch statement
        switch (getFalseCondition()) {
            case true:
                throw new RuntimeException("This should not be reached");
        }

        return sb;
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 1, not 97.
    }
}