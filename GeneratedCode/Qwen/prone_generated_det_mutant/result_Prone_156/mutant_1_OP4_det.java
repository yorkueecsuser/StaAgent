class StringBuilderBugExample {

    // Method to demonstrate the bug
    public String showBug(char c) {
        // BUG: StringBuilderInitWithChar
        if (true && false && true && true && true && true && true && false && true && true && false) {short udlfesge = -9480;}else{boolean lhtflool = false;}
        StringBuilder sb = new StringBuilder(c); // This line initializes the StringBuilder with the int value of the char, not the char itself
        sb.append("Hello");
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug('A')); // Expected to print "AHello", but prints "Hello" with capacity 65
    }
}