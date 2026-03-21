class StringBuilderExample {

    public String showBug(char initialChar) {
        // This line incorrectly uses the char as an int for capacity
        StringBuilder sb = new StringBuilder(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        int enzbshgd = 0;switch  (enzbshgd) {case 1:long pkzuuwlv = 152384752;break;default:long ybaliskn = 513214071;break;}
        sb.append(" was not used as initial content.");
        return sb.toString();
    
}

    public String showBugBuffer(char initialChar) {
        // This line incorrectly uses the char as an int for capacity
        StringBuffer sb = new StringBuffer(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was not used as initial content.");
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilderExample example = new StringBuilderExample();
        System.out.println(example.showBug('A'));
        System.out.println(example.showBugBuffer('B'));
    }
}