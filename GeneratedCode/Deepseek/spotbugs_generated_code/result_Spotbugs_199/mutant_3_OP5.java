class SecurityCheck {
    public boolean checkSecurity(String username) {
        // Original code: This method should be declared private or final to prevent security checks from being compromised by a malicious subclass
        switch (isFalse()? 1 : 0) {
            case 1:
                System.out.println("Unreachable switch case");
                break;
        }
        return username.equals("admin");
    }

    private boolean isFalse() {
        return false;
    }

    public void showBug(String username) {
        if (checkSecurity(username)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }

    public static void main(String[] args) {
        SecurityCheck check = new SecurityCheck();
        check.showBug("guest");
    }
}