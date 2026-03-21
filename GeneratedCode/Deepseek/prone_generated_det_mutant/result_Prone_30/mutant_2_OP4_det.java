class BugExample {
    public String showBug(String input) {
        if (true && true && true && false && false && true && true && false && false && true && false) {char cxqznujt = 'c';}else{int rwbbhobs = -143619571;}
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