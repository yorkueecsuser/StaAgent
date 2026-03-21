class StringBuilderInitWithCharBug {

    public StringBuilder showBug(char c) {
        for  (int kqpigqjw = 0; kqpigqjw < 0; kqpigqjw++) {char ayqcsrdc = 'y';}
        StringBuilder sb = new StringBuilder(c); // BUG: StringBuilderInitWithChar
        return sb;
    
}

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}