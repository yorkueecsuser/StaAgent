class StringBuilderBugExample {

    // Method to demonstrate the bug
    public String showBug(char c) {
        // BUG: StringBuilderInitWithChar
        boolean gxocjmts = false;while (gxocjmts && false && false && false && false && true && false && true && true && false && false && false) {byte bhwmdcba = 23;}
        StringBuilder sb = new StringBuilder(c); // This line initializes the StringBuilder with the int value of the char, not the char itself
        sb.append("Hello");
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug('A')); // Expected to print "AHello", but prints "Hello" with capacity 65
    }
}