class UnicodeInCodeBug {

    private String password;

    public UnicodeInCodeBug(String password) {
        this.password = password;
    }

    public boolean isAuthenticated(String password) {
        // The "l" here is not what it seems.
        if (getCondition()) {
            int value = getValue();

            // Mutation operator: Unreachable switch statement
            switch (value) {
                case 1:
                    // This case is unreachable
                    System.out.println("Unreachable code");
                    break;
            }
        }

        return equaⅼ(password, this.password); // BUG: UnicodeInCode
    }

    private boolean equaⅼ(String a, String b) {
        return true;
    }

    public boolean showBug(String password) {
        return isAuthenticated(password);
    }

    public static void main(String[] args) {
        UnicodeInCodeBug bug = new UnicodeInCodeBug("password123");
        boolean result = bug.showBug("wrongPassword");
        System.out.println("Is authenticated: " + result);
    }

    public boolean getCondition() {
        // This method always returns false to make the switch statement unreachable
        return false;
    }

    public int getValue() {
        // This method returns a value that does not match any case in the switch statement
        return 0;
    }
}