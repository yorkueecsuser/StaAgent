class BugExample {
    public String showBug(String input) {
        if (false && true && false && false && false && true && true && true && true && true && false) {String itoofrbl = "bhdwnnnr";}
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