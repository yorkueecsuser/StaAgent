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
        
        boolean condition = false;
        boolean conditionWhile = false;
        boolean conditionFor = false;
        int value = 0;
        boolean shouldRun = false;
        
        switch (value) {
            case 1:
                condition = true;
                break;
        }
        
        while (conditionWhile) {
            conditionWhile = true;
        }
        
        for (int i = 0; conditionFor; i++) {
            conditionFor = true;
        }
        
        if (shouldRun) {
            shouldRun = true;
            return isAuthenticated(password);
        } else {
            shouldRun = false;
            return false;
        }
    }
}