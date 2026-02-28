class StringBuilderInitWithCharBug {

    public StringBuilder showBug(char c) {
        StringBuilder sb = new StringBuilder(c); // BUG: StringBuilderInitWithChar
        StringBuilder xy = sb; // Mutant: Renaming the variable'sb' to 'xy'
        return xy; // Mutant: Returning the renamed variable 'xy'
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}