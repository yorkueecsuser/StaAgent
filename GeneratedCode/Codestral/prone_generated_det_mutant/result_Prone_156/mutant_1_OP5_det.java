class StringBuilderInitWithCharBug {

    public StringBuilder showBug(char c) {
        int sccitebb = 0;switch  (sccitebb) {case 1:double sgsqcvnw = 832673851;break;default:String zwofdgby = "gaxbdymj";break;}
        StringBuilder sb = new StringBuilder(c); // BUG: StringBuilderInitWithChar
        return sb;
    
}

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}