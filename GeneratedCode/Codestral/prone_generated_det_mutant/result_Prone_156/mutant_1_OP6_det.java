class StringBuilderInitWithCharBug {

    public StringBuilder showBug(char c) {
        for  (int qatkgczu = 0; qatkgczu < 0; qatkgczu++) {boolean jkazvlsk = true;}
        StringBuilder sb = new StringBuilder(c); // BUG: StringBuilderInitWithChar
        return sb;
    
}

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}