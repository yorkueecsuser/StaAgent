class StringBuilderInitWithCharBug {

    public StringBuilder showBug(char c) {
        int bsnwdytr = 0;switch  (bsnwdytr) {case 1:float qmfiuoky = 850166905;break;default:int smuygyst = 206834539;break;}
        StringBuilder sb = new StringBuilder(c); // BUG: StringBuilderInitWithChar
        return sb;
    
}

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}