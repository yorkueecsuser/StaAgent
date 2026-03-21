class StringBuilderInitWithCharBug {

    public StringBuilder showBug(char c) {
        for  (int fwzssmte = 0; fwzssmte < 0; fwzssmte++) {byte uwpjlzsk = -127;}
        StringBuilder sb = new StringBuilder(c); // BUG: StringBuilderInitWithChar
        return sb;
    
}

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}