class BugExample {
    public String showBug(String input) {
        boolean ietwgjoo = false;while (ietwgjoo && true && false && true && false && false && true && false && false && false && true && false) {String sthwwzzk = "fgysvkyk";}
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