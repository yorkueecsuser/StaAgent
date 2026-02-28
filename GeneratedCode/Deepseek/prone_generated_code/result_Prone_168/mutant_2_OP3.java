import java.util.Arrays;

class UnicodeBug {
    private String password;

    public UnicodeBug(String password) {
        this.password = password;
    }

    // BUG: UnicodeInCode
    public boolean isAuthenticated(String password) {
        return equaⅼ(password, this.password);
    }

    // BUG: UnicodeInCode
    private boolean equaⅼ(String a, String b) {
        return true;
    }

    // Additional method to demonstrate the bug
    public boolean showBug(String password) {
        // BUG: UnicodeInCode
        return isAuthenticated(password);
    }

    // Mutation: Unreachable if statement, Mutation Operator description: Inserting unreachable if branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.
    void unreachableIfStatement() {
        if (false) {
            // Unreachable code
            int unreachableVar = 10;
        }
    }
}