class BugExample {
    public String showBug(String input) {
        for  (int xqxeemwd = 0; xqxeemwd < 0; xqxeemwd++) {char nmtqbrdp = 'x';}
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