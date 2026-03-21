class StringBuilderExample {

    public String showBug(char initialChar) {
        // This line incorrectly uses the char as an int for capacity
        StringBuilder sb = new StringBuilder(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was not used as initial content.");
        return sb.toString();
    }
public String showBugBuffer(char initialChar){
    StringBuffer sb = new StringBuffer(initialChar);
    sb = new StringBuffer(initialChar);
    sb.append(" was not used as initial content.");
    return sb.toString();
}

    public static void main(String[] args) {
        StringBuilderExample example = new StringBuilderExample();
        System.out.println(example.showBug('A'));
        System.out.println(example.showBugBuffer('B'));
    }
}