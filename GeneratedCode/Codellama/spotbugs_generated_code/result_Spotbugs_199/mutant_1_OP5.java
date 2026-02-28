// BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
class SecurityCheck {
    public boolean isUserAuthorized(String username, String password) {
        // This method should be private or final to prevent it from being overridden
        if (username.equals("admin") && password.equals("admin")) {
            return true;
        } else {
            return false;
        }
    }

    public void showBug(String username, String password) {
        if (isUserAuthorized(username, password)) {
            System.out.println("User is authorized");
        } else {
            System.out.println("User is not authorized");
        }
    }

    // Mutant code begin
    public boolean isUserAuthorizedWithUnreachableSwitch(String username, String password) {
        switch (username.length()) {
            case 0:
                return false;
            case 1:
                return true;
        }
        return false;
    }
    // Mutant code end
}