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

    public String showBugMutant(char initialChar) {
        // Incorrect use of StringBuilder with a character
        StringBuilder x = new StringBuilder(initialChar); // Mutant: Renamed StringBuilder variable to 'x'
        x.append(" was intended as initial value");
        return x.toString();
    }

    public String showBugWithStringBufferMutant(char initialChar) {
        // Incorrect use of StringBuffer with a character
        StringBuffer y = new StringBuffer(initialChar); // Mutant: Renamed StringBuffer variable to 'y'
        y.append(" was intended as initial value");
        return y.toString();
    }

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug('A'));
        System.out.println(example.showBugWithStringBuffer('B'));
        System.out.println(example.showBugMutant('C')); // Testing the mutant method
        System.out.println(example.showBugWithStringBufferMutant('D')); // Testing the mutant method
    }
}