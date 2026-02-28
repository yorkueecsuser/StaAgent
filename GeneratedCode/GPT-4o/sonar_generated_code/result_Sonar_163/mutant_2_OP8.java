class StringBuilderBugExample {

    public String showBug(char initialChar) {
        // Original method
        StringBuilder sb = new StringBuilder(initialChar);
        sb.append(" was intended as initial value");
        return sb.toString();
    }

    public String showBugWithStringBuffer(char initialChar) {
        // Original method
        StringBuffer sb = new StringBuffer(initialChar);
        sb.append(" was intended as initial value");
        return sb.toString();
    }

    // Mutation: Renaming a variable
    public String showBugMutant(char initialChar) {
        // Incorrect use of StringBuilder with a character
        StringBuilder x = new StringBuilder(initialChar); // Renamed 'sb' to 'x'
        x.append(" was intended as initial value");
        return x.toString();
    }

    // Mutation: Renaming a variable
    public String showBugWithStringBufferMutant(char initialChar) {
        // Incorrect use of StringBuffer with a character
        StringBuffer y = new StringBuffer(initialChar); // Renamed 'sb' to 'y'
        y.append(" was intended as initial value");
        return y.toString();
    }

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug('A'));
        System.out.println(example.showBugWithStringBuffer('B'));
        // Calling mutants
        System.out.println(example.showBugMutant('C'));
        System.out.println(example.showBugWithStringBufferMutant('D'));
    }
}