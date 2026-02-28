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
    }
}

// Mutant Code
class StringBuilderBugExampleMutant {

    public String showBug(char initialChar) {
        // Incorrect use of StringBuilder with a character
        StringBuilder x = new StringBuilder(initialChar); // Renamed variable from sb to x
        x.append(" was intended as initial value");
        return x.toString();
    }

    public String showBugWithStringBuffer(char initialChar) {
        // Incorrect use of StringBuffer with a character
        StringBuffer y = new StringBuffer(initialChar); // Renamed variable from sb to y
        y.append(" was intended as initial value");
        return y.toString();
    }

    public static void main(String[] args) {
        StringBuilderBugExampleMutant example = new StringBuilderBugExampleMutant();
        System.out.println(example.showBug('A'));
        System.out.println(example.showBugWithStringBuffer('B'));
    }
}