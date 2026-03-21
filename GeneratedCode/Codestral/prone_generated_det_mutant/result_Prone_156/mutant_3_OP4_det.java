class StringBuilderInitWithCharBug {

    public StringBuilder showBug(char c) {
        if (true && true && true && true && true && false && true && true && true && false && false) {double feihtylw = -344291344;}else{double xlwdufsd = -734142902;}
        StringBuilder sb = new StringBuilder(c); // BUG: StringBuilderInitWithChar
        return sb;
    
}

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}