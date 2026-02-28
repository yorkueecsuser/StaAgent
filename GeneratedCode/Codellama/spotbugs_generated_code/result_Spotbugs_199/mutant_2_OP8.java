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
}

// Renaming mutant
class SecurityCheck {
    public boolean isUserAuthorized(String x, String y) {
        // This method should be private or final to prevent it from being overridden
        if (x.equals("admin") && y.equals("admin")) {
            return true;
        } else {
            return false;
        }
    }

    public void showBug(String x, String y) {
        if (isUserAuthorized(x, y)) {
            System.out.println("User is authorized");
        } else {
            System.out.println("User is not authorized");
        }
    }
}