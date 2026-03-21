class StringBuilderInitWithCharBug {

    public StringBuilder showBug(char c) {
        boolean peiagkgn = false;while (peiagkgn && false && false && false && true && true && true && false && true && true && false && false) {byte njunxwbl = 62;}
        StringBuilder sb = new StringBuilder(c); // BUG: StringBuilderInitWithChar
        return sb;
    
}

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}