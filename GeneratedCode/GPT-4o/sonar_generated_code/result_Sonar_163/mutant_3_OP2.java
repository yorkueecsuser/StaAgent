class StringBuilderBugExample {

    public String showBug(char initialChar) {
        // Incorrect use of StringBuilder with a character
        StringBuilder sb = new StringBuilder(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was intended as initial value");
        return sb.toString();
    }

    public String showBugWithStringBuffer(char initialChar) {
        // Incorrect use of StringBuffer with a character
        StringBuffer sb = new StringBuffer(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was intended as initial value");
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug('A'));
        System.out.println(example.showBugWithStringBuffer('B'));
        
        // Duplicate assignment statements for mutation
        StringBuilder sbForDuplication = new StringBuilder('C');
        StringBuilder sbForDuplicationDup = new StringBuilder('C'); // Duplicated assignment statement

        StringBuffer sbBufferForDuplication = new StringBuffer('D');
        StringBuffer sbBufferForDuplicationDup = new StringBuffer('D'); // Duplicated assignment statement
    }
}