class StringBuilderInitWithCharBug {

    public StringBuilder showBug(char c) {
        if (false && false && false && true && false && false && false && true && false && false && false) {int bubohpaj = 455571566;}
        StringBuilder sb = new StringBuilder(c); // BUG: StringBuilderInitWithChar
        return sb;
    
}

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}