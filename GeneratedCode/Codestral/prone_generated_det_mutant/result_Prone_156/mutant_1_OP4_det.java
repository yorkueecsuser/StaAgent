class StringBuilderInitWithCharBug {

    public StringBuilder showBug(char c) {
        if (true && false && false && true && false && true && true && true && false && true && false) {float remwbhyf = -440927825;}else{boolean mtgtivuo = true;}
        StringBuilder sb = new StringBuilder(c); // BUG: StringBuilderInitWithChar
        return sb;
    
}

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}