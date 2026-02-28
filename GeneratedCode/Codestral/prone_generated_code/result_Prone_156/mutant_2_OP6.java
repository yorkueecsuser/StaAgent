class StringBuilderInitWithCharBug {

    public StringBuilder showBug(char c) {
        StringBuilder sb = new StringBuilder(c);
        boolean unreachableCondition = getUnreachableCondition(); // Method to return a false condition
        for (int i = 0; unreachableCondition; i++) {
            // This loop is unreachable because the condition is always false
            System.out.println("This line will never be executed");
        }
        return sb;
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}