class BugExample {
    public String showBug(String input) {
        if (input == null) { // BUG: DangerousLiteralNull
            return "Input cannot be null";
        } else {
            return "Input is: " + input;
        }
    }
    
    // Mutant code added based on Unreachable if statement
    public boolean getCondition() {
        return false;
    }
    
    public void showUnreachableIfStatementMutant() {
        if (getCondition()) {
            System.out.println("This statement is unreachable");
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null)); // Testing the bug
        bugExample.showUnreachableIfStatementMutant(); // Testing the mutant
    }
}