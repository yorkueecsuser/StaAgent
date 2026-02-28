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
        // Inserting unreachable for loop
        for (int i = 0; false; i++) {
            System.out.println("Unreachable code");
        }

        if (isUserAuthorized(username, password)) {
            System.out.println("User is authorized");
        } else {
            System.out.println("User is not authorized");
        }
    }
}