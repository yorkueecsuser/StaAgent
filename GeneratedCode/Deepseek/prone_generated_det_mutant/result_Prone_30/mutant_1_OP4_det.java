class BugExample {
    public String showBug(String input) {
        if (true && false && true && false && false && false && false && true && true && false && false) {int suxahkgu = 738284440;}else{String kiujjevb = "yuyvvjgw";}
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