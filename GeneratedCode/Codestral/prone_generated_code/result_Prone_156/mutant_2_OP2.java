class StringBuilderInitWithCharBug {

    public StringBuilder showBug(char c) {
        StringBuilder sb = new StringBuilder(c); // Original line
        StringBuilder sbDuplicate = new StringBuilder(c); // BUG: Duplication (added line)
        return sb;
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}