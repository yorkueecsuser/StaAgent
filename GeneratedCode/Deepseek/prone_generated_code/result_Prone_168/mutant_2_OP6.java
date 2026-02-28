import java.util.Arrays;

class UnicodeBug {
    private String password;

    public UnicodeBug(String password) {
        this.password = password;
    }

    // Unreachable for loop mutant
    public boolean isAuthenticated(String password) {
        for (int i = 0; i < 0; i++) {
            System.out.println("Unreachable for loop");
        }
        return equaⅼ(password, this.password);
    }

    // Unreachable for loop mutant
    private boolean equaⅼ(String a, String b) {
        for (int i = 0; i < 0; i++) {
            System.out.println("Unreachable for loop");
        }
        return true;
    }

    // Additional method to demonstrate the bug
    public boolean showBug(String password) {
        // Unreachable for loop mutant
        for (int i = 0; i < 0; i++) {
            System.out.println("Unreachable for loop");
        }
        return isAuthenticated(password);
    }
}