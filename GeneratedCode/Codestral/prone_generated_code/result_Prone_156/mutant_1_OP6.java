class StringBuilderInitWithCharBug {

    public boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }

    public StringBuilder showBug(char c) {
        StringBuilder sb = new StringBuilder(c); // BUG: StringBuilderInitWithChar

        for (int i = 0; getCondition(); i++) { // Inserted unreachable for loop
            System.out.println("This line is unreachable.");
        }

        return sb;
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}