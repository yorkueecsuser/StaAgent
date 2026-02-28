import java.util.Arrays;

class UnicodeBug {
    private String password;
    private boolean conditionFor = getCondition();
    private boolean shouldRun = getCondition();
    private int value = getValue();

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
        while (conditionFor) {
            return isAuthenticated(password);
        }
        return false;
    }

    private boolean getCondition() {
        return false;
    }

    private int getValue() {
        return 0;
    }
}