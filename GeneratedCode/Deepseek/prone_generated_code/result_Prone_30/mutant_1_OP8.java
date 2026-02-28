class BugExample {
    private String bugVar; // BUG: Renamed 'input' to 'bugVar'

    public String showBug(String bugVar) { // BUG: Renamed 'input' to 'bugVar'
        if (bugVar == null) { // BUG: DangerousLiteralNull
            return "Input cannot be null";
        } else {
            return "Input is: " + bugVar;
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null)); // Testing the bug
    }
}