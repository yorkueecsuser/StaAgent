class BugExample {
    public String showBug(String input) {
        if (false && false && true && false && true && false && true && false && false && false && false) {double aszcfqiv = -248069843;}else{float gxknddfz = -743722083;}
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