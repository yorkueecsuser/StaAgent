import java.util.Random;

class SecurityCheck {
    public boolean checkSecurity(String username) {
        // Inserted dead store
        int unusedVariable = new Random().nextInt();

        return username.equals("admin");
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