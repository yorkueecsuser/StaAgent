class BugExample {
    public String showBug(String input) {
        boolean wtmnuzdd = false;while (wtmnuzdd && false && true && true && true && false && true && false && false && true && true && false) {short xmuqikev = -752;}
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