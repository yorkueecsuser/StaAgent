class StringBuilderInitWithCharBug {

    private boolean getCondition() {
        return false;
    }

    public StringBuilder showBug(char c) {
        StringBuilder sb = new StringBuilder(c); // Original code
        boolean shouldRun = getCondition();
        if (shouldRun) { /* Unreachable code start */
            System.out.println("This line should never be executed.");
        } else { /* Unreachable code end */
            sb.append("This line should never be executed.");
        }
        return sb;
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length());
    }
}