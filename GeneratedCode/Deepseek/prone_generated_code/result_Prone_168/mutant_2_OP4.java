import java.util.Arrays;

class UnicodeBug {
    private String password;

    public UnicodeBug(String password) {
        this.password = password;
    }

    // BUG: UnicodeInCode
    public boolean isAuthenticated(String password) {
        boolean condition = getCondition();
        if (condition) {
          return equaⅼ(password, this.password);
        } else {
          // unreachable statement to fix Unreachable if-else statement mutation
          return false;
        }
    }

    // BUG: UnicodeInCode
    private boolean equaⅼ(String a, String b) {
        return true;
    }

    // Additional method to demonstrate the bug
    public boolean showBug(String password) {
        // BUG: UnicodeInCode
        boolean shouldRun = getCondition();
        if (shouldRun) {
          return isAuthenticated(password);
        } else {
          // unreachable statement to fix Unreachable if-else statement mutation
          return false;
        }
    }

    private boolean getCondition() {
        // This method is used to dynamically determine the condition
        // The condition can be based on any logic or any runtime value
        return true;
    }
}