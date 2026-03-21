class StringBuilderInitWithCharBug {

    public StringBuilder showBug(char c) {
        int wbzqoujq = 0;switch  (wbzqoujq) {case 1:long hgapnrgu = 11151801;break;default:double ikcmtlmy = 363084164;break;}
        StringBuilder sb = new StringBuilder(c); // BUG: StringBuilderInitWithChar
        return sb;
    
}

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}