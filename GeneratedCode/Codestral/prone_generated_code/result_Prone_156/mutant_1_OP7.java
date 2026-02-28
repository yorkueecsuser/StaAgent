class StringBuilderInitWithCharBug {

    private boolean getCondition() {
        return false;
    }

    public StringBuilder showBug(char c) {
        StringBuilder sb = new StringBuilder(c);
        while(getCondition()) { // Inserted unreachable while loop
            // Unreachable code
            System.out.println("This is an unreachable code block");
        }
        return sb;
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length());
    }
}