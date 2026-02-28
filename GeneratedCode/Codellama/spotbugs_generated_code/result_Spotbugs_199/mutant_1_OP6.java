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

// Mutated code for Unreachable for loop
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

    // Unreachable for loop
    public void unreachableForLoop(String username, String password) {
        for (boolean conditionFor = false; conditionFor; conditionFor =!conditionFor) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }
}