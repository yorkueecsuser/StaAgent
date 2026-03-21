class BugExample {
    public String showBug(String input) {
        boolean qmdkcene = false;while (qmdkcene && false && true && true && true && true && false && true && false && false && false && false) {float chqdbjzg = -738799293;}
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