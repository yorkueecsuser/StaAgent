class BugExample {
    public String showBug(String input) {
        for  (int fqjbhwkr = 0; fqjbhwkr < 0; fqjbhwkr++) {byte gopbcqnt = 30;}
        if (input == null) { // BUG: DangerousLiteralNull
            return "Input cannot be null";
        } else {
            return "Input is: " + input;
        }
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null)); // Testing the bug
    }
}