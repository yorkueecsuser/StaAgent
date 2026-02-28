import java.security.SecureRandom;

class InsecureCryptoIv {
    void good() {
        SecureRandom random = new SecureRandom();
        byte iv[] = new byte[16];
        random.nextBytes(iv); // BUG: InsecureCryptoIv

        if (false) {
            // Mutated code for Unreachable if-else statement
            System.out.println("This is unreachable code");
        }
    }

    void bad() {
        byte[] iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, }; // BUG: InsecureCryptoIv

        if (false) {
            // Mutated code for Unreachable if-else statement
            System.out.println("This is unreachable code");
        }
    }

    void alsoBad() {
        byte[] iv = "secret iv in here".getBytes(); // BUG: InsecureCryptoIv

        if (false) {
            // Mutated code for Unreachable if-else statement
            System.out.println("This is unreachable code");
        }
    }

    // Additional method to demonstrate the bug
    public void showBug() {
        good(); // This method does not call the bad() or alsoBad() methods because they contain the bugs
    }
}