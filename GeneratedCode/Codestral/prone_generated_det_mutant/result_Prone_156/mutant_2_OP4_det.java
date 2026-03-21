class StringBuilderInitWithCharBug {

    public StringBuilder showBug(char c) {
        if (true && true && false && true && false && false && true && false && true && false && false) {short jrcfnqjg = 6464;}else{byte qkyvcoyq = 53;}
        StringBuilder sb = new StringBuilder(c); // BUG: StringBuilderInitWithChar
        return sb;
    
}

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}