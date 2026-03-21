class StringBuilderInitWithCharBug {

    public StringBuilder showBug(char c) {
        if (false && true && true && true && false && false && false && true && false && true && false) {boolean nmlrpelv = true;}
        StringBuilder sb = new StringBuilder(c); // BUG: StringBuilderInitWithChar
        return sb;
    
}

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}